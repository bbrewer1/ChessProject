package com.example.chessproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button buttonAbout = findViewById(R.id.aboutButton);
        Button buttonGame = findViewById(R.id.startButton);

        buttonAbout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View V) {
               moveToAbout();
           }
        });

        buttonGame.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View V) {
               moveToGame();
           }
        });
    }

    private void moveToAbout() {
        Intent intent = new Intent(MainActivity.this, about_page.class);
        startActivity(intent);
    }

    private void moveToGame() {
        Intent intent = new Intent(MainActivity.this, game.class);
        startActivity(intent);
    }
}

