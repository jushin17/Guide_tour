package com.example.shinjiung.guide_tour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button taipei = (Button) findViewById(R.id.button_taipei);
        taipei.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {    //onClick �Լ�.

                Intent intent = new Intent(MainActivity.this, TaipeiActivity.class);    //MainActivity ��(this) sub�� .
                startActivity(intent);
            }
        });
    }


}
