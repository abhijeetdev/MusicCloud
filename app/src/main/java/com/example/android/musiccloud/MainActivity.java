package com.example.android.musiccloud;

import android.content.Intent;
import android.support.constraint.solver.widgets.Guideline;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album());
        albums.add(new Album());
        albums.add(new Album());
        albums.add(new Album());
        albums.add(new Album());
        albums.add(new Album());
        albums.add(new Album());
        albums.add(new Album());
        albums.add(new Album());
        albums.add(new Album());
        albums.add(new Album());
        albums.add(new Album());

        final AlbumAdapter albumAdapter = new AlbumAdapter(this, albums);
        //ArrayAdapter<String> songsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, albums);
        GridView gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(albumAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                // This tells the GridView to redraw itself
                // in turn calling your BooksAdapter's getView method again for each cell
                Intent intent = new Intent(view.getContext(), SongsActivity.class);
                startActivity(intent);
                albumAdapter.notifyDataSetChanged();
            }
        });

    }
}
