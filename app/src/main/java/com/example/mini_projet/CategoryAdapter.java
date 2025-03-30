package com.example.mini_projet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Category>{
    public CategoryAdapter(Context c, ArrayList<Category> a ){
        super(c,0,a);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.acategory, parent, false);
        }

        Category c =  getItem(position);

        TextView name = convertView.findViewById(R.id.title);
        ImageView bg = convertView.findViewById(R.id.backgroundImage);

        name.setText(c.getCatg());
        bg.setImageResource(c.getImage());

        return convertView;
    }
}
