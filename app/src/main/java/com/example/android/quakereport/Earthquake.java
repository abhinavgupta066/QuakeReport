package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mDate;
    private String mUrl;
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    public double getmMagnitude(){
        return mMagnitude;
    }

    public String getmLocation(){
        return mLocation;
    }

    public String getmDate(){
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

}
