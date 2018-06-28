package com.detao.mymediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

public class SplashActivity extends AppCompatActivity {

    //    是否启动过主页面
    private boolean isStartMain = false;
    private static final String TAG = SplashActivity.class.getSimpleName();
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.e(TAG, "run: " + Thread.currentThread().getName());
                startMainActivity();
            }
        }, 3000);
    }

    private void startMainActivity() {
        if (!isStartMain) {
            isStartMain = true;
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
        //把消息队列里面的所有回调和消息移除
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        startMainActivity();
        return super.onTouchEvent(event);
    }
}
