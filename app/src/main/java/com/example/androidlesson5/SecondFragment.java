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
            list2.add(new Country(R.drawable.ic_ca, "Canada", " "));
            list2.add(new Country(R.drawable.ic_bb, "Barbados", " "));
            list2.add(new Country(R.drawable.ic_ag, "Antigua and Barbuda", " "));
            list2.add(new Country(R.drawable.ic_pa, "Panama", " "));
            list2.add(new Country(R.drawable.ic_cu, "Cuba", " "));
        } else if (id == 2) {
            list2.add(new Country(R.drawable.ic_ar, "Argentina", " "));
            list2.add(new Country(R.drawable.ic_br, "Brazil", " "));
            list2.add(new Country(R.drawable.ic_ve, "Venezuela", " "));
            list2.add(new Country(R.drawable.ic_uy, "Uruguay", " "));
            list2.add(new Country(R.drawable.ic_co, "Colombia", " "));
        } else if (id == 3) {
            list2.add(new Country(R.drawable.ic_dz, "Algeria", " "));
            list2.add(new Country(R.drawable.ic_ng, "Nigeria", " "));
            list2.add(new Country(R.drawable.ic_eg, "Egypt", " "));
            list2.add(new Country(R.drawable.ic_ly, "Liberia", " "));
            list2.add(new Country(R.drawable.ic_ml, "Mali", " "));
        } else if (id == 4) {
            list2.add(new Country(R.drawable.ic_mk, "North Macedonia", " "));
            list2.add(new Country(R.drawable.ic_td, "Romania", " "));
            list2.add(new Country(R.drawable.ic_de, "Germany", " "));
            list2.add(new Country(R.drawable.ic_it, "Italy", " "));
            list2.add(new Country(R.drawable.ic_ee, "Estonia", " "));

        } else if (id == 5) {
            list2.add(new Country(R.drawable.ic_jp, "Japan", " "));
            list2.add(new Country(R.drawable.ic_kr, "South Korea", " "));
            list2.add(new Country(R.drawable.ic_vn, "Vietnam", " "));
            list2.add(new Country(R.drawable.ic_cn, "China", " "));
            list2.add(new Country(R.drawable.ic_in, "India", " "));

        }else if (id == 6) {
            list2.add(new Country(R.drawable.ic_au, "Australia", " "));
            list2.add(new Country(R.drawable.ic_pw, "Palau", " "));
            list2.add(new Country(R.drawable.ic_fm, "Micronesia", " "));
            list2.add(new Country(R.drawable.ic_to, "Tonga", " "));
            list2.add(new Country(R.drawable.ic_nz, "New Zealand", " "));

        }
    }

}