package com.nepaltourguide.android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class PlacesList extends AppCompatActivity {

    /* private instance variable */
    private RecyclerView placeListRecyclerView;
    private RecyclerView.LayoutManager placeListLayoutManager;
    private RecyclerView.Adapter placeListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_places);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // get reference to recycler view
        placeListRecyclerView = (RecyclerView) findViewById(R.id.place_list_recycler_view);
        // change in content of the recyler view do not change in size of recycler view
        placeListRecyclerView.setHasFixedSize(true);
        placeListRecyclerView.setItemAnimator(new DefaultItemAnimator());

        // use linear layout manager
        placeListLayoutManager = new LinearLayoutManager(this);
        placeListRecyclerView.setLayoutManager(placeListLayoutManager);

        // specify an adapter
        placeListAdapter = new PlaceListAdapter();
        placeListRecyclerView.setAdapter(placeListAdapter);
    }

}
