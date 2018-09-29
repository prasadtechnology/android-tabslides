package com.example.lav.tabapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import arrayadapter.WordArrayAdapter;

public class Tab2Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        List<Word> wordList = new ArrayList<>();
        wordList.add(new Word("what","emiti"));
        wordList.add(new Word("how","elaga"));
        wordList.add(new Word("where","ekkada"));
        wordList.add(new Word("why","enduku"));
        wordList.add(new Word("when","eppudu"));
        wordList.add(new Word("I","nenu"));
        wordList.add(new Word("you","meeru"));
        wordList.add(new Word("we","manamu"));
        wordList.add(new Word("go","padaa"));
        wordList.add(new Word("coming","vastunava"));

        ListView WordsListView = (ListView) inflater.inflate(R.layout.base_layout, container, false);
        WordArrayAdapter WordArrayAdapter = new WordArrayAdapter(getContext(),R.layout.fragment_tab2,wordList,R.color.fragment2);
        WordsListView.setAdapter(WordArrayAdapter);

        return WordsListView;
    }
}
