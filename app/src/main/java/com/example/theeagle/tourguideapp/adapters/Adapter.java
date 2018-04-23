package com.example.theeagle.tourguideapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.theeagle.tourguideapp.R;
import com.example.theeagle.tourguideapp.model.LocationModel;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<LocationModel> places;

    public Adapter(ArrayList<LocationModel> sites) {
        this.places = sites;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.locationModel = places.get(position);
        holder.locationName.setText(holder.locationModel.getPlaceName());
        holder.description.setText(holder.locationModel.getDescription());
        holder.placeView.setBackgroundResource(holder.locationModel.getImageId());
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView locationName, description;
        ImageView placeView;
        LocationModel locationModel;

        ViewHolder(View itemView) {
            super(itemView);
            locationName = itemView.findViewById(R.id.place_tv);
            description = itemView.findViewById(R.id.description_tv);
            placeView=itemView.findViewById(R.id.place_image);
        }
    }
}
