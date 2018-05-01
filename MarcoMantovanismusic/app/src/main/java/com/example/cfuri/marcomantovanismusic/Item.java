package com.example.cfuri.marcomantovanismusic;

/*
Item represents a music item. Contains: item text, item description, item image, item source URL.
 */
class Item {

    // Declare variables
    private final int mItemNameText;
    private final int mItemDescriptionText;
    private final int mItemImage;
    private final int mItemUrl;

    /*
    Create a new item object.
    @param itemNameText: name ID
    @param itemDescriptionText: item description ID
    @param itemImage: image ID
    @param itemUrl: URL ID
    all from strings.xml
    */
    Item(int itemNameText, int itemDescriptionText, int itemImage, int itemUrl) {
        mItemNameText = itemNameText;
        mItemDescriptionText = itemDescriptionText;
        mItemImage = itemImage;
        mItemUrl = itemUrl;

        }

    // @return name ID
    public int getItemNameStringID() {
        return mItemNameText;
    }

    // @return description ID
    public int getItemDescriptionStringID() {
        return mItemDescriptionText;
    }

    // @return image ID
    public int getItemImageID() {
        return mItemImage;
    }

    // @return URL ID
    public int getItemUrlID() {
        return mItemUrl;
    }
}
