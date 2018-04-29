package com.example.cfuri.marcomantovanismusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicSheetPdfActivity extends AppCompatActivity {

    // Declare variables
    Item currentItem;
    int category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Link this Java file with item XML file
        setContentView(R.layout.activity_item_list);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = findViewById(R.id.items_list);

        // Retrieve the data passed via categoryIntent intent
        category = getIntent().getIntExtra("category", 0);

        //Create Item ArrayList
        final ArrayList<Item> itemArrayList = new ArrayList<>();

        if (category == R.string.category_arrangements) {

            //Add Strings in ArrayList
            itemArrayList.add(new Item(R.string.arragements_natale_name, R.string.arragements_natale_description, R.drawable.pdf_image, R.string.arragements_natale_url));
            itemArrayList.add(new Item(R.string.arragements_assolo_name, R.string.arragements_assolo_description, R.drawable.pdf_image, R.string.arragements_assolo_url));
            itemArrayList.add(new Item(R.string.arragements_monelli_name, R.string.arragements_monelli_description, R.drawable.pdf_image, R.string.arragements_monelli_url));
            itemArrayList.add(new Item(R.string.arragements_duetto_name, R.string.arragements_duetto_description, R.drawable.pdf_image, R.string.arragements_duetto_url));
            itemArrayList.add(new Item(R.string.arragements_canzonetta_name, R.string.arragements_canzonetta_description, R.drawable.pdf_image, R.string.arragements_canzonetta_url));
        }

        else if (category == R.string.category_compositions) {
                itemArrayList.add(new Item(R.string.compositions_ninna1_name, R.string.compositions_ninna1_description, R.drawable.pdf_image, R.string.compositions_ninna1_url));
                itemArrayList.add(new Item(R.string.compositions_signore_name, R.string.compositions_signore_description, R.drawable.pdf_image, R.string.compositions_signore_url));
                itemArrayList.add(new Item(R.string.compositions_padre_name, R.string.compositions_padre_description, R.drawable.pdf_image, R.string.compositions_padre_url));
                itemArrayList.add(new Item(R.string.compositions_amici1_name, R.string.compositions_amici1_description, R.drawable.pdf_image, R.string.compositions_amici1_url));
                itemArrayList.add(new Item(R.string.compositions_amici2_name, R.string.compositions_amici2_description, R.drawable.pdf_image, R.string.compositions_amici2_url));
                itemArrayList.add(new Item(R.string.compositions_pittore1_name, R.string.compositions_pittore1_description, R.drawable.pdf_image, R.string.compositions_pittore1_url));
                itemArrayList.add(new Item(R.string.compositions_salmo130_name, R.string.compositions_salmo130_description, R.drawable.pdf_image, R.string.compositions_salmo130_url));
                itemArrayList.add(new Item(R.string.compositions_ninna2_name, R.string.compositions_ninna2_description, R.drawable.pdf_image, R.string.compositions_ninna2_url));
                itemArrayList.add(new Item(R.string.compositions_preghiera_name, R.string.compositions_preghiera_description, R.drawable.pdf_image, R.string.compositions_preghiera_url));
                itemArrayList.add(new Item(R.string.compositions_pittore2_name, R.string.compositions_pittore2_description, R.drawable.pdf_image, R.string.compositions_pittore2_url));
                itemArrayList.add(new Item(R.string.compositions_sanctus_name, R.string.compositions_sanctus_description, R.drawable.pdf_image, R.string.compositions_sanctus_url));
                itemArrayList.add(new Item(R.string.compositions_manus_name, R.string.compositions_manus_description, R.drawable.pdf_image, R.string.compositions_manus_url));
                itemArrayList.add(new Item(R.string.compositions_ave_name, R.string.compositions_ave_description, R.drawable.pdf_image, R.string.compositions_ave_url));
        }

        else if (category == R.string.category_transcriptions) {
            itemArrayList.add(new Item(R.string.transcriptions_padre_name, R.string.transcriptions_padre_description, R.drawable.pdf_image, R.string.compositions_ninna1_url));
            itemArrayList.add(new Item(R.string.transcriptions_fuga_name, R.string.transcriptions_fuga_description, R.drawable.pdf_image, R.string.compositions_signore_url));
            itemArrayList.add(new Item(R.string.transcriptions_panis_name, R.string.transcriptions_panis_description, R.drawable.pdf_image, R.string.compositions_padre_url));
            itemArrayList.add(new Item(R.string.transcriptions_montanara_name, R.string.transcriptions_montanara_description, R.drawable.pdf_image, R.string.compositions_amici1_url));
            itemArrayList.add(new Item(R.string.transcriptions_538_name, R.string.transcriptions_538_description, R.drawable.pdf_image, R.string.compositions_amici2_url));
            itemArrayList.add(new Item(R.string.transcriptions_891_name, R.string.transcriptions_891_description, R.drawable.pdf_image, R.string.compositions_pittore1_url));
            itemArrayList.add(new Item(R.string.transcriptions_883_name, R.string.transcriptions_883_description, R.drawable.pdf_image, R.string.compositions_salmo130_url));
            itemArrayList.add(new Item(R.string.transcriptions_849_name, R.string.transcriptions_849_description, R.drawable.pdf_image, R.string.compositions_ninna2_url));
            itemArrayList.add(new Item(R.string.transcriptions_wachet_name, R.string.transcriptions_wachet_description, R.drawable.pdf_image, R.string.compositions_preghiera_url));
            itemArrayList.add(new Item(R.string.transcriptions_mission_name, R.string.transcriptions_mission_description, R.drawable.pdf_image, R.string.compositions_pittore2_url));
            itemArrayList.add(new Item(R.string.transcriptions_cinema_name, R.string.transcriptions_cinema_description, R.drawable.pdf_image, R.string.compositions_sanctus_url));
            itemArrayList.add(new Item(R.string.transcriptions_mission_name, R.string.transcriptions_mission_description, R.drawable.pdf_image, R.string.compositions_manus_url));
            itemArrayList.add(new Item(R.string.transcriptions_ricercare_name, R.string.transcriptions_ricercare_description, R.drawable.pdf_image, R.string.compositions_ave_url));
            itemArrayList.add(new Item(R.string.transcriptions_tiefer_name, R.string.transcriptions_tiefer_name, R.drawable.pdf_image, R.string.compositions_sanctus_url));
            itemArrayList.add(new Item(R.string.transcriptions_thron_name, R.string.transcriptions_thron_description, R.drawable.pdf_image, R.string.compositions_manus_url));
            itemArrayList.add(new Item(R.string.transcriptions_trost_name, R.string.transcriptions_trost_description, R.drawable.pdf_image, R.string.compositions_ave_url));
        }

            // Create an {@link ArrayAdapter}.
            final ItemAdapter pdfAdapter = new ItemAdapter(this, itemArrayList);

            // Make the {@link ListView} use the {@link ArrayAdapter}.
            listView.setAdapter(pdfAdapter);

            // Set OnItemClickListener: open PdfDetailActivity when item is clicked
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {

                    // Find current item
                    currentItem = pdfAdapter.getItem(position);

                    // Start Intent
                    Intent itemDetailIntent = new Intent(getBaseContext(), MusicSheetPdfDetailActivity.class);

                    // Pass int name and int description to ItemDetailActivity
                    itemDetailIntent.putExtra("item_name", currentItem.getItemNameStringID());
                    itemDetailIntent.putExtra("item_image", currentItem.getItemImageID());
                    itemDetailIntent.putExtra("item_url", currentItem.getItemUrlID());
                    itemDetailIntent.putExtra("category", category);

                    // Start ItemDetailActivity
                    startActivity(itemDetailIntent);
                }
            });

        // set title in ActionBar
        getSupportActionBar().setTitle(category);

    }
    }

