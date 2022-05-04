package com.example.part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnActivity = (Button) findViewById(R.id.btnActivity);
        Button btnGoogle = (Button) findViewById(R.id.btnGoogle);


        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Part2SecondActivity.class);
                startIntent.putExtra("str", "Hello World!");
                startActivity(startIntent);
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String google ="http://www.google.com";
                Uri webAddress = Uri.parse(google);

                Intent goGoogle = new Intent(Intent.ACTION_VIEW, webAddress);


                if(goGoogle.resolveActivity(getPackageManager()) == null){
                    startActivity(goGoogle);
                }

            }
        });

    }
}