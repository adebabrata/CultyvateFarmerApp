package com.hexonglobal.apps.cultyvatefarmerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingPage extends AppCompatActivity {

    Button image,audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        image=(Button)findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentImageCapture = new Intent(LandingPage.this,ImageCapture.class);
                startActivity(intentImageCapture);
            }
        });

        audio=(Button)findViewById(R.id.audio);
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAudioCapture= new Intent(LandingPage.this,AudioCapture.class);
                startActivity(intentAudioCapture);
            }
        });
    }
}
