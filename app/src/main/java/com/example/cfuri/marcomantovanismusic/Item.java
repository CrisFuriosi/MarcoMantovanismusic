package com.example.cfuri.marcomantovanismusic;

/*
{@link Item} represents a vocabulary word. Contains default and Miwok translations for the word.
 */
public class Item {

    // State: Variable declaration
    private int mItemNameText;
    private int mItemDescriptionText;
    private int mItemImageId;

    // Create a new item object. Assign int string/song name ID, int string/song description ID, int image ID
    public Item(int itemNameText, int itemDescriptionText, int itemImageId) {
        mItemNameText = itemNameText;
        mItemDescriptionText = itemDescriptionText;
        mItemImageId = itemImageId;
    }

    // Method: Output int string/name ID
    public int getItemNameStringID() {
        return mItemNameText;
    }

    // Method: Output int string/description ID
    public int getItemDescriptionStringID() {
        return mItemDescriptionText;
    }

    // Method: Output int image ID
    public int getItemImageID() {
        return mItemImageId;
    }
}
