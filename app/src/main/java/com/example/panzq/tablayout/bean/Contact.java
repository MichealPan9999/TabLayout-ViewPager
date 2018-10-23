package com.example.panzq.tablayout.bean;

public class Contact {
    private String mName;
    private String mPhone;
    private int mPicture;

    public Contact(String mName, String mPhone, int mPicture) {
        this.mName = mName;
        this.mPhone = mPhone;
        this.mPicture = mPicture;
    }

    public String getmName() {
        return mName;
    }

    public int getmPicture() {
        return mPicture;
    }

    public String getmPhone() {
        return mPhone;
    }
}
