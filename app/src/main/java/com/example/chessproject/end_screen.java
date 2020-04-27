package com.example.chessproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class end_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);

        Button buttonPlayAgain = findViewById(R.id.playAgainButton);

        buttonPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                moveToMainMenu();
            }
        });
    }

    private void moveToMainMenu() {
        Intent intent = new Intent(end_screen.this, MainActivity.class);
        startActivity(intent);
    }
}
