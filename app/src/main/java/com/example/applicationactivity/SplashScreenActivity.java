package com.example.applicationactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ContentInfoCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.applicationactivity.util.PreferencesHelper;

public class SplashScreenActivity extends AppCompatActivity {
    public static final String TAG = "SplashScreen";
    PreferencesHelper preferencesHelper;
    private Button btnFirstAct;
    private EditText enNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        preferencesHelper = PreferencesHelper.getInstance(getApplicationContext());
        btnFirstAct = findViewById(R.id.btnFirstAct);
        enNama = findViewById(R.id.enNama);

        btnFirstAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preferencesHelper.setLogin(true);
                preferencesHelper.setNama(enNama.getText().toString());
                Intent homeIntent = new Intent(SplashScreenActivity.this, FirstActivity.class);
                // homeIntent.putExtra("nama", enNama.getText().toString());
                startActivity(homeIntent);
            }
        });

//        int splashInterval = 5000;
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(SplashScreenActivity.this, HomeActivity.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                startActivity(intent);
//            }
//        }, splashInterval);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }
}