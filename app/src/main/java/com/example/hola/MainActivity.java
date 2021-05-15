package com.example.hola;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutApp(View view) {
        Intent intent = new Intent(this,about_app.class);
        startActivity(intent);

    }

    public void otherApps(View view) {
        Intent intent2 = new Intent(this,otherApps.class);
        startActivity(intent2);
    }

    public void playSongs(View view) {
        Intent intent3 = new Intent(this,playSongs.class);
        startActivity(intent3);
    }

    public void playVideos(View view) {
        Toast.makeText(this,"Coming Soon...",Toast.LENGTH_SHORT).show();
    }

    public void developerInfo(View view) {
        Intent intent5 = new Intent(this,developer.class);
        startActivity(intent5);
    }

    public void sendFeedback(View view) {
        Intent intent4 = new Intent(this,feedback.class);
        startActivity(intent4);

    }
}