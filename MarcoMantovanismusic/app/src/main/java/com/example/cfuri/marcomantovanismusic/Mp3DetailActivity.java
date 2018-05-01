/*
 * Mp3DetailActivity shows single item data (for Mp3 Audio files).
 * Reference for pdf download code: http://www.androidsnippets.com/open-any-type-of-file-with-default-intent.html
 */

package com.example.cfuri.marcomantovanismusic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Mp3DetailActivity extends AppCompatActivity {

    // Declare variables
    private int itemDetailName;
    private int itemDetailImage;
    private int itemDetailUrl;
    private TextView nameTextView;
    private ImageView drawableImageView;
    private Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the mp3_item_detail.xml layout file
        setContentView(R.layout.mp3_item_detail);

        // Find Views in mp3_item_detail XML
        nameTextView = findViewById(R.id.detail_activity_item_name);
        drawableImageView = findViewById(R.id.detail_activity_item_image);
        playButton = findViewById(R.id.detail_activity_download_button);

        // Retrieve the data passed via itemDetailIntent intent
        itemDetailName = getIntent().getIntExtra("item_name", 0);
        itemDetailImage = getIntent().getIntExtra("item_image", 0);
        itemDetailUrl = getIntent().getIntExtra("item_url", 0);

        // Assign variable content to views in mp3_item_detail XML
        nameTextView.setText(getString(itemDetailName));
        drawableImageView.setImageResource(itemDetailImage);

        // Set a click listener on play Button
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button is clicked on
            @Override
            public void onClick(View playButton) {
                // open Mp3 document URL
                getMp3();
            }
        });
    }

    // Open Mp3 using implicit Intent
    private void getMp3() {
        String itemUrlString = getResources().getString(itemDetailUrl);
        Uri itemUrl =  Uri.parse(itemUrlString);
        Intent mp3OpenIntent = new Intent(Intent.ACTION_VIEW, itemUrl);
        mp3OpenIntent.setDataAndType(itemUrl, "audio/mp3");
        startActivity(mp3OpenIntent);}
}

