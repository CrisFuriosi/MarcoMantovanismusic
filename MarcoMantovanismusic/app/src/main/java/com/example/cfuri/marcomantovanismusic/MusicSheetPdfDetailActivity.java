/*
 * MusicSheetPdfDetailActivity shows single item data (for Pdf Music Sheets).
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

public class MusicSheetPdfDetailActivity extends AppCompatActivity {

    // Declare variables
    private int itemDetailName;
    private int itemDetailImage;
    private int itemDetailUrl;
    private int category;
    private TextView nameTextView;
    private ImageView drawableImageView;
    private Button downloadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the pdf_item_detail.xml layout file
        setContentView(R.layout.pdf_item_detail);

        // Find views in pdf_item_detail XML
        nameTextView = findViewById(R.id.detail_activity_item_name);
        drawableImageView = findViewById(R.id.detail_activity_item_image);
        downloadButton = findViewById(R.id.detail_activity_download_button);

        // Retrieve the data passed via itemDetailIntent intent
        itemDetailName = getIntent().getIntExtra("item_name", 0);
        itemDetailImage = getIntent().getIntExtra("item_image", 0);
        itemDetailUrl = getIntent().getIntExtra("item_url", 0);
        category = getIntent().getIntExtra("category", 0);

        // Assign variable content to views in activity_item_detail XML
        nameTextView.setText(getString(itemDetailName));
        drawableImageView.setImageResource(itemDetailImage);

        // set title in ActionBar
        getSupportActionBar().setTitle(category);

        // Set a click listener on download Button
        downloadButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button is clicked on
            @Override
            public void onClick(View downloadButton) {
                // open Pdf document URL
                getPdf();
            }
        });
    }

    // Open Pdf using implicit Intent
    private void getPdf() {
        String itemUrlString = getResources().getString(itemDetailUrl);
        Uri itemUrl =  Uri.parse(itemUrlString);
        Intent pdfOpenIntent = new Intent(Intent.ACTION_VIEW, itemUrl);
        pdfOpenIntent.setDataAndType(itemUrl, "application/pdf");
        startActivity(pdfOpenIntent);
    }
}