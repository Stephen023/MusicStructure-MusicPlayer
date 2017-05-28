package com.example.android.musicstructure_musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set the content of the activity to use the activity_playlist.xml layout file
        setContentView(R.layout.activity_playlist);

        // Find the View that shows the Best Hits category
        TextView bestHits = (TextView) findViewById(R.id.best_hits);

        // Set a click listener on that View
        bestHits.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the Playing activity
                Intent bestHitsIntent = new Intent(Playlist.this, Playing.class);
                startActivity(bestHitsIntent);
            }
        });

        // Find the View that shows the Soundtracks category
        TextView soundtracks = (TextView) findViewById(R.id.soundtracks);

        // Set a click listener on that View
        soundtracks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the Playing activity
            public void onClick(View view) {
                // Start the Playing activity
                Intent soundtracksIntent = new Intent(Playlist.this, Playing.class);
                startActivity(soundtracksIntent);
            }
        });

        // Find the View that shows the Rock Songs category
        TextView rock = (TextView) findViewById(R.id.rock);

        // Set a click listener on that View
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the Playing activity
                Intent rockIntent = new Intent(Playlist.this, Playing.class);
                startActivity(rockIntent);
            }
        });

        // Find the View that shows the Rap Songs category
        TextView rap = (TextView) findViewById(R.id.rap);

        // Set a click listener on that View
        rap.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the Playing activity
                Intent rapIntent = new Intent(Playlist.this, Playing.class);
                startActivity(rapIntent);
            }
        });

        // Find the View that shows the Hip Hop Songs category
        TextView hiphop = (TextView) findViewById(R.id.hiphop);

        // Set a click listener on that View
        hiphop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the Playing activity
                Intent hiphopIntentIntent = new Intent(Playlist.this, Playing.class);
                startActivity(hiphopIntentIntent);
            }
        });

        // Find the View that shows the Add playlist Songs category
        TextView addplaylist = (TextView) findViewById(R.id.add_playlist);

        // Set a click listener on that View
        addplaylist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the NowPlaying activity
            public void onClick(View view) {
                // Start the Playing activity
                Intent addplaylistIntentIntent = new Intent(Playlist.this, Playing.class);
                startActivity(addplaylistIntentIntent);
            }
        });
    }

}
