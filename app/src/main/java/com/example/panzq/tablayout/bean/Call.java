package com.example.panzq.tablayout.bean;

public class Call {
    private String mName;
    private String mTime;
    private int mPersonIcon;

    public Call(String mName, String mTime, int mPersonIcon) {
        this.mName = mName;
        this.mTime = mTime;
        this.mPersonIcon = mPersonIcon;
    }

    public String getmName() {
        return mName;
    }

    public String getmTime() {
        return mTime;
    }

    public int getmPersonIcon() {
        return mPersonIcon;
    }
}
