package com.example.mini_projet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class TouristiqueGuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.touristique_guide);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //  back button
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle(getString(R.string.wilaya));
        }

        ArrayList<Category> sit=new ArrayList<Category>();
        sit.add(new Category(getString(R.string.category_historical), R.drawable.historical));
        sit.add(new Category(getString(R.string.category_hotel), R.drawable.hotel));
        sit.add(new Category(getString(R.string.category_restaurant), R.drawable.resturant));
        sit.add(new Category(getString(R.string.category_natural), R.drawable.nature));

        CategoryAdapter adp=new CategoryAdapter(this,sit);
////////
//        ArrayList<Place> places = new ArrayList<>();
//
//        places.add(new Place(getString(R.string.category_historical), getString(R.string.desc_historic), R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));
//        places.add(new Place(getString(R.string.category_museums), getString(R.string.desc_museums), R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));
//        places.add(new Place(getString(R.string.category_bridges), getString(R.string.desc_bridges), R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));
//        places.add(new Place(getString(R.string.category_religious), getString(R.string.desc_religious), R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));
//        places.add(new Place(getString(R.string.category_parks), getString(R.string.desc_parks), R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));
//        places.add(new Place(getString(R.string.category_shopping), getString(R.string.desc_shopping), R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));
//        places.add(new Place(getString(R.string.category_restaurants), getString(R.string.desc_restaurants), R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));
//        places.add(new Place(getString(R.string.category_theaters), getString(R.string.desc_theaters), R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));
//
//
//        PlaceAdapter adapter = new PlaceAdapter(this, places);
//////////////////
        ListView listView = this.findViewById(R.id.sites);
        listView.setAdapter(adp);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Category select= sit.get(position);
               Intent i = new Intent(TouristiqueGuideActivity.this, Detailsshow.class);
                i.putExtra("categ", select.getCatg());
               startActivity(i);
            }
        });



    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();  // Closes the activity when the back button is clicked
        return true;
    }
}