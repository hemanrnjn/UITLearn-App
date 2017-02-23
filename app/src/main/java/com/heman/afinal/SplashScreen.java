package com.heman.afinal;

/**
 * Created by Himanshu on 04-12-2016.
 */

import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;

public class SplashScreen extends Activity{

    private static int SPLASH_TIME_OUT=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread loading = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                    Intent main = new Intent(SplashScreen.this,LoginActivity.class);
                    startActivity(main);
                    finish();


                }

                catch (Exception e) {
                    e.printStackTrace();
                }

                finally {
                    finish();
                }
            }
        };

        loading.start();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run(){
                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                SplashScreen.this.startActivity(i);
                SplashScreen.this.finish();
            }
        }, SPLASH_TIME_OUT);
    }

}

