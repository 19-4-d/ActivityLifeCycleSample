package com.websarva.wings.android.activitylifecyclesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycleInfo", "【Sub】 onCreate() が呼び出されました");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_sample_sub);
    }

    @Override
    public void onStart() {
        Log.i("LifeCycleInfo", "【Sub】 onStart() が呼び出されました");
        super.onStart();
    }

    @Override
    public void onRestart() {
        Log.i("LifeCycleInfo", "【Sub】 onRestart() が呼び出されました");
        super.onRestart();
    }

    @Override
    public void onResume() {
        Log.i("LifeCycleInfo", "【Sub】 onResume() が呼び出されました");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("LifeCycleInfo", "【Sub】 onPause() が呼び出されました");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("LifeCycleInfo", "【Sub】 onStop() が呼び出されました");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.i("LifeCycleInfo", "【Sub】 onDestroy() が呼び出されました ----------");
        super.onDestroy();
    }

    /**
     * 戻るボタン タップ時の処理
     */
    public void onButtonClick(View view) {
        finish();
    }
}
