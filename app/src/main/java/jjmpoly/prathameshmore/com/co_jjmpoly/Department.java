package jjmpoly.prathameshmore.com.co_jjmpoly;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Department extends AppCompatActivity {

    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        WebView webViewDepartment = (WebView) findViewById(R.id.webView_Department);
        WebSettings myWebSettings = webViewDepartment.getSettings();
        myWebSettings.setJavaScriptEnabled(true);
        webViewDepartment.loadUrl("http://www.jjmpoly.co.in/computer-engineering/");

        webViewDepartment.setWebViewClient(new WebViewClient());
    }

}
