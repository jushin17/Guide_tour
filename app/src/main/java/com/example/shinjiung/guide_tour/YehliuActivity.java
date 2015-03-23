package com.example.shinjiung.guide_tour;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;


/**
 * Created by shinjiung on 3/13/15.
 */
public class YehliuActivity extends FragmentActivity {

    private YehliuMapFragment map;
    private YehliuInfoFragment info;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yehliu_main);

        map = new YehliuMapFragment();
        info = new YehliuInfoFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.yehliu_map_web, map).commit();

    }


    public void onClick(View view) {
        if (view == findViewById(R.id.button_yehliu_info)) {
            getSupportFragmentManager().beginTransaction().remove(map).commit();
            getFragmentManager().beginTransaction().add(R.id.yehliu_map_web,info).commit();

        } else if(view == findViewById(R.id.button_yehliu_map)) {
            getFragmentManager().beginTransaction().remove(info).commit();
            getSupportFragmentManager().beginTransaction().add(R.id.yehliu_map_web, map).commit();


        }
    }
    // when people go back to main activity, notice prior city
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Yehliu Activity Exit", Toast.LENGTH_SHORT).show();
    }

}
