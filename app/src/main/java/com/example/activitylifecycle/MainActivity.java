package com.example.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG="msg";

Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
        Log.i(TAG,"is method onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"is method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"is method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"is method onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"is method on Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"is method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"is method onDestroy");
    }
}
