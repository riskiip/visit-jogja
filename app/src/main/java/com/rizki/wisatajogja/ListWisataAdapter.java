package com.rizki.wisatajogja;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Wisata> listDestinasi;

    public ArrayList<Wisata> getListDestinasi() {
        return listDestinasi;
    }

    void setListDestinasi(ArrayList<Wisata> listDestinasi) {
        this.listDestinasi = listDestinasi;
    }

    ListWisataAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public ListWisataAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_wisata, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListWisataAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListDestinasi().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListDestinasi().get(position).getRemarks());
        categoryViewHolder.imgPhoto.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(context, DetailWisataActivity.class);
                intent.putExtra(DetailWisataActivity.EXTRA_NAMA, getListDestinasi().get(position).getName());
                intent.putExtra(DetailWisataActivity.EXTRA_REMARK, getListDestinasi().get(position).getRemarks());
                intent.putExtra(DetailWisataActivity.EXTRA_FOTO, getListDestinasi().get(position).getPhoto());
                intent.putExtra(DetailWisataActivity.EXTRA_DETAIL, getListDestinasi().get(position).getDeskripsi());
                intent.putExtra(DetailWisataActivity.EXTRA_LOKASI, getListDestinasi().get(position).getLokasi());
                context.startActivity(intent);
            }
        }));

        Glide.with(context)
                .load(getListDestinasi().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return getListDestinasi().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;


        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
