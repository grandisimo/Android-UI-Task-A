package com.example.taska;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.layoutsexercise.R;


public class SplashScreenActivity extends Activity {

    private static final String TAG = "SplashScreenActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        navigateToMainActivity(3000);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    private void syncData(){


    }

    private void navigateToMainActivity(int time){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, time);
    }


}
