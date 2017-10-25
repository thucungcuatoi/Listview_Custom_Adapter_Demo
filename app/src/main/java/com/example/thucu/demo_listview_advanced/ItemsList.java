package com.example.thucu.demo_listview_advanced;

/**
 * Created by thucu on 2017-07-23.
 */

public class ItemsList {
    private String _itemTitle;
    private String _itemDescr;
    private int _itemImage;

    public ItemsList(String _itemTitle, String _itemDescr, int _itemImage) {
        this._itemTitle = _itemTitle;
        this._itemDescr = _itemDescr;
        this._itemImage = _itemImage;
    }

    public String get_itemTitle() {
        return _itemTitle;
    }

    public void set_itemTitle(String _itemTitle) {
        this._itemTitle = _itemTitle;
    }

    public String get_itemDescr() {
        return _itemDescr;
    }

    public void set_itemDescr(String _itemDescr) {
        this._itemDescr = _itemDescr;
    }

    public int get_itemImage() {
        return _itemImage;
    }

    public void set_itemImage(int _itemImage) {
        this._itemImage = _itemImage;
    }
}

