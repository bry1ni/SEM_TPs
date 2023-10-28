package com.example.bastion23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Palais18Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palais18);

        GridView gv_galery = findViewById(R.id.gdv_galeryImage);

        String[] partNames = {"Porte maison 5","Porte Noir","Porte noir de face","Porte marron de face",
                                "Porte marron de loin","Chambre","Cours","passage3D","Passage","Salon"};
        int[] partImages = {R.drawable.bab_maison5,
                            R.drawable.babka7la,
                            R.drawable.babka7la_face,
                            R.drawable.babmaron_face,
                            R.drawable.babmaron_loin,
                            R.drawable.chambre,
                            R.drawable.la_cours,
                            R.drawable.passage,
                            R.drawable.passage_real,
                            R.drawable.salon,};

        GridAdapter gridAdapter = new GridAdapter(Palais18Activity.this, partNames, partImages);
        gv_galery.setAdapter(gridAdapter);


    }
}