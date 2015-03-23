package com.example.shinjiung.guide_tour;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by shinjiung on 3/13/15.
 */
public class YehliuInfoFragment extends Fragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.yehliu_info, container, false);


        WebView mWebView = (WebView) view.findViewById(R.id.yeliu_web);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("http://www.ylgeopark.org.tw/KOR/info/YlIntroduction_kr.aspx");
        mWebView.setWebViewClient(new WebClient());
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setSupportZoom(true);

        return view;

    }


    private class WebClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            return false;

        }

    }
}
