package com.heman.afinal;

/**
 * Created by Himanshu on 04-12-2016.
 */

import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;

import java.util.HashMap;

public class SplashScreen extends Activity{

    private static int SPLASH_TIME_OUT=5000;
    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        session = new SessionManager(getApplicationContext());

        Thread loading = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                    if(session.isLoggedIn()) {

                        // get user data from session
                        HashMap<String, String> user = session.getUserDetails();

                        // name
                        String name = user.get(SessionManager.KEY_NAME);

                        // email
                        String email = user.get(SessionManager.KEY_EMAIL);

                        String branch = user.get(SessionManager.KEY_BRANCH);

                        Intent main = new Intent(SplashScreen.this, UserActivity.class);
                        main.putExtra("user", name);
                        main.putExtra("branch", branch);
                        startActivity(main);
                        finish();
                    }
                    else{
                        Intent main = new Intent(SplashScreen.this, LoginActivity.class);
                        main.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        main.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        main.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(main);
                        finish();
                    }


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


        /*new Handler().postDelayed(new Runnable() {

            @Override
            public void run(){
                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                SplashScreen.this.startActivity(i);
                SplashScreen.this.finish();
            }
        }, SPLASH_TIME_OUT);*/
    }

}

