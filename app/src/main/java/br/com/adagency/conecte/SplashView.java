package br.com.adagency.conecte;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashView extends AppCompatActivity {

    private static int SPLASH_TIMEOUT = 3000;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        context = this;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(context, LoginMainView.class);
                startActivity(intent);
                finish();

            }
        }, SPLASH_TIMEOUT);

    }
}
