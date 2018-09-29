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
import arrayadapter.SentenceArrayAdaptor;

public class Tab3Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        List<Sentence> sentenceList = new ArrayList<>();
        sentenceList.add(new Sentence("How are you?","ela unaavu?"));
        sentenceList.add(new Sentence("I am fine","nenu bagunaanu"));
        sentenceList.add(new Sentence("are you coming?","nuvvu vastunaava?"));
        sentenceList.add(new Sentence("where are you?","ekada unavu?"));
        sentenceList.add(new Sentence("shall we will go to movie?","movie ki veldama?"));
        sentenceList.add(new Sentence("what you had?","emi tinnavu?"));
        sentenceList.add(new Sentence("i don't know","naaku teliyadu"));
        sentenceList.add(new Sentence("i know","naaku telusu"));
        sentenceList.add(new Sentence("you take it","nuvvu teesuko"));
        sentenceList.add(new Sentence("can you give book?","book istava?"));

        ListView sentenceListView = (ListView) inflater.inflate(R.layout.base_layout, container, false);
        SentenceArrayAdaptor sentenceArrayAdapter = new SentenceArrayAdaptor(getContext(),R.layout.fragment_tab3,sentenceList,R.color.fragment3);
        sentenceListView.setAdapter(sentenceArrayAdapter);
        
        return sentenceListView;
    }
}
