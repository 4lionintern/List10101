package com.dannysu.listlistlist;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.dannysu.listlistlist.R.id.recyclerView;


public class BlankFragment extends Fragment {
    RecyclerView recyclerView;
    Button bt1;
    int counter = 0;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        bt1=(Button) view.findViewById(R.id.bt1);
        recyclerView=(RecyclerView)view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(new RecyclerAdapter(getContext()));
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter == 0 ) {
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    recyclerView.setAdapter(new RecyclerAdapter(getContext()));
                    counter = 1;
                }
                else
                {  GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    recyclerView.setAdapter(new RecyclerAdapter(getContext()));
                    counter = 0;
                }
            }
        });
        return view;
    }

}
