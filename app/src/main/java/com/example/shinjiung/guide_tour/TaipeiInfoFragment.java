package com.example.shinjiung.guide_tour;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;



import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by shinjiung on 3/13/15.
 */
public class TaipeiInfoFragment extends Fragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.taipei_info, container, false);


        WebView mWebView = (WebView) view.findViewById(R.id.taipei_web);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("http://ko.m.wikipedia.org/wiki/타이페이_시");
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
