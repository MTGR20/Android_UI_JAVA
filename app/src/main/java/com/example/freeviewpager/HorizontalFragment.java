package com.example.freeviewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HorizontalFragment extends Fragment {

    private TextView tv_text;
    private int count;
    private int position;

    public HorizontalFragment() {
    }

    HorizontalFragment(int position, int count) {
        // Required empty public constructor
        this.position = position;
        this.count = count;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_horizontal, container, false);
        tv_text = view.findViewById(R.id.tv_text);

        String text = "가로 : " + position + "\n" + "세로 : " + count;
        tv_text.setText(text);
        return view;
    }

}
