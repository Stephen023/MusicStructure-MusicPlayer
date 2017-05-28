package com.example.android.musicstructure_musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Playing category
        TextView playing = (TextView) findViewById(R.id.search);

        // Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, Playing.class);

                startActivity(playingIntent);
            }
        });

        // Find the View that shows the Playlist category
        TextView playlist = (TextView) findViewById(R.id.playlist);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the family View is clicked on.

            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, Playlist.class);

                startActivity(playlistIntent);

            }
        });

        // Find the View that shows the Radio category
        TextView radio = (TextView) findViewById(R.id.radio);

        // Set a click listener on that View
        radio.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the phrases View is clicked on.

            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(MainActivity.this, Radio.class);

                startActivity(radioIntent);
            }
        });

    }
}
