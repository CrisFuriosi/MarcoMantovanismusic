package com.example.cfuri.marcomantovanismusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicSheetPdfDetailActivity extends AppCompatActivity{

    TextView nameTextView;
    ImageView drawableImageView;

    int itemDetailName;
    int itemDetailImage;
    int category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Link this Java file with item XML file
        setContentView(R.layout.music_sheet_item_detail);

        // Find views in music_sheet_item_detail XML
        nameTextView = findViewById(R.id.detail_activity_item_name);
        drawableImageView = findViewById(R.id.detail_activity_item_image);

        // Retrieve the data passed via itemDetailIntent intent
        itemDetailName = getIntent().getIntExtra("item_name", 0);
        itemDetailImage = getIntent().getIntExtra("item_image", 0);
        category = getIntent().getIntExtra("category", 0);

        // Assign variable content to views in activity_item_detail XML
        nameTextView.setText(getString(itemDetailName));
        drawableImageView.setImageResource(itemDetailImage);

        // set title in ActionBar
        getSupportActionBar().setTitle(category);
   }
}