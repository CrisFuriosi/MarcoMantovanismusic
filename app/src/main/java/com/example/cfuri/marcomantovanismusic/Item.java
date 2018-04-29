package com.example.cfuri.marcomantovanismusic;

/*
{@link Item} represents a music item. Contains item text, item description.
//TODO: insert item type
 */

class Item {

    // State: Variable declaration
    private final int mItemNameText;
    private final int mItemDescriptionText;
    private final int mItemImage;
    private final int mItemUrl;

    // Create a new item object. Assign int string/song name ID, int string/song description ID, int image ID, int URL ID
    Item(int itemNameText, int itemDescriptionText, int itemImage, int itemUrl) {
        mItemNameText = itemNameText;
        mItemDescriptionText = itemDescriptionText;
        mItemImage = itemImage;
        mItemUrl = itemUrl;
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

    // Method: Output int URL ID
    public int getItemUrlID() {
        return mItemUrl;
    }
}
