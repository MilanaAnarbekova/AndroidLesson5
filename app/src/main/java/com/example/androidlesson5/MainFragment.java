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


public class MainFragment extends Fragment implements AdapterCountry.OnClick {

    private AdapterCountry adapterCountry;
    ArrayList<Country> list = new ArrayList<>();
    Country country;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();




        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        adapterCountry = new AdapterCountry();
        adapterCountry.setList(list);
        recyclerView.setAdapter(adapterCountry);


    }

    private void loadData() {
        list.add(new Country(R.drawable.ic_launcher_background, "kg", " ", 1));
        list.add(new Country(R.drawable.ic_launcher_background, "kg", " ", 2));
        list.add(new Country(R.drawable.ic_launcher_background, "kg", " ", 3));
        list.add(new Country(R.drawable.ic_launcher_background, "kg", " ", 4));
        list.add(new Country(R.drawable.ic_launcher_background, "kg", " ", 5));
        list.add(new Country(R.drawable.ic_launcher_background, "kg", " ", 6));

    }


    @Override
    public void Listenner(Country country) {
        SecondFragment fragment = new SecondFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("key", country.getId());
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}