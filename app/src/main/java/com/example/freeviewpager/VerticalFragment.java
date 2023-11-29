package com.example.freeviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;


/**
 * A simple {@link Fragment} subclass.
 */
public class VerticalFragment extends Fragment {

    private int position;

    public VerticalFragment() {
    }

    VerticalFragment(int position) {
        // Required empty public constructor
        this.position = position;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vertical, container, false);
        ViewPager2 viewPager2 = view.findViewById(R.id.viewPager2);

        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        adapter.setType(ViewPagerAdapter.TYPE_HORIZONTAL_VIEWPAGER,position);
        viewPager2.setAdapter(adapter);

        return view;
    }
}