package com.yp.readermaster.activity;

import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yp.readermaster.R;
import com.yp.readermaster.base.RxAppCompatBaseActivity;
import com.yp.readermaster.config.App;
import com.yp.readermaster.entity.TopNewsEntity;
import com.yp.readermaster.greendao.DataBean;
import com.yp.readermaster.greendao.DataBeanDao;
import com.yp.readermaster.greendao.DbCore;
import com.yp.readermaster.utils.LogUtils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.yp.readermaster.R.id.toolbar;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/29 0029 16:46
 * 新闻详情页
 */

public class NewsDetailActivity extends RxAppCompatBaseActivity {
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;
    @BindView(R.id.web_view)
    WebView webView;
    @BindView(R.id.news_detail_photo_iv)
    ImageView mNewsDetailPhotoIv;
    @BindView(R.id.mask_view)
    View mMaskView;
    @BindView(toolbar)
    Toolbar mToolbar;
    @BindView(R.id.toolbar_layout)
    CollapsingToolbarLayout mToolbarLayout;
    @BindView(R.id.app_bar)
    AppBarLayout mAppBar;
   // @BindView(fab)
   // FloatingActionButton mfab;

   @BindView(R.id.colletion_btn)
   Button colletionBtn;

    private String mUrl;
    private String mShareLink;
    private String mTitle;
    private String mHeaderImage;

    @Override
    protected int getLayoutId() {
        return R.layout.act_news_detail;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        Bundle bundle = getIntent().getExtras();
        TopNewsEntity.ResultBean.DataBean dataBean = (TopNewsEntity.ResultBean.DataBean) bundle.getSerializable("news_detail");
        mUrl = dataBean.getUrl();
        mTitle = dataBean.getTitle();
        mHeaderImage = dataBean.getThumbnail_pic_s();

        initWebView();
    }


    @Override
    protected void initToolBar() {
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    finishAfterTransition();
                } else {
                    finish();
                }
            }
        });


    }


    private void initWebView() {
        webView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                return (motionEvent.getAction() == MotionEvent.ACTION_MOVE);
            }
        });
        setWebViewSettings();
    }

    private void setWebViewSettings() {
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);

        webSettings.setAppCacheEnabled(true);
        webSettings.setCacheMode(webSettings.LOAD_CACHE_ELSE_NETWORK);
    }

    @Override
    protected void initData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Document document = Jsoup.parse(new URL(mUrl), 5000);
                    LogUtils.d("--------document-------------" + document);
                    Element j_article = document.getElementById("J_article");
                    LogUtils.d("---------Element-----------" + j_article.html());
                    Message msg = Message.obtain();
                    msg.obj = j_article.html();
                    mHandler.sendMessage(msg);
                } catch (MalformedURLException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }).start();

        setToolBarLayout(mTitle);
        App.getInstance().displayImage(mHeaderImage, mNewsDetailPhotoIv, 0, false, DiskCacheStrategy.ALL);
    }

    private DataBean mBean;

    @OnClick(R.id.colletion_btn)
    public void OnClick(View view) {

        unique(mBean.getTitle(),mBean);

    }

    private void unique(String msg,DataBean bean)//判断数据库里面的数据是否存在
    {
        boolean isHave = false;
        DataBeanDao dbDao = DbCore.getDaoSession().getDataBeanDao();
        List<DataBean> been = dbDao.loadAll();
        for (int i = 0; i < been.size(); i++)
        {
            String title = been.get(i).getTitle();
            isHave = msg.equals(title);
            break;
        }
        if (isHave)
        {
            Toast.makeText(this, "您已收藏，切勿重复添加！", Toast.LENGTH_SHORT).show();
        }else
        {
            dbDao.insert(bean);
            Toast.makeText(this, "收藏成功！", Toast.LENGTH_SHORT).show();
        }
    }

    private void setToolBarLayout(String newsTitle) {
        mToolbarLayout.setTitle(newsTitle);
        mToolbarLayout.setExpandedTitleColor(ContextCompat.getColor(this, R.color.gray_light));
        mToolbarLayout.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.primary_text_white));
    }

    @Override
    protected void onHandlerMessage(Message msg) {
        String body = (String) msg.obj;
        setWebView(body);
    }

    private void setWebView(String htmlBody) {
        String html = "<html><body>" + htmlBody + "</body></html>";
        webView.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url != null) view.loadUrl(url);
                return true;
            }
        });
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if (newProgress == 100) {
                    progressBar.setVisibility(View.GONE);
            //        mFab.setVisibility(View.VISIBLE);
                } else {
                    progressBar.setVisibility(View.VISIBLE);
                    progressBar.setProgress(newProgress);
                }
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        webView.removeAllViews();
        webView.destroy();
    }
}
