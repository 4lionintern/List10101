package com.dannysu.listlistlist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Sourabh on 12-07-2017.
 */
public class Main_Catgoory_Adapter extends BaseAdapter {
     Context contexte;
    ArrayList<Main_Category_Item> Result=new ArrayList<Main_Category_Item>();

    public Main_Catgoory_Adapter(Context context, ArrayList<Main_Category_Item> data)
    { contexte=context;
        Result=data;
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
