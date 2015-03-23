package com.example.shinjiung.guide_tour;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * Created by shinjiung on 3/13/15.
 */
public class YehliuMapFragment extends SupportMapFragment {
    GoogleMap mGoogleMap;
    LatLng loc = new LatLng(25.206963, 121.691144); // 위치 좌표 설정
    MarkerOptions marker = new MarkerOptions().position(loc); // 구글맵에 기본마커 표시
    CameraPosition cp = new CameraPosition.Builder().target((loc)).zoom(16).build();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = super.onCreateView(inflater, container, savedInstanceState);
        mGoogleMap = getMap();
        setMap();
        return v;
    }

    private void setMap() {
        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(loc));
        mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(16));
        mGoogleMap.addMarker(marker);
    }
}
