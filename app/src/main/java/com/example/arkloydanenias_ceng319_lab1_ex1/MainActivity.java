package com.example.arkloydanenias_ceng319_lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction()
                .replace(R.id.container, new List())
                .commit();
    }

    public void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Welcome to Android Studio", Toast.LENGTH_SHORT).show();
    }


}