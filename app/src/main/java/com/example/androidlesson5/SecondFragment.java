package com.example.androidlesson5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private AdapterCountry adapterCountry;
    private ArrayList<Country> list2;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();

        recyclerView = view.findViewById(R.id.recycler_2);
        adapterCountry = new AdapterCountry();
        adapterCountry.setList(list2);
        recyclerView.setAdapter(adapterCountry);
    }


    private void loadData() {
        Bundle bundle = getArguments();
        list2 = new ArrayList<>();
        int id = bundle.getInt("key");
        if (id == 1) {
            list2.add(new Country(R.drawable.ic_launcher_background, "kg", " "));
        } else if (id == 2) {
            list2.add(new Country(R.drawable.ic_launcher_background, "kg", " "));
        } else if (id == 3) {
            list2.add(new Country(R.drawable.ic_launcher_background, "kg", " "));
        } else if (id == 4) {
            list2.add(new Country(R.drawable.ic_launcher_background, "kg", " "));

        } else if (id == 5) {
            list2.add(new Country(R.drawable.ic_launcher_background, "kg", " "));

        }
    }

}