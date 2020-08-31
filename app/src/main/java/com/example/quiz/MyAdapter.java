package com.example.quiz;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private ListElement[] mDataset;

    public MyAdapter(Context mContext, ListElement[] mDataset) {
        this.mContext = mContext;
        this.mDataset = mDataset;
    }
    public static class HeaderViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public HeaderViewHolder(@NonNull View itemView){
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textViewisim);
        }
    }
    public static class CarViewHolder extends RecyclerView.ViewHolder {
        public TextView textName;
        public TextView textVites;
        public TextView textKoltuk;
        public TextView textModel;
        public ImageView image;
        public ConstraintLayout layout;
        public CarViewHolder(@NonNull View itemView){
            super(itemView);
            textName = (TextView) itemView.findViewById(R.id.textName);
            textVites = (TextView) itemView.findViewById(R.id.textVites);
            textKoltuk = (TextView) itemView.findViewById(R.id.textKoltuk);
            textModel = (TextView) itemView.findViewById(R.id.textModel);
            image = (ImageView) itemView.findViewById(R.id.image);
            layout = (ConstraintLayout) itemView.findViewById(R.id.layout);
        }
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        switch(viewType){
            case 0:
            {
                View listItem = layoutInflater.inflate(R.layout.view_header, parent, false);
                RecyclerView.ViewHolder viewHolder = new HeaderViewHolder(listItem);
                return viewHolder;
            }
            case 1:
            {
                View listItem = layoutInflater.inflate(R.layout.view_car_detail, parent, false);
                RecyclerView.ViewHolder viewHolder = new CarViewHolder(listItem);
                return viewHolder;
            }
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        switch (holder.getItemViewType()){
            case 0: 
                HeaderViewHolder header = (HeaderViewHolder) holder;
                header.textView.setText(mDataset[position].getCarname());
                break;
            case 1: 
                final CarViewHolder car = (CarViewHolder) holder;

                car.textName.setText(mDataset[position].getCarname());
                car.textVites.setText(mDataset[position].getVites());
                car.textKoltuk.setText(mDataset[position].getKoltuk());
                car.textModel.setText(mDataset[position].getModel());

                Glide
                        .with(mContext)
                        .load(mDataset[position].getResim())
                        .into(car.image);


                car.layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent newIntent = new Intent(mContext,CarProfilActivity.class);

                        newIntent.putExtra("name", mDataset[position].getCarname());
                        newIntent.putExtra("vites",mDataset[position].getVites());
                        newIntent.putExtra("koltuk",mDataset[position].getKoltuk());
                        newIntent.putExtra("model",mDataset[position].getModel());
                        newIntent.putExtra("yakittuketimi",mDataset[position].getYakit_tuketim());
                        newIntent.putExtra("yakit",mDataset[position].getYakit());
                        newIntent.putExtra("kira",mDataset[position].getKira());

                        newIntent.putExtra("resim", mDataset[position].getResim());

                       mContext.startActivity(newIntent);
                    }
                });
        }
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    @Override
    public int getItemViewType(int position) {
        return mDataset[position].getElement_type();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
