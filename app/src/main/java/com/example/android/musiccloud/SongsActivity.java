package com.example.android.musiccloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    final Album album = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        final Album album = (Album) getIntent().getSerializableExtra(Constants.SELECTED_ALBUM);
        SongsAdapter songsAdapter = new SongsAdapter(this, album.getSongs());

        ImageView albumCover = (ImageView)findViewById(R.id.album_cover);
        albumCover.setImageResource(album.getImageResourceID());

        ListView songsListView = (ListView)findViewById(R.id.list_view_songs);
        songsListView.setAdapter(songsAdapter);

        songsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra(Constants.SELECTED_ALBUM, album);
                intent.putExtra(Constants.SELECTED_SONG_INDEX,i);
                startActivity(intent);
            }
        });

    }
}
