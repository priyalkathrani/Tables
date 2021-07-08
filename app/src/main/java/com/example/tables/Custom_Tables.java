package com.example.tables;

public class Custom_Tables{
    private String mTable_text;
    private int maudioResoucefile;

    public Custom_Tables(String Table_text, int audioResourceId) {
        mTable_text = Table_text;
        maudioResoucefile = audioResourceId;
    }

    public String getTbales() {
        return mTable_text;
    }

    public int getMaudioResourceId() {
        return maudioResoucefile ;
    }
}