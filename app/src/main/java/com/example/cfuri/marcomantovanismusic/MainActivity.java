/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.cfuri.marcomantovanismusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView arrangements;
    private int category;
    private TextView compositions;
    private TextView transcriptions;
    private TextView mp3;

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

        // Create a new intent to open the {@link MusicSheetPdfActivity}
        Intent categoryIntent = new Intent(this, MusicSheetPdfActivity.class);

        // Pass String category to MusicSheetPdfActivity
        categoryIntent.putExtra("category", category);

        // Start the new activity
        startActivity(categoryIntent);

    }


}
