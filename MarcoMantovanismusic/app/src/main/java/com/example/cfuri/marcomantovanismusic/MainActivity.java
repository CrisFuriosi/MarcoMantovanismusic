/*
* references for java code:
* https://github.com/udacity/ud839_Miwok
* https://github.com/udacity/ud839_CustomAdapter_Example
* https://discussions.udacity.com/t/my-approved-musical-structure-app-to-help-anyone-struggling-with-the-project/665091/9
 * https://stackoverflow.com/questions/35810229/how-to-display-and-set-click-event-on-back-arrow-on-toolbar
 */
package com.example.cfuri.marcomantovanismusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare variables
    private int category;
    private TextView arrangements;
    private TextView compositions;
    private TextView transcriptions;
    private TextView mp3;
    private Intent categoryIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the arrangements_text_view category
        arrangements = findViewById(R.id.arrangements_text_view);
        category = R.string.category_arrangements;

        // Set a click listener on that View
        arrangements.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the arrangements_text_view category is clicked on.
            @Override
            public void onClick(View view) {
                openMusicSheetPdfActivity ();

            }
        });

        // Find the View that shows the compositions_text_view category
        compositions = findViewById(R.id.compositions_text_view);

        // Set a click listener on that View
        compositions.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the arrangements_text_view category is clicked on.
            @Override
            public void onClick(View view) {
                category = R.string.category_compositions;
                openMusicSheetPdfActivity ();
            }
        });

        // Find the View that shows the transcriptions_text_view category
        transcriptions = findViewById(R.id.transcriptions_text_view);

        // Set a click listener on that View
        transcriptions.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the arrangements_text_view category is clicked on.
            @Override
            public void onClick(View view) {
                category = R.string.category_transcriptions;
                openMusicSheetPdfActivity ();
            }
        });

        // Find the View that shows the mp3_text_view category
        mp3 = findViewById(R.id.mp3_text_view);

        // Set a click listener on that View
        mp3.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the mp3_text_view category is clicked on.
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link Mp3Activity}
                Intent mp3Intent = new Intent(MainActivity.this, Mp3Activity.class);

                // Start the new activity
                startActivity(mp3Intent);
            }
        });
    }

    // method openMusicSheetPdfActivity: open MusicSheetPdfActivity trough intent and send String category
    private void openMusicSheetPdfActivity() {

        // Create a new intent to open MusicSheetPdfActivity
        categoryIntent = new Intent(this, MusicSheetPdfActivity.class);
        // Pass String category to MusicSheetPdfActivity
        categoryIntent.putExtra("category", category);
        // Start the new activity
        startActivity(categoryIntent);
    }


}
