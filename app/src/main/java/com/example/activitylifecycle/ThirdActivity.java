package com.example.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    String TAG="msg";

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);


        button=findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdActivity.this,MainActivity.class));
            }
        });
        Log.i(TAG,"3 is method onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"3 is method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG," 3 is method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"3 is method onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"3 is method on Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"3 is method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"3 is method onDestroy");
    }
}


