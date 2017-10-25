package com.example.thucu.demo_listview_advanced;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by thucu on 2017-07-23.
 */

public class ItemsListAdapter extends BaseAdapter {
    private Context _context;
    private int _layout;
    private List<ItemsList> _itemlist;

    public ItemsListAdapter(Context _context, int _layout, List<ItemsList> _itemlist) {
        this._context = _context;
        this._layout = _layout;
        this._itemlist = _itemlist;
    }

    @Override
    public int getCount() {
        // Số lượng item hiển thị
        return _itemlist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView _imgItem;
        TextView _txtItemTitle, _txtItemDescr;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder _holder;

        if (view == null){
            LayoutInflater _inflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = _inflater.inflate(_layout,null);
            _holder = new ViewHolder();
            // Ánh xạ view
            _holder._txtItemTitle = (TextView) view.findViewById(R.id.txtItemTitle);
            _holder._txtItemDescr = (TextView) view.findViewById(R.id.txtItemDescr);
            _holder._imgItem = (ImageView) view.findViewById(R.id.imgItem);
            view.setTag(_holder);
        } else {
            _holder = (ViewHolder) view.getTag();
        }

        ItemsList _itemsList = _itemlist.get(i);

        _holder._txtItemTitle.setText(_itemsList.get_itemTitle());
        _holder._txtItemDescr.setText(_itemsList.get_itemDescr());
        _holder._imgItem.setImageResource(_itemsList.get_itemImage());

//            LayoutInflater _inflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            view = _inflater.inflate(_layout,null);
//            TextView txtMenuItemTitle = (TextView) view.findViewById(R.id.txtItemTitle);
//            TextView txtMenuItemDescr = (TextView) view.findViewById(R.id.txtItemDescr);
//            ImageView imgItem = (ImageView) view.findViewById(R.id.imgItem);
//
//            ItemsList listMenuItem = _itemlist.get(i);
//
//            txtMenuItemTitle.setText(listMenuItem.get_itemTitle());
//            txtMenuItemDescr.setText(listMenuItem.get_itemDescr());
//            imgItem.setImageResource(listMenuItem.get_itemImage());


        // Trả về giá trị hiển thị
        return view;
    }
}
