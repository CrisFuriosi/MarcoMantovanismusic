//https://www.hrupin.com/2011/02/example-of-streaming-mp3-mediafile-with-android-mediaplayer-class
package com.example.cfuri.marcomantovanismusic;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class ItemDetailActivity extends Activity {

    private MediaPlayer mediaPlayer = null;
    private Handler handler = new Handler();
    private double startTime = 0;
    private SeekBar seekBar = null;
    private Runnable updateBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Link this Java file with item XML file
        setContentView(R.layout.activity_item_detail);

        // Find views in activity_item_detail XML
        TextView nameTextView = findViewById(R.id.detail_activity_item_name);
        ImageView drawableImageView = findViewById(R.id.detail_activity_item_image);
        Button playButton = findViewById(R.id.detail_activity_play_button);
        Button pauseButton = findViewById(R.id.detail_activity_pause_button);
        seekBar = findViewById(R.id.detail_activity_item_seek_bar);

        // Retrieve the data passed via itemDetailIntent intent
        int itemDetailName = getIntent().getIntExtra("item_name", 0);
        int itemDetailImage = getIntent().getIntExtra("item_image", 0);
        int itemDetailUrl = getIntent().getIntExtra("item_url", 0);
        String itemActivity = getIntent().getStringExtra("current_activity_name");

        // Assign variable content to views in activity_item_detail XML
        nameTextView.setText(getString(itemDetailName));
        drawableImageView.setImageResource(itemDetailImage);

        // Set music media player
        mediaPlayer = MediaPlayer.create(this, R.raw.bwv670);

        // Set update bar Runnable
        updateBar = new Runnable() {
            public void run() {
                startTime = mediaPlayer.getCurrentPosition();
                seekBar.setProgress((int) startTime);
                handler.postDelayed(this, 100);
            }

        };

        // Set a click listener on play Button
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button is clicked on
            @Override
            public void onClick(View playButton) {
                // start play method
                play();
            }
        });

        // Set a click listener on pause Button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button is clicked on
            @Override
            public void onClick(View pauseButton) {
                // start pause method
                pause();
            }
        });
    }

    // play method (used on play Button)
    public void play() {
        mediaPlayer.start();
        seekBar.setMax(mediaPlayer.getDuration());
        handler.postDelayed(updateBar, 100);
    }

    //pause method (used on pause Button)
    public void pause() {
        mediaPlayer.pause();
    }

}


