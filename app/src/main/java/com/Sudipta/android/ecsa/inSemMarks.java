package com.Sudipta.android.ecsa;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Sudipta on 15-07-2016.
 */
public class inSemMarks extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_webview, container, false);

        WebView myWebView = (WebView) rootview.findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.dropbox.com/sh/zvpbx2p1fo5xhfg/AADEJjFLJotByNb5iQvwkadca?dl=0");

        return  rootview;
    }


}
