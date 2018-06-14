package com.nepaltourguide.android;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by kiran on 6/8/16.
 */
public class PlaceListAdapter extends RecyclerView.Adapter<PlaceListAdapter.PlaceListViewHolder> {
    /* private instance variable */
    private static final String LOG_TAG = PlaceListAdapter.class.getSimpleName();
    private LayoutInflater inflater;
    private List<PlaceItem> placeList = Collections.emptyList();

    /**
     * Constructor for this class
     */
    public PlaceListAdapter(/*Context context, List<PlaceItem> placeList*/) {
        //inflater = LayoutInflater.from(context);
        //this.placeList = placeList;
    }

    // Provide a reference to the views for each data item
    // View holder for this adapter
    public static class PlaceListViewHolder extends RecyclerView.ViewHolder {
        ImageView placeNameView;

        public PlaceListViewHolder(View v) {
            super(v);

            placeNameView = (ImageView) v.findViewById(R.id.place_image_view);
        }
    }

    // Create a new view (invoked by the layout manager)
    @Override
    public PlaceListAdapter.PlaceListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.v(LOG_TAG, "RecyclerView holder called.");

        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.place_list_item_widget, parent, false);

        PlaceListViewHolder placeListViewHolder = new PlaceListViewHolder(view);

        return placeListViewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(PlaceListAdapter.PlaceListViewHolder holder, int position) {
        // - get element from dataset at this positon
        // - replace the contents of the view with that element
        Log.v(LOG_TAG, "onBindViewHolder called.");

        // final PlaceItem current = placeList.get(position);

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
