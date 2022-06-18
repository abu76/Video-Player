package com.a.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class AndroidTrick extends AppCompatActivity {
WebView tricks1;
public static String video_url= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_trick);

        tricks1=findViewById(R.id.tricks1);
        tricks1.getSettings().setJavaScriptEnabled(true);
        tricks1.loadUrl(video_url);

    }
}