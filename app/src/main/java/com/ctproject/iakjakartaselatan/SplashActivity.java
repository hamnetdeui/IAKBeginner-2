package com.ctproject.iakjakartaselatan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by farhan on 4/8/16.
 */
public class SplashActivity extends AppCompatActivity {

    private int DURASI = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pindah;
                pindah = new Intent(SplashActivity.this, HitungActivity.class);
                SplashActivity.this.startActivity(pindah);
                SplashActivity.this.finish();
            }
        }, DURASI);

    }
}
