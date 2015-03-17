package com.example.shinjiung.guide_tour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Window;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.app.FragmentManager;
/**
 * Created by shinjiung on 3/13/15.
 */
public class TaipeiHeadFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.taipei_header, container, false);

    }

}
