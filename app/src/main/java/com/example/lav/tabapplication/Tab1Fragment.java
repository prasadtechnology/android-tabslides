package com.example.lav.tabapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import arrayadapter.NumberArrayAdapter;

public class Tab1Fragment extends Fragment {

    MediaPlayer mediaPlayer;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        List<Number> numberList = new ArrayList<>();
        numberList.add(new Number("one","okati",R.drawable.number_one));
        numberList.add(new Number("two","rendu",R.drawable.number_two));
        numberList.add(new Number("three","moodu",R.drawable.number_three));
        numberList.add(new Number("four","nalugu",R.drawable.number_four));
        numberList.add(new Number("five","aidu",R.drawable.number_five));
        numberList.add(new Number("six","aaru",R.drawable.number_six));
        numberList.add(new Number("seven","edu",R.drawable.number_seven));
        numberList.add(new Number("eight","enimidi",R.drawable.number_eight));
        numberList.add(new Number("nine","thommidi",R.drawable.number_nine));
        numberList.add(new Number("ten","padi",R.drawable.number_ten));

        ListView numbersListView = (ListView) inflater.inflate(R.layout.base_layout, container, false);
        NumberArrayAdapter numberArrayAdapter = new NumberArrayAdapter(getContext(),R.layout.fragment_tab1,numberList,R.color.fragment1);
        numbersListView.setAdapter(numberArrayAdapter);

        return numbersListView;
    }

}
