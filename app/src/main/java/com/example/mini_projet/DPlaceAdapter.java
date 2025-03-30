package com.example.mini_projet;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DPlaceAdapter extends ArrayAdapter<DPlace> {
String c;
    public DPlaceAdapter(Context c,ArrayList<DPlace> p,String ctg){
        super(c,0,p);
        this.c=ctg;
    }
     @Override
    public View getView(int pos , View v, ViewGroup parent){
        v= LayoutInflater.from(getContext()).inflate(R.layout.detailp,parent,false);


         TextView name=v.findViewById(R.id.name);
         TextView des = v.findViewById(R.id.dsc);
         TextView tel = v.findViewById(R.id.tel);
         TextView loc = v.findViewById(R.id.loc);

         ImageView imageView1 = v.findViewById(R.id.pic1);
         ImageView imageView2 = v.findViewById(R.id.pic2);
         ImageView imageView3 = v.findViewById(R.id.pic3);

         DPlace place = getItem(pos);

         if (place != null && this.c.equals(place.getCat())) {
             name.setText(place.getName());
             des.setText(place.getDesc());
             tel.setText(place.getPhone());
             loc.setText(place.getLoc());

             imageView1.setImageResource(place.getPic1());
             imageView2.setImageResource(place.getPic2());
             imageView3.setImageResource(place.getPic3());

             v.setVisibility(View.VISIBLE);
         } else {
             v.setVisibility(View.GONE); // Hide items that don't match the category
         }

         return v;

     }
}
