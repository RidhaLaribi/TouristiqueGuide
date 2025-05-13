package com.example.mini_projet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.*;
import android.*;
import android.widget.Toast;

import java.util.ArrayList;

public class placeDetails extends AppCompatActivity {

    ImageView image;
    TextView title,desc,num,posi;
    Button call,map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_place_details);

        Toolbar toolbar = this.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //  back button
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle(getString(R.string.wilaya));
        }

        ArrayList<DPlace> sites = new ArrayList<>();



//        sites.add(new DPlace("Historical", "Emir Abdelkader Mosque", "A beautiful mosque", "Constantine", "987654321", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));
//        sites.add(new DPlace("Cultural", "Ahmed Bey Palace", "An Ottoman-style palace", "Constantine", "", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));
//        sites.add(new DPlace("Natural", "Tiddis Ruins", "Ancient Roman ruins", "Tiddis", "", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));
//        sites.add(new DPlace("Modern", "Pont Sidi M'Cid", "High suspension bridge", "Constantine", "554433221", R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background));

        // Historical Places
        sites.add(new DPlace(
                getString(R.string.category_historical),
                getString(R.string.constantine_bridge),
                getString(R.string.constantine_bridge_desc),
                getString(R.string.constantine_city),
                getString(R.string.constantine_bridge_tel),
                R.drawable.bridge1, R.drawable.bridge2, R.drawable.bridge3
        ));

        sites.add(new DPlace(
                getString(R.string.category_historical),
                getString(R.string.emir_abdelkader_mosque),
                getString(R.string.emir_abdelkader_mosque_desc),
                getString(R.string.constantine_city),
                getString(R.string.emir_abdelkader_mosque_tel),
                R.drawable.amir, R.drawable.amir2, R.drawable.amir1
        ));

        sites.add(new DPlace(
                getString(R.string.category_historical),
                getString(R.string.ahmed_bey_palace),
                getString(R.string.ahmed_bey_palace_desc),
                getString(R.string.constantine_city),
                "06245612351",
                R.drawable.ahmd, R.drawable.ahmd2, R.drawable.ahmd3
        ));

        sites.add(new DPlace(
                getString(R.string.category_historical),
                getString(R.string.monument_aux_morts),
                getString(R.string.monument_aux_morts_desc),
                getString(R.string.constantine_city),
                "",
                R.drawable.mnm, R.drawable.mnm2, R.drawable.mnm3
        ));

// Hotels
        sites.add(new DPlace(
                getString(R.string.category_hotel),
                getString(R.string.marriott_constantine),
                getString(R.string.marriott_constantine_desc),
                getString(R.string.constantine_city),
                getString(R.string.marriott_constantine_tel),
                R.drawable.m1, R.drawable.m2, R.drawable.m3
        ));

        sites.add(new DPlace(
                getString(R.string.category_hotel),
                getString(R.string.novotel_constantine),
                getString(R.string.novotel_constantine_desc),
                getString(R.string.constantine_city),
                "",
                R.drawable.n1, R.drawable.n2, R.drawable.n3
        ));

        sites.add(new DPlace(
                getString(R.string.category_hotel),
                getString(R.string.ibis_constantine),
                getString(R.string.ibis_constantine_desc),
                getString(R.string.constantine_city),
                "",
                R.drawable.i1, R.drawable.i2, R.drawable.i3
        ));

// Restaurants
        sites.add(new DPlace(
                getString(R.string.category_restaurant),
                getString(R.string.dar_el_founoun),
                getString(R.string.dar_el_founoun_desc),
                getString(R.string.constantine_city),
                "",
                R.drawable.d1, R.drawable.d2, R.drawable.d3
        ));

        sites.add(new DPlace(
                getString(R.string.category_restaurant),
                getString(R.string.diaf_dar),
                getString(R.string.diaf_dar_desc),
                getString(R.string.constantine_city),
                "",
                R.drawable.diaf1, R.drawable.diaf2, R.drawable.diaf3
        ));

        sites.add(new DPlace(
                getString(R.string.category_restaurant),
                getString(R.string.qasar_restaurant),
                getString(R.string.qasar_restaurant_desc),
                getString(R.string.constantine_city),
                "",
                R.drawable.q1, R.drawable.q3, R.drawable.q2
        ));

// Natural Places
        sites.add(new DPlace(
                getString(R.string.category_natural),
                getString(R.string.gorges_tighanimine),
                getString(R.string.gorges_tighanimine_desc),
                getString(R.string.constantine_city),
                "",
                R.drawable.g1, R.drawable.g2, R.drawable.g3
        ));

        sites.add(new DPlace(
                getString(R.string.category_natural),
                getString(R.string.oued_rhumel),
                getString(R.string.oued_rhumel_desc),
                getString(R.string.constantine_city),
                "",
                R.drawable.r1, R.drawable.r2, R.drawable.r3
        ));

        sites.add(new DPlace(
                getString(R.string.category_natural),
                getString(R.string.tiddis_ruins),
                getString(R.string.tiddis_ruins_desc),
                getString(R.string.tiddis_city),
                "",
                R.drawable.t1, R.drawable.t2, R.drawable.t3
        ));

        image=this.findViewById(R.id.im);
        title=this.findViewById(R.id.title);
        desc=this.findViewById(R.id.description);
        num=this.findViewById(R.id.tel);
        posi=this.findViewById(R.id.pos);

        Intent t=getIntent();

        String catg=t.getStringExtra("categ");
        getSupportActionBar().setTitle(catg);

        ArrayList<DPlace> filt=new ArrayList<>();
        for (DPlace el:sites) {
            if (el.getCat().equals(catg)){
                filt.add(el);
            }

        }



      int posit=t.getIntExtra("p",0);

        DPlace place = filt.get(posit);
      title.setText(""+place.getName());

        image.setImageResource(place.getPic1());
        title.setText(""+place.getName());
        desc.setText(""+place.getDesc());
        num.setText(""+place.getPhone());
        posi.setText(""+place.getLoc());

        call =this.findViewById(R.id.call);
        map=this.findViewById(R.id.map)  ;

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = num.getText().toString(); // Replace with your number
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(callIntent);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String locationName = title.getText().toString()+" , "+getString(R.string.wilaya); // Replace with your dynamic value

                // Create a geo URI to search
                Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode(locationName));

                // Create an intent
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                mapIntent.setPackage("com.google.android.apps.maps"); // Ensure it opens in Google Maps

                // Check if a map app can handle this intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(v.getContext(), "No map application found", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();  // Closes the activity when the back button is clicked
        return true;
    }

    public void callme(View v){

    }
}