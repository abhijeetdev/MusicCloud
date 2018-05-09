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

        //final ImageView imageView = (ImageView)convertView.findViewById(R.id.imageView_cover_art);
        //final ImageView imageViewFavorite = (ImageView)convertView.findViewById(R.id.image_view_favorite_album);
        final TextView albumNameTextView = (TextView)convertView.findViewById(R.id.text_view_album_name);


        albumNameTextView.setText(String.valueOf(position));
        return convertView;
    }
}
