package com.example.hobbytestactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signin;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("pil","-onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("pil","-onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("pil","-onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("pil","-onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("pil","-onCreate");
        signin = findViewById(R.id.signin_button);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("pil", "Sign in button pressed");
                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}