package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Entramos al Método onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Entramos al Método onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Entramos al Método onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Entramos al Método onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Entramos al Método onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Entramos al Método onDestroy()");
    }
}