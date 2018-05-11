package com.example.android.musiccloud;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abhijeetb on 09/05/2018.
 */

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(Activity context, ArrayList<Album> albums) { super(context, 0, albums);}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.layout_album, null);
        }

        Album album = getItem(position);

        final ImageView imageView = (ImageView)convertView.findViewById(R.id.imageViewCoverArt);
        imageView.setImageResource(album.getIconResourceID());
        final TextView albumNameTextView = (TextView)convertView.findViewById(R.id.textViewAlbumName);
        albumNameTextView.setText(album.getTitle());

        return convertView;
    }
}
