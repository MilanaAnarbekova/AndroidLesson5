package com.example.androidlesson5;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCountry extends RecyclerView.Adapter<AdapterCountry.ViewHolder>  {

    private ArrayList<Country> country = new ArrayList<>();
    private OnClick onClick;
    public int hj;

    public AdapterCountry(ArrayList<Country> country, OnClick onClick) {
        this.country = country;
        this.onClick = onClick;
    }

    public AdapterCountry() {
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.Bind(country.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick.Listener(country.get(position));
            }
        }
        );
    }

    @Override
    public int getItemCount() {
        return country.size();
    }

    public Country getItem(int pos){
        return country.get(pos);
    }

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    public void setList(ArrayList<Country> list) {
        this.country = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements OnClick, View.OnClickListener {

        private ImageView imageView;
        private TextView continent;
        private TextView city;
        OnClick onClick;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            init(itemView);

        }

        private void init(View itemView) {
            imageView = itemView.findViewById(R.id.image_1);
            continent = itemView.findViewById(R.id.text_view_1);
            city = itemView.findViewById(R.id.text_view_2);

        }

        public void Bind(Country country) {
            imageView.setImageResource(country.getImage());
            continent.setText(country.getCountry());
            city.setText(country.getCity());

        }

        @Override
        public void Listener(Country country) {

        }

        @Override
        public void onClick(View v) {

        }

    }
    public interface OnClick {
        void Listener(Country country);

    }

}
