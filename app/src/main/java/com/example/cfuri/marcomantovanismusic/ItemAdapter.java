package com.example.cfuri.marcomantovanismusic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/* thanks to
 * https://github.com/codepath/android-custom-array-adapter-demo
 * for solution.
 * see also: https://github.com/udacity/ud839_CustomAdapter_Example.git
 * (Udacity ListAdapter personalization example)
 */

// constructor
public class ItemAdapter extends ArrayAdapter<Item> {

    /* @param context: the current context. Used to inflate the layout file.
     * @param itemArrayList: a list of Item objects to display
     */
    public ItemAdapter(@NonNull Context context, ArrayList<Item> itemArrayList) {

        /* As this is not a single text, the adapter is not using the second argument
         * so, it can be any value (e.g.: 0).
         */
        super(context, 0, itemArrayList);
    }

    /*
     * @param position: the position in the list of data that should be displayed in the list item convertView.
     * @param convertView: the recycled convertView to populate.
     * @param parent: the parent ViewGroup that is used for inflation.
     * @return View based on position.
    */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing convertView is being reused, otherwise inflate the convertView
        if (convertView == null) {

            // The parent View is our ListView.
            // As we don't want to attach the ListView to the parent ListView yet, attachToRoot is set to false.
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        // Get the Item data item for this position in the list.
        // getItem() method is inherited from the ArrayAdapter superClass.
        final Item currentItem = getItem(position);

        // Lookup TextViews in the itemlayout for data population
        TextView itemNameTextView = convertView.findViewById(R.id.item_name_text_view);
        TextView itemDescriptionTextView = convertView.findViewById(R.id.item_description_text_view);
        ImageView itemImageView = convertView.findViewById(R.id.item_image_view);

       // Populate the data into the template convertView using the data object
        itemNameTextView.setText(currentItem.getItemNameStringID());
        itemDescriptionTextView.setText(currentItem.getItemDescriptionStringID());
        itemImageView.setImageResource(currentItem.getItemImageID());

        // Return the completed convertView to render on screen
        return convertView;



    }
}


