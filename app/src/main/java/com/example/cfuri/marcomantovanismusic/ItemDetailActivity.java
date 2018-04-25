package com.example.cfuri.marcomantovanismusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class ItemDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Link this Java file with item XML file
        setContentView(R.layout.activity_item_detail);

        // Find views in activity_item_detail XML
        TextView nameTextView = findViewById(R.id.detail_activity_item_name);
        ImageView drawableImageView = findViewById(R.id.detail_activity_item_image);

        // Retrieve the data passed via itemDetailIntent intent
        int itemDetailName = getIntent().getIntExtra("item_name", 0);
        int itemDetailImage = getIntent().getIntExtra("item_image", 0);
        String itemActivity = getIntent().getStringExtra("current_activity_name");

        // Assign variable content to views in activity_item_detail XML
        nameTextView.setText(getString(itemDetailName));
        drawableImageView.setImageResource(itemDetailImage);
    }
}

