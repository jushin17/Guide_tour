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
public class TaipeiMapFragment extends SupportMapFragment {
    GoogleMap mGoogleMap;
    LatLng loc = new LatLng(25.034185, 121.564649); // set Latitude , longitude
    MarkerOptions marker = new MarkerOptions().position(loc); // mark default marker at google map
    CameraPosition cp = new CameraPosition.Builder().target((loc)).zoom(16).build(); // set camera zoom , state
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
