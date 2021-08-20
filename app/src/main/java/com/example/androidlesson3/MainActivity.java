package com.example.androidlesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnOpenSecondActiovity;
Button btnShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOpenSecondActiovity = findViewById(R.id.btn_open_second_actovity);

        btnOpenSecondActiovity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);



            }
        });

    }
}