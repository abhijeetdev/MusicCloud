package com.example.android.musiccloud;

import java.io.Serializable;

/**
 * Created by abhijeetb on 09/05/2018.
 */

public class Song implements Serializable {

    private String mTitle;
    private String mSingers;
    private String mDuration;

    public Song(String title, String singers, String duration) {
        mTitle = title;
        mSingers = singers;
        mDuration = duration;
    }

    public String getTitle() { return mTitle; }
    public String getSingers() { return mSingers; }
    public String getDuration() { return mDuration; }
}
