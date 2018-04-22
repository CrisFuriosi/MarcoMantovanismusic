package com.example.cfuri.marcomantovanismusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ItemDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Link this Java file with item XML file
        setContentView(R.layout.activity_item_detail);
    }
}
