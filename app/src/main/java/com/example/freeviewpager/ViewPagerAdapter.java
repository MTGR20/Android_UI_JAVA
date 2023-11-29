package com.example.freeviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    final static int TYPE_VERTICAL_VIEWPAGER = 1001;
    final static int TYPE_HORIZONTAL_VIEWPAGER = 1002;
    private int type;
    private int count;

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    public void setType(int type){
        this.type = type;
    }

    public void setType(int type,int count){
        this.type = type;
        this.count = count;
    }

    //보여줄 Fragment
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(type == TYPE_VERTICAL_VIEWPAGER){
            return new VerticalFragment(position);
        } else{
            return new HorizontalFragment(position,count);
        }
    }

    //Fragment 갯수
    @Override
    public int getItemCount() {
        if(type == TYPE_VERTICAL_VIEWPAGER){
            return 10;
        } else{
            return 2;
        }
    }
}
