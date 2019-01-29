package com.websarva.wings.android.activitylifecyclesample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycleInfo", "【Main】 onCreate() が呼び出されました");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_sample_main);
    }

    @Override
    public void onStart() {
        Log.i("LifeCycleInfo", "【Main】 onStart() が呼び出されました");
        super.onStart();
    }

    @Override
    public void onRestart() {
        Log.i("LifeCycleInfo", "【Main】 onRestart() が呼び出されました");
        super.onRestart();
    }

    @Override
    public void onResume() {
        Log.i("LifeCycleInfo", "【Main】 onResume() が呼び出されました");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("LifeCycleInfo", "【Main】 onPause() が呼び出されました");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("LifeCycleInfo", "【Main】 onStop() が呼び出されました");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.i("LifeCycleInfo", "【Main】 onDestroy() が呼び出されました ----------");
        super.onDestroy();
    }

    /**
     * 次へボタン タップ時の処理
     */
    public void onButtonClick(View view) {
        Intent intent = new Intent(MainActivity.this, SubActivity.class);

        startActivity(intent);
    }
}
