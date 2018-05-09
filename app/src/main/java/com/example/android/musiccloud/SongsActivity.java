package com.example.android.musiccloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song());
        songs.add(new Song());
        songs.add(new Song());
        songs.add(new Song());
        songs.add(new Song());
        songs.add(new Song());
        songs.add(new Song());
        songs.add(new Song());
        songs.add(new Song());
        songs.add(new Song());
        songs.add(new Song());
        songs.add(new Song());

        SongsAdapter adapter = new SongsAdapter(this, songs);
        ListView listView = (ListView)findViewById(R.id.list_view_songs);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
