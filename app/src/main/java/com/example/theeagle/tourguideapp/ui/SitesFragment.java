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

public class SitesFragment extends Fragment {

    private ArrayList<LocationModel> places = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.siets_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Adapter adapter = new Adapter(places);
        recyclerView.setAdapter(adapter);
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fillListWithData();

    }


    private void fillListWithData() {
        places.add(new LocationModel(getString(R.string.pyramids), getString(R.string.pyramids_description), R.drawable.pyramids));
        places.add(new LocationModel(getString(R.string.citadel), getString(R.string.citadel_description), R.drawable.citadel));
        places.add(new LocationModel(getString(R.string.khan), getString(R.string.khan_description), R.drawable.khan));
        places.add(new LocationModel(getString(R.string.egyptian_museum), getString(R.string.museum_description), R.drawable.egyptian_museum));
        places.add(new LocationModel(getString(R.string.cairo_tower), getString(R.string.twoer_description), R.drawable.cairo_tower));
    }

}
