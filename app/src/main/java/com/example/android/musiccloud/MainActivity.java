package com.example.android.musiccloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Album> albums = new ArrayList<>();
        ArrayList<Song> songs = new ArrayList<>();
                songs.add(new Song("Ae Watan (Male)","Arijit Singh","03:43"));
                songs.add(new Song("Dilbaro","Harshdeep Kaur, Vibha Saraf, Shankar Mahadevan","05:14"));
                songs.add(new Song("Razi title track","Arijit Singh","06:30"));
                songs.add(new Song("Ae Watan (Female)","Sunidhi Chauhan","03:31"));
        albums.add(new Album("Raazi", R.drawable.raazi,R.drawable.raazi_icon, songs));

        songs = new ArrayList<>();
        songs.add(new Song("Ae Watan (Male)","Arijit Singh","03:43"));
        songs.add(new Song("Dilbaro","Harshdeep Kaur, Vibha Saraf, Shankar Mahadevan","05:14"));
        songs.add(new Song("Razi title track","Arijit Singh","06:30"));
        songs.add(new Song("Ae Watan (Female)","Sunidhi Chauhan","03:31"));
        albums.add(new Album("Raazi 1", R.drawable.raazi,R.drawable.raazi_icon, songs));

        songs = new ArrayList<>();
        songs.add(new Song("Ae Watan (Male)","Arijit Singh","03:43"));
        songs.add(new Song("Dilbaro","Harshdeep Kaur, Vibha Saraf, Shankar Mahadevan","05:14"));
        songs.add(new Song("Razi title track","Arijit Singh","06:30"));
        songs.add(new Song("Ae Watan (Female)","Sunidhi Chauhan","03:31"));
        albums.add(new Album("Raazi 2", R.drawable.raazi,R.drawable.raazi_icon, songs));

        songs = new ArrayList<>();
        songs.add(new Song("Ae Watan (Male)","Arijit Singh","03:43"));
        songs.add(new Song("Dilbaro","Harshdeep Kaur, Vibha Saraf, Shankar Mahadevan","05:14"));
        songs.add(new Song("Razi title track","Arijit Singh","06:30"));
        songs.add(new Song("Ae Watan (Female)","Sunidhi Chauhan","03:31"));
        albums.add(new Album("Raazi 3", R.drawable.raazi,R.drawable.raazi_icon, songs));


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
                intent.putExtra("SelectedAlbum", albums.get(position));
                startActivity(intent);
                albumAdapter.notifyDataSetChanged();
            }
        });

    }
}
