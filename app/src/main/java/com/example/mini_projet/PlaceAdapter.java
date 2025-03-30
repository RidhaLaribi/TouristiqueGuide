package com.example.mini_projet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import android.widget.ArrayAdapter;


public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.site, parent, false);
        }

        Place place = getItem(position);

        TextView nameTextView = convertView.findViewById(R.id.category);
        TextView descriptionTextView = convertView.findViewById(R.id.dsc);
        ImageView imageView1 = convertView.findViewById(R.id.picOfPlace);
        ImageView imageView2 = convertView.findViewById(R.id.imageView);

        nameTextView.setText(place.getName());
        descriptionTextView.setText(place.getDescription());
        imageView1.setImageResource(place.getImage1());
        imageView2.setImageResource(place.getImage2());

        return convertView;
    }
}
