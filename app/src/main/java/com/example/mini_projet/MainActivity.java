package com.example.mini_projet;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button go ;
    ListView namesEtd;
    RadioGroup mode,lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//header
        Toolbar toolbar = findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);

//etudients

        ArrayList  names = new ArrayList<String>();
        names.add("Rida Laribi");
        names.add("Ramsey Tazekrit");
        names.add("idir ait-ali");

        namesEtd = this.findViewById(R.id.name);
        ArrayAdapter ad=new ArrayAdapter<>(this, R.layout.item,names);


        namesEtd.setAdapter(ad);

        mode=this.findViewById(R.id.mode);
        mode.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.dark){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    return;

                }
                else {AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });


        lang=this.findViewById(R.id.lang);
        lang.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String selectedLanguage = (checkedId == R.id.ar) ? "ar" : "en";

                // Avoid refreshing if already in the selected language
                if (getResources().getConfiguration().locale.getLanguage().equals(selectedLanguage)) {
                    return;
                }

                // Set the Locale
                Locale locale = new Locale(selectedLanguage);
                Locale.setDefault(locale);

                // Update Configuration
                Configuration config = new Configuration();
                config.locale = locale;
                getResources().updateConfiguration(config, getResources().getDisplayMetrics());

                // Refresh Activity
                recreate(); // Reloads the current activity to apply changes
            }

        });


        go=this.findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guid=new Intent(MainActivity.this,TouristiqueGuideActivity.class);
                startActivity(guid);
            }
        });



    }
}