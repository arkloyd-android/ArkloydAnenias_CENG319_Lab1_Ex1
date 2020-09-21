package com.example.arkloydanenias_ceng319_lab1_ex1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class AIActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aiactivity);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
    }

    public void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
    }

    public void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    public void onDestroy( ) {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy", Toast.LENGTH_SHORT).show();
    }

}