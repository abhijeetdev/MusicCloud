package com.example.android.musiccloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Album album = (Album) getIntent().getSerializableExtra("SelectedAlbum");
        int index = (int) getIntent().getSerializableExtra("SelectedSongIndex");
        Song selectedSong = album.getSongs().get(index);
        ImageView imageView = (ImageView)findViewById(R.id.album_cover);
        imageView.setImageResource(album.getImageResourceID());

        TextView title = (TextView)findViewById(R.id.text_view_title);
        title.setText(selectedSong.getTitle());

        TextView singers = (TextView)findViewById(R.id.textViewSingers);
        singers.setText(selectedSong.getSingers());

    }
}
