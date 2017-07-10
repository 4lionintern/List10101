package com.dannysu.listlistlist;

import android.widget.ListAdapter;

/*
 * List item containing a vertically scrollable ListView
 */
public class VerticalScrollableItem {

    private ListAdapter adapter;
    String path;

    // Initialize it with the ListAdapter necessary to populate and drive the vertical ListView
    // contained by this item
    public VerticalScrollableItem() {

    }

    public VerticalScrollableItem(ListAdapter adapter) {

    }

    public ListAdapter getAdapter() {
        return adapter;
    }
    public String PATH;

    public String getPATH()
    {return PATH;}

    public void setPATH(String PATH){
        this.PATH = PATH;
    }


}