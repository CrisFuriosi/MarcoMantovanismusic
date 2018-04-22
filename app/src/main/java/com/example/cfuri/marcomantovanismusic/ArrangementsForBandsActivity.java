package com.example.cfuri.marcomantovanismusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArrangementsForBandsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Link this Java file with item XML file
        setContentView(R.layout.activity_item_list);

        //Create an Mp3 Item ArrayList)
        ArrayList<Item> mp3ArrayList = new ArrayList<>();

        //Add Strings in Mp3 ArrayList
        mp3ArrayList.add(new Item(R.string.christe_name, R.string.christe_description, R.drawable.empty_positioner));
        mp3ArrayList.add(new Item(R.string.ricercare_name, R.string.ricercare_description, R.drawable.empty_positioner));
        mp3ArrayList.add(new Item(R.string.fuga891_name, R.string.fuga891_description, R.drawable.empty_positioner));
        mp3ArrayList.add(new Item(R.string.fuga538_name, R.string.fuga538_description, R.drawable.empty_positioner));
        mp3ArrayList.add(new Item(R.string.ninna_name, R.string.ninna_description, R.drawable.empty_positioner));
        mp3ArrayList.add(new Item(R.string.salmo_name, R.string.salmo_description, R.drawable.empty_positioner));
        mp3ArrayList.add(new Item(R.string.sonatina1_name, R.string.sonatina1_description, R.drawable.empty_positioner));
        mp3ArrayList.add(new Item(R.string.sonatina2_name, R.string.sonatina2_description, R.drawable.empty_positioner));
        mp3ArrayList.add(new Item(R.string.sonatina3_name, R.string.sonatina3_description, R.drawable.empty_positioner));

        // Create an {@link ArrayAdapter}.
        ItemAdapter mp3Adapter = new ItemAdapter(this, mp3ArrayList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = findViewById(R.id.words_list);

        // Make the {@link ListView} use the {@link ArrayAdapter}.
        listView.setAdapter(mp3Adapter);
    }
}
