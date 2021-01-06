package com.arc.secureapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FanAdapter extends RecyclerView.Adapter<ItemHolder> {

    public List<ModelFan> androidList;

    public FanAdapter(List<ModelFan> android){
        this.androidList = android;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder viewHolder, int i) {
        viewHolder.tv_name.setText(androidList.get(i).getName());
        viewHolder.tv_version.setText(androidList.get(i).getVer());
        viewHolder.tv_api_level.setText(androidList.get(i).getApi());
    }

    @Override
    public int getItemCount() {
        return androidList.size();
    }
}
