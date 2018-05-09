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

public class SongsAdapter extends ArrayAdapter {
    public SongsAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0,songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.layout_song, null);
        }
        final TextView titleTextView = (TextView)convertView.findViewById(R.id.textViewTitle);
        titleTextView.setText("Tu Dil ki Dhadakan me");

        final TextView  singersTextView = (TextView)convertView.findViewById(R.id.textViewSingers);
        singersTextView.setText("Lata, asha, kishor");

        final TextView  durationTextView = (TextView)convertView.findViewById(R.id.textViewDuration);
        durationTextView.setText("4.54");

        return convertView;

    }

}
