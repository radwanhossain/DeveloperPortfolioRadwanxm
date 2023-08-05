package com.example.startup.ui.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.startup.MainActivity;
import com.example.startup.R;
import com.example.startup.ui.HomeActivity;
import com.radwanxm.radwanxm.LaunchActivity;
import com.radwanxm.radwanxm.RavenClaw;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        RavenClaw.openApp(this);
        ImageView image = (ImageView)findViewById(R.id.imageView);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
        image.startAnimation(animation1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                RavenClaw.openApp(SplashActivity.this);
//                startActivity(new Intent(SplashActivity.this, LaunchActivity.class));
//                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                finish();
            }
        },2000);
    }
}