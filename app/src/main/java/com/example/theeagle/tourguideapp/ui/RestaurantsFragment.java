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


public class RestaurantsFragment extends Fragment {
    private ArrayList<LocationModel> places = new ArrayList<>();


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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillListWithData();
    }

    private void fillListWithData() {
        places.add(new LocationModel(getString(R.string.mac), getString(R.string.mac_description), R.drawable.mcdonald));
        places.add(new LocationModel(getString(R.string.kfc), getString(R.string.kfc_description), R.drawable.kfc));
        places.add(new LocationModel(getString(R.string.gad), getString(R.string.gad_description), R.drawable.gad));
        places.add(new LocationModel(getString(R.string.abo_tarek), getString(R.string.ao_tarek_description), R.drawable.koshary_abou_tarek));
    }
}
