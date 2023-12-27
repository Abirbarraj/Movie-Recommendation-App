// app/src/main/java/com/example/movies/View/SplashScreenActivity.java
package com.example.movies.View;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movies.R;

public class SplashScreenActivity extends AppCompatActivity {

    private static final int SPLASH_TIMEOUT = 2000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Use a Handler to delay the launch of the LoginActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Show the "Start" button
                Button startButton = findViewById(R.id.btnStart);
                startButton.setVisibility(View.VISIBLE);

                // Set a click listener for the button
                startButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Start the LoginActivity
                        Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                        startActivity(intent);
                        finish(); // Close the splash screen activity
                    }
                });
            }
        }, SPLASH_TIMEOUT);
    }
}
