package com.example.cfuri.marcomantovanismusic;

/*
{@link Item} represents a music item. Contains item text, item description.
//TODO: insert item type
 */

public class Item {

    // State: Variable declaration
    private int mItemNameText;
    private int mItemDescriptionText;
    private int mItemImage;

    // Create a new item object. Assign int string/song name ID, int string/song description ID, int image ID
    public Item(int itemNameText, int itemDescriptionText, int itemImage) {
        mItemNameText = itemNameText;
        mItemDescriptionText = itemDescriptionText;
        mItemImage = itemImage;
        }

    // Method: Output int string/name ID
    public int getItemNameStringID() {
        return mItemNameText;
    }

    // Method: Output int string/description ID
    public int getItemDescriptionStringID() {
        return mItemDescriptionText;
    }

    // Method: Output int string/description ID
    public int getItemImageID() {
        return mItemImage;
    }

}
