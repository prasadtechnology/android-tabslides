package com.example.lav.tabapplication;

public class Word {
    private String teluguWord;
    private String englishWord;

    public Word(String teluguWord, String englishWord) {
        this.teluguWord = teluguWord;
        this.englishWord = englishWord;
    }

    public String getTeluguWord() {
        return teluguWord;
    }

    public void setTeluguWord(String teluguWord) {
        this.teluguWord = teluguWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }
}
