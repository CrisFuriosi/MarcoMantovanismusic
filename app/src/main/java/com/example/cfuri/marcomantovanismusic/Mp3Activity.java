package com.example.cfuri.marcomantovanismusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Mp3Activity extends AppCompatActivity {

    // Declare variables
    String currentActivity;
    Item currentItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Link this Java file with item XML file
        setContentView(R.layout.activity_item_list);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = findViewById(R.id.items_list);

        //Create an Mp3 Item ArrayList
        final ArrayList<Item> itemArrayList = new ArrayList<>();

        //Add Strings in Mp3 ArrayList
        itemArrayList.add(new Item(R.string.christe_name, R.string.christe_description, R.drawable.mp3_activity_image, R.string.christe_url));
        itemArrayList.add(new Item(R.string.ricercare_name, R.string.ricercare_description, R.drawable.mp3_activity_image, R.string.ricercare_url));
        itemArrayList.add(new Item(R.string.fuga891_name, R.string.fuga891_description, R.drawable.mp3_activity_image, R.string.fuga891_url));
        itemArrayList.add(new Item(R.string.fuga538_name, R.string.fuga538_description, R.drawable.mp3_activity_image, R.string.fuga538_url));
        itemArrayList.add(new Item(R.string.ninna_name, R.string.ninna_description, R.drawable.mp3_activity_image, R.string.ninna_url));
        itemArrayList.add(new Item(R.string.salmo_name, R.string.salmo_description, R.drawable.mp3_activity_image, R.string.salmo_url));
        itemArrayList.add(new Item(R.string.sonatina1_name, R.string.sonatina1_description, R.drawable.mp3_activity_image, R.string.sonatina1_url));
        itemArrayList.add(new Item(R.string.sonatina2_name, R.string.sonatina2_description, R.drawable.mp3_activity_image, R.string.sonatina2_url));
        itemArrayList.add(new Item(R.string.sonatina3_name, R.string.sonatina3_description, R.drawable.mp3_activity_image, R.string.sonatina3_url));

        // Create an {@link ArrayAdapter}.
        final ItemAdapter mp3Adapter = new ItemAdapter(this, itemArrayList);

        // Make the {@link ListView} use the {@link ArrayAdapter}.
        listView.setAdapter(mp3Adapter);

        // Set OnItemClickListener: open ItemDetailActivity when item is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {

                // Find current item
                currentItem = mp3Adapter.getItem(position);
                // Find current Activity
                currentActivity = (String) getTitle();

                // Start Intent
                Intent itemDetailIntent = new Intent(getBaseContext(), ItemDetailActivity.class);

                // Pass int name and int description to ItemDetailActivity
                itemDetailIntent.putExtra("item_name", currentItem.getItemNameStringID());
                itemDetailIntent.putExtra("item_description", currentItem.getItemDescriptionStringID());
                itemDetailIntent.putExtra("item_image", currentItem.getItemImageID());
                itemDetailIntent.putExtra("item_url", currentItem.getItemUrlID());
                itemDetailIntent.putExtra("current_activity_name", currentActivity);

                // Start ItemDetailActivity
                startActivity(itemDetailIntent);
            }
        });
    }
}



