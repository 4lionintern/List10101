package com.dannysu.listlistlist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Sourabh on 07-02-2017.
 */
public class MyLAdapter extends BaseAdapter {
    private HashMap<Integer, ArrayList> mData = new HashMap<Integer, ArrayList>();
    private String[] mKeys;
    public MyLAdapter(HashMap<Integer, ArrayList> data){
        mData  = data;
        mKeys = mData.keySet().toArray(new String[data.size()]);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(mKeys[position]);
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        String key = mKeys[pos];
        String Value = getItem(pos).toString();

        //do your view stuff here

        return convertView;
    }
}
