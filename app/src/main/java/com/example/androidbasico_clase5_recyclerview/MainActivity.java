package com.example.androidbasico_clase5_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<BandaRock> bandasRock = new ArrayList<>();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewRock);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        crearBandasRock();
        adapter = new BandaRockAdapter(bandasRock);
        recyclerView.setAdapter(adapter);
    }

    private void crearBandasRock() {
        BandaRock vanHalen = new BandaRock(getResources().getIdentifier("van_halen", "drawable", getPackageName()), "Van Halen", "Van Halen 1");
        bandasRock.add(vanHalen);
        BandaRock acdc = new BandaRock(getResources().getIdentifier("acdc", "drawable", getPackageName()), "AcDc", "HighWay to Hell");
        bandasRock.add(acdc);
        BandaRock metallica = new BandaRock(getResources().getIdentifier("metallica", "drawable", getPackageName()), "Metallica", "Ride the Lighting");
        bandasRock.add(metallica);
        BandaRock deepPurple = new BandaRock(getResources().getIdentifier("deeppurple", "drawable", getPackageName()), "Deep Purple", "Machene head");
        bandasRock.add(deepPurple);
        BandaRock gunsAndRoses = new BandaRock(getResources().getIdentifier("guns", "drawable", getPackageName()), "Guns and Roses", "Appetite for destruction");
        bandasRock.add(gunsAndRoses);
        BandaRock fooFighters = new BandaRock(getResources().getIdentifier("foofighters", "drawable", getPackageName()), "Foofighters", "Skin and Bones");
        bandasRock.add(fooFighters);
        BandaRock ironMaiden = new BandaRock(getResources().getIdentifier("ironmaiden", "drawable", getPackageName()), "Iron Maiden", "Seven son of the Seven son");
        bandasRock.add(ironMaiden);
    }
}
