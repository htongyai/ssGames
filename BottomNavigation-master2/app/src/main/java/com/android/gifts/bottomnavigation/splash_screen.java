package com.android.gifts.bottomnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.android.gifts.bottomnavigation.FourButtonsActivity;
import com.android.gifts.bottomnavigation.R;

import java.util.Timer;
import java.util.TimerTask;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen2);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                launchMain();
            }
        }, 2000);
    }



    public void launchMain(){
        Intent intent = new Intent(splash_screen.this, FourButtonsActivity.class);
        startActivity(intent);
    }

}
