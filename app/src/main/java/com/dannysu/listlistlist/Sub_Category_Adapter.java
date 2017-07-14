package com.dannysu.listlistlist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Sourabh on 12-07-2017.
 */
public class Sub_Category_Adapter extends BaseAdapter{
    Context context;
    ArrayList<String>data;
public Sub_Category_Adapter(Context context, ArrayList<String>data)
{
    this.context=context;
    this.data=data;
}
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}

