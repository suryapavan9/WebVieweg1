package com.example.android.webvieweg1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        w = (WebView) findViewById(R.id.webView);
        //load website on to webview
        w.loadUrl("http://skillgun.com");
        //make webview navigatable with your application
        w.setWebViewClient(new WebViewClient());
    }
    //HOW WILL YOU HANDLE BACK BUTTON

    @Override
    public void onBackPressed() {
        if(w.canGoBack())
        {
            //IF CONTROL COMES HERE,THAT MEANS GO TO PREVIOUS WEB PAGE
            w.goBack();
            return;
        }
        super.onBackPressed();
    }
}
