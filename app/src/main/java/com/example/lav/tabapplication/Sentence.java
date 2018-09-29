package com.example.lav.tabapplication;

public class Sentence {
    private String teluguSentence;
    private String englishSentence;

    public Sentence(String teluguSentence, String englishSentence) {
        this.teluguSentence = teluguSentence;
        this.englishSentence = englishSentence;
    }

    public String getTeluguSentence() {
        return teluguSentence;
    }

    public void setTeluguSentence(String teluguSentence) {
        this.teluguSentence = teluguSentence;
    }

    public String getEnglishSentence() {
        return englishSentence;
    }

    public void setEnglishSentence(String englishSentence) {
        this.englishSentence = englishSentence;
    }
}
