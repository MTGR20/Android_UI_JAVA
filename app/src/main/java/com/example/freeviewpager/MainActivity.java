package com.example.freeviewpager;

import android.os.Bundle;

import android.app.AlertDialog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewPager2);

        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        adapter.setType(ViewPagerAdapter.TYPE_VERTICAL_VIEWPAGER);
        viewPager2.setAdapter(adapter);
        viewPager2.setOffscreenPageLimit(6); // 현재 페이지 기준 앞6+뒤6 총 12개 live

        //=== TabLayout 기능 추가 부분 ============================================
        //TabLayout tabLayout = findViewById(R.id.tabLayout);
        //new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
        //    @Override
        //    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
        //        tab.setText("Tab " + (position + 1));
        //    }
        //}).attach();
        //========================================================================
    }
}
