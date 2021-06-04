package com.scoreboot.tutorialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.scoreboot.simpledata.SPData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SPData.init(this);

        SPData.setBoolean("key",true);

        boolean b=SPData.getBoolean("key",true);
    }
}
