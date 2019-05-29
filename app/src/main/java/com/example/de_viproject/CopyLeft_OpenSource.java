package com.example.de_viproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CopyLeft_OpenSource extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.CopyLeft_OpenSource);
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("file://android_asset/www/copyleft.html");
    }
}
