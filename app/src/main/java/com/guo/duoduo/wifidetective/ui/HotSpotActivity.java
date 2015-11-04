package com.guo.duoduo.wifidetective.ui;


import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.guo.duoduo.wifidetective.R;


public class HotSpotActivity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_spot);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
