package com.example.shinjiung.guide_tour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
/**
 * Created by shinjiung on 3/13/15.
 * activate upper fragment for use button
 */
public class TaipeiHeadFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.taipei_header, container, false);

    }

}
