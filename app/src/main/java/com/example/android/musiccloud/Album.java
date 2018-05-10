package com.example.android.musiccloud;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by abhijeetb on 09/05/2018.
 */

public class Album implements Serializable {
    private String mTitle;
    private int mImageResourceID;
    private int mIconImageResourceID;
    private ArrayList<Song> mSongs;

    public String getTitle() { return mTitle; }
    public int getImageResourceID() { return mImageResourceID; }
    public int getIconResourceID() { return mIconImageResourceID; }
    public ArrayList<Song> getSongs() { return  mSongs; }

    public  Album(String title, int imageResourceID, int iconResosourceID, ArrayList<Song> songs) {
        mTitle = title;
        mImageResourceID = imageResourceID;
        mSongs = songs;
        mIconImageResourceID =iconResosourceID;
    }

}
