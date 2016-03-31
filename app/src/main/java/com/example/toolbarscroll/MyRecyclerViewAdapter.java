package com.example.toolbarscroll;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.DataObjectHolder> {
    private ArrayList<String> mDataset;
    private Context context;

    public static class DataObjectHolder extends RecyclerView.ViewHolder {

        public DataObjectHolder(View itemView) {
            super(itemView);
        }

    }

    public MyRecyclerViewAdapter(Context ctx, ArrayList<String> list) {
        context = ctx;
        mDataset = list;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}