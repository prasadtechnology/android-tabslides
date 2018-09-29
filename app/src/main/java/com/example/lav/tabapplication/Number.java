package com.example.lav.tabapplication;

public class Number {
    private String englishNumber;
    private String teluguNumber;
    private int imageResourceId;
    private int mediaResourceId;

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getMediaResourceId() {
        return mediaResourceId;
    }

    public void setMediaResourceId(int mediaResourceId) {
        this.mediaResourceId = mediaResourceId;
    }

    public Number(String englishNumber, String teluguNumber, int imageResourceId){
        this.englishNumber = englishNumber;
        this.teluguNumber = teluguNumber;
        this.imageResourceId = imageResourceId;
    }

    public String getTeluguNumber() {
        return teluguNumber;
    }

    public void setTeluguNumber(String teluguNumber) {
        this.teluguNumber = teluguNumber;
    }

    public String getEnglishNumber() {
        return englishNumber;
    }

    public void setEnglishNumber(String englishNumber) {
        this.englishNumber = englishNumber;
    }
}
