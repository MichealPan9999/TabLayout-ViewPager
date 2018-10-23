package com.example.simpletablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    ArrayList<MyFragment> fragments;
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        //初始化数据
        fragments = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            fragments.add(new MyFragment("标题" + i, "内容" + i));
        }
        //设置ViewPager的适配器
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
        //关联ViewPager
        tabLayout.setupWithViewPager(viewPager);
    }
}
