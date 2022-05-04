package com.example.part2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Part2SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2_second);

        if(getIntent().hasExtra("str")){
            TextView tv = (TextView)findViewById(R.id.textView2);
            String text = getIntent().getExtras().getString("str");
            tv.setText(text);
        }
    }
}