package com.detao.mymediaplayer.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.detao.mymediaplayer.R;

public class BaseActivity extends AppCompatActivity {

    public void initView() {
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initView();
    }


}

