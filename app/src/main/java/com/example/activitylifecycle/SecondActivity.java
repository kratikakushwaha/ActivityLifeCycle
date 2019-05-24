package com.example.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    String TAG = "msg";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);



        button = findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
                SecondActivity.this.finish();

            }
        });
        Log.i(TAG, "is method onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "2 is method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "2 is method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "2 is method onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, " 2 is method on Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "2 is method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "2 is method onDestroy");
    }
}


