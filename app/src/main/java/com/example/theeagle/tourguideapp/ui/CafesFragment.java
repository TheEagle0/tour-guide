package com.example.theeagle.tourguideapp.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.theeagle.tourguideapp.R;
import com.example.theeagle.tourguideapp.adapters.Adapter;
import com.example.theeagle.tourguideapp.model.LocationModel;

import java.util.ArrayList;


public class CafesFragment extends Fragment {
    private ArrayList<LocationModel> places = new ArrayList<>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillListWithData();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cafes_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Adapter adapter = new Adapter(places);
        recyclerView.setAdapter(adapter);
        return view;

    }
    private void fillListWithData() {
        places.add(new LocationModel(getString(R.string.coffee_bean), getString(R.string.coffee_bean_description), R.drawable.coffee_bean));
        places.add(new LocationModel(getString(R.string.star), getString(R.string.star_description), R.drawable.star_bucks));
        places.add(new LocationModel(getString(R.string.costa), getString(R.string.costa_description), R.drawable.costa));
        places.add(new LocationModel(getString(R.string.fishawy), getString(R.string.fishawy_description), R.drawable.fishawy));
    }
}
