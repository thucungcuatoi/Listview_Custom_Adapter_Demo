package com.example.thucu.demo_listview_advanced;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
//    ListView listViewSwipe;
    SwipeRefreshLayout swipeRefreshLayout;
    ListView _lvItemList;
    ArrayList<ItemsList> _arrayList;

    ArrayList<ItemsList> _arrayListNew;
    private DrawerLayout _drawerLayout, _drawerLayoutRight;
    private ActionBarDrawerToggle _drawerToggle, _drawerToggleRight;
    private ListView _listviewMenu, _listviewMenuRight;
    private ArrayList<String> _arrayListMenu, _arrayListMenuRight;
    ItemsListAdapter _adapter;
    int click = 0;
//    Toolbar mActionBarToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _lvItemList = (ListView) findViewById(R.id.listviewItemList);
        _listviewMenu = (ListView) findViewById(R.id.listviewMenuDrawer);
//        _listviewMenuRight = (ListView) findViewById(R.id.listviewMenuRight);
        _drawerLayout = (DrawerLayout) findViewById(R.id.layout_DrawerMenu);
//        _drawerLayoutRight = (DrawerLayout) findViewById(R.id.layout_DrawerMenuRight);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.layout_SwipeRefresh);
        loadSwipeConfig();



        addListMenu();
        addListMenuRight();
        loadDisplayMenu();
//        loadDisplayMenuRight();
        _listviewMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                _listviewMenu.setSelection(i);

                String str = _arrayListMenu.get(i).toString();
                Toast.makeText(MainActivity.this, "" + str, Toast.LENGTH_SHORT).show();
            }
        });

//        loadDrawerMenuConfig();
        _drawerToggle = new ActionBarDrawerToggle(this,_drawerLayout,R.string.open, R.string.close);
        _drawerLayout.addDrawerListener(_drawerToggle);
        _drawerToggle.syncState();

//        _drawerToggleRight = new ActionBarDrawerToggle(this,_drawerLayoutRight,R.string.open, R.string.close);
//        _drawerLayoutRight.addDrawerListener(_drawerToggleRight);
//        _drawerToggleRight.syncState();

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    private void loadDrawerMenuConfig(){
        _drawerToggle = new ActionBarDrawerToggle(this,_drawerLayout,R.string.open, R.string.close);
        _drawerLayout.addDrawerListener(_drawerToggle);
        _drawerToggle.syncState();


//        _drawerToggleRight = new ActionBarDrawerToggle(this,_drawerLayoutRight,R.string.open, R.string.close);
//        _drawerLayoutRight.addDrawerListener(_drawerToggleRight);
//        _drawerToggleRight.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void loadDrawerMenuConfigRight(){
//        _drawerToggle = new ActionBarDrawerToggle(this,_drawerLayout,R.string.open, R.string.close);
//        _drawerLayout.addDrawerListener(_drawerToggle);
//        _drawerToggle.syncState();


        _drawerToggleRight = new ActionBarDrawerToggle(this,_drawerLayoutRight,R.string.open, R.string.close);
        _drawerLayoutRight.addDrawerListener(_drawerToggleRight);
        _drawerToggleRight.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void addListMenu(){
        _arrayListMenu = new ArrayList<>();
        _arrayListMenu.add("Menu item 1");
        _arrayListMenu.add("Menu item 2");
        _arrayListMenu.add("Menu item 3");
    }
    private void addListMenuRight(){
        _arrayListMenuRight = new ArrayList<>();
        _arrayListMenuRight.add("Menu Right 1");
        _arrayListMenuRight.add("Menu Right 2");
        _arrayListMenuRight.add("Menu Right 3");
    }

    public void loadSwipeConfig() {

        // Màu cho icon load
        swipeRefreshLayout.setColorSchemeColors(Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.BLACK, Color.CYAN,Color.MAGENTA);
        // Khoảng cách kéo để load
        swipeRefreshLayout.setDistanceToTriggerSync(100);
        // Kích thước icon load
        swipeRefreshLayout.setSize(SwipeRefreshLayout.DEFAULT);
        // Gọi hàm onRefresh()
        swipeRefreshLayout.setOnRefreshListener(this);

        addListItem1();
        addListItem2();
        loadDisplay();

    }
    private void addListItem1() {
        _arrayList = new ArrayList<>();
        _arrayList.add(new ItemsList("Item Title 1","Item Description 1",R.drawable.item_01));
//        _arrayList.add(new ItemsList("Item Title 2","Item Description 2",R.drawable.item_02));
//        _arrayList.add(new ItemsList("Item Title 3","Item Description 3",R.drawable.item_03));
//        _arrayList.add(new ItemsList("Item Title 4","Item Description 4",R.drawable.item_04));
//        _arrayList.add(new ItemsList("Item Title 5","Item Description 5",R.drawable.item_05));
//        _arrayList.add(new ItemsList("Item Title 6","Item Description 6",R.drawable.item_06));
//        _arrayList.add(new ItemsList("Item Title 7","Item Description 7",R.drawable.item_07));
//        _arrayList.add(new ItemsList("Item Title 8","Item Description 8",R.drawable.item_08));
//        _arrayList.add(new ItemsList("Item Title 9","Item Description 9",R.drawable.item_09));
//        _arrayList.add(new ItemsList("Item Title 10","Item Description 10",R.drawable.item_10));
    }
    private void addListItem2(){
        _arrayListNew = new ArrayList<>();
        _arrayListNew.add(new ItemsList("New Item Title 1","New Item Description 1",R.drawable.item_01));
//        _arrayListNew.add(new ItemsList("New Item Title 2","New Item Description 2",R.drawable.item_02));
//        _arrayListNew.add(new ItemsList("New Item Title 3","New Item Description 3",R.drawable.item_03));
//        _arrayListNew.add(new ItemsList("New Item Title 4","New Item Description 4",R.drawable.item_04));
//        _arrayListNew.add(new ItemsList("New Item Title 5","New Item Description 5",R.drawable.item_05));
////        _arrayListNew.add(new ItemsList("New Item Title 6","New Item Description 6",R.drawable.item_06));
//        _arrayListNew.add(new ItemsList("New Item Title 7","New Item Description 7",R.drawable.item_07));
//        _arrayListNew.add(new ItemsList("New Item Title 8","New Item Description 8",R.drawable.item_08));
//        _arrayListNew.add(new ItemsList("New Item Title 9","New Item Description 9",R.drawable.item_09));
//        _arrayListNew.add(new ItemsList("New Item Title 10","New Item Description 10",R.drawable.item_10));

    }


    @Override
    public void onRefresh() {
        new CountDownTimer(3000,1000){

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                swipeRefreshLayout.setRefreshing(false);
                //arrayList.clear();
//                Collections.addAll(arrayListNew,listNew);

                int listSizeOld = _arrayList.size();
                Log.d("Debug-Data", "listSize-Old: " + listSizeOld);

                int listSize = _arrayListNew.size();
                Log.d("Debug-Data", "listSize-New: " + listSize);
//                String newItemTitle = "";
//                String newItemDescr = "";
//                int newItemImage = ;
                for (int i = 0; i < listSize; i++){
                    Log.d("Debug-Data", "-- check item New "+ i + "");
                    String newItemTitle = _arrayListNew.get(i).get_itemTitle();
                    String newItemDescr = _arrayListNew.get(i).get_itemDescr();
                    int newItemImage = _arrayListNew.get(i).get_itemImage();

//                    Log.d("Debug-Data", "newItemTitle "+ i + ": " + newItemTitle);
//                    Log.d("Debug-Data", "newItemDescr "+ i + ": " + newItemDescr);
//                    Log.d("Debug-Data", "newItemImage "+ i + ": " + newItemImage);

                    int flgExisting = 0;

                    for (int j = 0; j < listSizeOld; j++){
                        String oldItemTitle = _arrayList.get(j).get_itemTitle();
                        String oldItemDescr = _arrayList.get(j).get_itemDescr();
                        int oldItemImage = _arrayList.get(j).get_itemImage();

                        if (oldItemTitle.equals(newItemTitle)){
                            Log.d("Debug-Data", "-- check item Old "+ j + "");
                            flgExisting = 1;
                            break;
                        }
                    }
                    if (flgExisting == 0){
                        _arrayList.add(new ItemsList(newItemTitle,newItemDescr,newItemImage));
                    } else {
                        Log.d("Debug-Data", "duplicate "+ i + ": " + newItemTitle);
                    }

                }
                loadDisplay();
//                _adapter = new ItemsListAdapter(MainActivity.this,R.layout.line_itemlist,_arrayList);
//                _lvItemList.setAdapter(_adapter);
//                _adapter.notifyDataSetChanged();

            }
        }.start();

    }

    private void loadDisplay(){
        _adapter = new ItemsListAdapter(MainActivity.this,R.layout.line_itemlist,_arrayList);
        _lvItemList.setAdapter(_adapter);
        _adapter.notifyDataSetChanged();
    }
    private void loadDisplayMenu(){
        ArrayAdapter _adapterMenu = new ArrayAdapter(this, android.R.layout.simple_list_item_1,_arrayListMenu);
        _listviewMenu.setAdapter(_adapterMenu);

    }
//    private void loadDisplayMenuRight(){
//        ArrayAdapter _adapterMenuRight = new ArrayAdapter(this, android.R.layout.simple_list_item_1,_arrayListMenuRight);
//        _listviewMenuRight.setAdapter(_adapterMenuRight);
//
//    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_config, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (_drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        if (_drawerToggleRight.onOptionsItemSelected(item)){
            return true;
        }

        switch (item.getItemId()){
            case R.id.menuItem:
                Toast.makeText(MainActivity.this, "Menu Item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuCategory:
                loadDrawerMenuConfigRight();
                if (click == 1){
                    _drawerLayoutRight.closeDrawer(GravityCompat.END);
                    click = 0;
                } else {
                    _drawerLayoutRight.openDrawer(GravityCompat.END);
                    click = 1;
                }

                Toast.makeText(MainActivity.this, "Menu Category", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
