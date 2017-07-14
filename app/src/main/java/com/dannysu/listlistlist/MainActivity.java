package com.dannysu.listlistlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView2;
    Button bt1;
    String[] film={"men","women","child"};
    String[] men={"pant","shirts","shots"};
    String[]women={"SHirt","jeans","HD"};
    String[]child={"childchirt","childjeans","childpan"};
    final ArrayList<String> list = new ArrayList<String>();
    final ArrayList<String> list1 = new ArrayList<String>();
    final ArrayList<String> list2 = new ArrayList<String>();
    final HashMap<Integer, ArrayList> map = new HashMap<Integer, ArrayList>();
    final ArrayList<String> mainmenu = new ArrayList<String>();
    List<Main_Category_Item> main_category_items;
    // Top container ListView
    ArrayList<String> Array = new ArrayList<>();
    private MultiLevelListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button)findViewById(R.id.MyntraLayout);

        listView2=(ListView)findViewById(R.id.listView);
        MyLtAdapter adapter= new MyLtAdapter(this,film);

        mainmenu.addAll(Arrays.asList(film));
        listView2.setAdapter(adapter);
        list.addAll(Arrays.asList(men));
        map.put(0,list);
        list1.addAll(Arrays.asList(women));
        map.put(1,list1);
        list2.addAll(Arrays.asList(child));
        map.put(2,list2);
        Main_Category_Item main_category_item;
        for(int i=0;i<mainmenu.size();i++)
        {
            main_category_item=new Main_Category_Item();
            main_category_item.setTag(mainmenu.get(i).toString().trim());
            main_category_item.setSub_category_adapter((Sub_Category_Adapter) setAdapter(i)); //Yahan pe kaise set karenge wo nahi aa raha samaj




        }

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MyntraLayout.class);
                startActivity(i);
            }
        });

        listView = (MultiLevelListView)findViewById(R.id.listView);
        listView.setAdapter(this.getHorizontalScrollableItemAdapter());
    }

    // Returns an Adapter for populating the top container ListView.
    // Each item from the adapter are a HorizontalScrollableItem, since the items themselves will
    // be presenting a child horizontal ListView.
    private HorizontalScrollableItemAdapter getHorizontalScrollableItemAdapter() {
        List<HorizontalScrollableItem> items = new ArrayList<>();

        // Add 10 example items to the top container ListView, which scrolls vertically.
        for (int i = 0; i < 10; i++) {
            items.add(getHorizontalScrollableItem(i));
        }

        final HorizontalScrollableItemAdapter adapter = new HorizontalScrollableItemAdapter(this,
                R.layout.layout_containing_horizontal_listview,
                items.toArray(new HorizontalScrollableItem[items.size()]));

        return adapter;
    }

    // Creates a HorizontalScrollableItem. Each of these items would also contain an adapter for
    // populating the horizontal ListView with vertical ListViews.
   private HorizontalScrollableItem getHorizontalScrollableItem(int num) {
        List<VerticalScrollableItem> items = getVerticalScrollableItems(num);

        VerticalScrollableItemAdapter adapter =
                new VerticalScrollableItemAdapter(R.layout.layout_containing_vertical_listview, items,
                        listView);

        // Each HorizontalScrollableItem also contains an adapter
        return new HorizontalScrollableItem(adapter);
    }

    private List<VerticalScrollableItem> getVerticalScrollableItems(int num) {
        List<VerticalScrollableItem> items = new ArrayList<>();

        for (int i = 0; i < num; i++) {

            VerticalScrollableItem verticalScrollableItem = new VerticalScrollableItem();
            verticalScrollableItem.setPATH(""+num);
            items.add(verticalScrollableItem);
        }

        return items;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public Adapter setAdapter(Integer integer)
    { ArrayList ret=new ArrayList();
        ret= map.get(integer);
        Main_Catgoory_Adapter main_catgoory_adapter=new Main_Catgoory_Adapter(this,ret);
        return main_catgoory_adapter;
    }
}

