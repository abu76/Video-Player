package com.a.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button s1,s2,s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        s3=findViewById(R.id.s3);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AndroidTrick.video_url="https://www.youtube.com/embed/_Mb2ijMu7hc";
                Intent myIntent = new Intent(MainActivity.this,AndroidTrick.class);
                startActivity(myIntent);
            }
        });

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AndroidTrick.video_url="https://www.youtube.com/embed/t2sGK0riETE";
                Intent mymIntent = new Intent(MainActivity.this,AndroidTrick.class);
                startActivity(mymIntent);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AndroidTrick.video_url="https://www.youtube.com/embed/XzZibhXCCe4";
                Intent myIntent = new Intent(MainActivity.this,AndroidTrick.class);
                startActivity(myIntent);
            }
        });
    }
}