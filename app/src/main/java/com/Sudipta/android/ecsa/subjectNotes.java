package com.Sudipta.android.ecsa;

/**
 * Created by Sudipta on 07-07-2016.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by bImALesH on 29-06-2016.
 */
public class subjectNotes extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_webview, container, false);

        WebView myWebView = (WebView) rootview.findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.dropbox.com/sh/h6q56wrf2dywz1g/AABqoA7s_Lmc-IsNXtUT2oi5a?dl=0");

        return rootview;
    }

}
