package com.example.shinjiung.guide_tour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by shinjiung on 3/13/15.
 */
public class TaipeiMapFragment extends Fragment {

    GoogleMap mGoogleMap;
    LatLng loc = new LatLng(25.046536,121.517532); // 위치 좌표 설정
    CameraPosition cp = new CameraPosition.Builder().target((loc)).zoom(16).build();
    MarkerOptions marker = new MarkerOptions().position(loc); // 구글맵에 기본마커 표시

    private SupportMapFragment fragment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.taipei_map, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FragmentManager fm = getChildFragmentManager();
        fragment = (SupportMapFragment) fm.findFragmentById(R.id.map);
        if (fragment == null) {
            fragment = SupportMapFragment.newInstance();
            fm.beginTransaction().replace(R.id.map, fragment).commit();
        }
    }
    /*
    @Override
    public void onResume() {
        super.onResume();
        if (mGoogleMap == null) {
            mGoogleMap = fragment.getMap();
            mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)));
        }
    }
    */
}
