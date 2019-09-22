package com.android.devs.car;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder> {

    ArrayList<ModelDetail> object;
    Context context;

    public DetailAdapter(ArrayList<ModelDetail> object, Context context) {
        this.object = object;
        this.context = context;
    }



    @NonNull
    @Override
    public DetailAdapter.DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater =LayoutInflater.from(context);
        View v=inflater.inflate(R.layout.item_detail,parent,false);
        return new DetailAdapter.DetailViewHolder(v);
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DetailAdapter.DetailViewHolder holder, int position) {
        ModelDetail model = object.get(position);
        holder.textView.setText(model.getDetail());
        //Glide.with(context).load(model.getImage()).into(holder.imageView);
        holder.header.setText(model.getHeader());
        holder.imageView.setImageResource(model.getImage());
    }

    @Override
    public int getItemCount() {

        return object.size();
    }

    public static class DetailViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        TextView header;


        public DetailViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.text);
            header = itemView.findViewById(R.id.header);
        }
    }
}
