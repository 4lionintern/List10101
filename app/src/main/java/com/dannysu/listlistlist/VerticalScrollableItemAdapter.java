package com.dannysu.listlistlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

// This is used by the second level horizontal ListView to show a bunch of items each having
// a vertical ListView
public class VerticalScrollableItemAdapter extends
        RecyclerView.Adapter<VerticalScrollableItemAdapter.ViewHolder> {

    private List<VerticalScrollableItem> items;
//    private int resourceId;
    private Context context;
    private MultiLevelListView parentListView;

    public VerticalScrollableItemAdapter(int resourceId, List<VerticalScrollableItem> items,
                                     MultiLevelListView parentListView) {
        this.items = items;
//        this.resourceId = resourceId;
        this.parentListView = parentListView;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View rootView = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.layout_containing_textview, viewGroup, false);

        context = viewGroup.getContext();

        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        final VerticalScrollableItem item = items.get(i);

//        ListAdapter adapter = item.getAdapter();
        viewHolder.textView.setText(""+item.getPATH());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.Textview);
        }
    }
}
