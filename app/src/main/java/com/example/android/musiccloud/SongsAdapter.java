package com.example.android.musiccloud;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abhijeetb on 09/05/2018.
 */

public class SongsAdapter extends ArrayAdapter <Song> {
    public SongsAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0,songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.song_item, null);
        }

        Song currentSong = getItem(position);

        TextView titleTextView = (TextView)convertView.findViewById(R.id.textViewTitle);
        titleTextView.setText(currentSong.getTitle());

        TextView  durationTextView = (TextView)convertView.findViewById(R.id.textViewDuration);
        durationTextView.setText(currentSong.getDuration());

        return convertView;

    }

}
