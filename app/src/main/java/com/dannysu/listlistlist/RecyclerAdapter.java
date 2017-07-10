package com.dannysu.listlistlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nikhil on 7/10/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    static Context context;
    RecyclerAdapter(Context context){
        this.context=context;
    }
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_child,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        holder.info.setText("Item");
        holder.info1.setText("SubItem");

    }

    @Override
    public int getItemCount() {

        return 10;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView info,info1;
        ArrayList screens;
        public View view;
        int i=0;
        public ViewHolder(View itemView) {
            super(itemView);
            info=(TextView)itemView.findViewById(R.id.info_text);
            info1=(TextView)itemView.findViewById(R.id.info_text1);

        }
    }
}
