package jjmpoly.prathameshmore.com.co_jjmpoly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class TechNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_news);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



         WebView webViewTechNews1 = (WebView) findViewById(R.id.webView_News1);
        WebView webViewTechNews2 = (WebView) findViewById(R.id.webView_News2);
        WebView webViewTechNews3 = (WebView) findViewById(R.id.webView_News3);
        WebView webViewTechNews4 = (WebView) findViewById(R.id.webView_News4);
        WebView webViewTechNews5 = (WebView) findViewById(R.id.webView_News5);
        WebView webViewTechNews6 = (WebView) findViewById(R.id.webView_News6);
        WebView webViewTechNews7 = (WebView) findViewById(R.id.webView_News7);
        WebView webViewTechNews8 = (WebView) findViewById(R.id.webView_News8);
        WebView webViewTechNews9 = (WebView) findViewById(R.id.webView_News9);
        WebView webViewTechNews10 = (WebView) findViewById(R.id.webView_News10);
        WebView webViewTechNews11 = (WebView) findViewById(R.id.webView_News11);
        {
            webViewTechNews1.loadUrl("http://www.theverge.com");
        }

        {

            webViewTechNews2.loadUrl("http://www.cnet.com");
        }

        {

            webViewTechNews3.loadUrl("http://www.techcrunch.com");
        }

        {

            webViewTechNews4.loadUrl("http://www.gizmodo.com");
        }

        {

            webViewTechNews5.loadUrl("http://www.thenextweb.com");
        }

        {

            webViewTechNews6.loadUrl("http://www.wired.com");
        }

        {
            webViewTechNews7.loadUrl("http://www.mashable.com");
        }

        {
            webViewTechNews8.loadUrl("http://www.tech2.com");
        }

        {
            webViewTechNews9.loadUrl("http://www.digitaltrends.com");
        }

        {
            webViewTechNews10.loadUrl("http://www.techradar.com");
        }

        {
            webViewTechNews11.loadUrl("http://www.computingworld.wordpress.com");
        }
    }

}
