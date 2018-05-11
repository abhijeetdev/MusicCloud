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
        Album album = (Album) getIntent().getSerializableExtra(Constants.SELECTED_ALBUM);
        int index = (int) getIntent().getSerializableExtra(Constants.SELECTED_SONG_INDEX);
        Song selectedSong = album.getSongs().get(index);
        ImageView imageView = (ImageView)findViewById(R.id.album_cover);
        imageView.setImageResource(album.getImageResourceID());

        TextView titleTextView = (TextView)findViewById(R.id.text_view_title);
        titleTextView.setText(selectedSong.getTitle());

        TextView singersTextView = (TextView)findViewById(R.id.textViewSingers);
        singersTextView.setText(selectedSong.getSingers());

    }
}
