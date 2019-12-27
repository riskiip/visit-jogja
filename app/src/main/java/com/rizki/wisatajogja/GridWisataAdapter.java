package com.rizki.wisatajogja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridWisataAdapter extends RecyclerView.Adapter<GridWisataAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Wisata> listDestinasi;

    public ArrayList<Wisata> getListDestinasi() {
        return listDestinasi;
    }

    public void setListDestinasi(ArrayList<Wisata> listDestinasi) {
        this.listDestinasi = listDestinasi;
    }

    public GridWisataAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridWisataAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_wisata, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridWisataAdapter.GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListDestinasi().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListDestinasi().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
