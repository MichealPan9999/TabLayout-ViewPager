package com.example.panzq.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import com.example.panzq.tablayout.adapters.CallPagerAdapter;
import com.example.panzq.tablayout.fragments.ContactCallFragment;
import com.example.panzq.tablayout.fragments.FavouriteCallFragment;
import com.example.panzq.tablayout.fragments.KeypadCallFragment;
import com.example.panzq.tablayout.fragments.RecentCallFragment;
import com.example.panzq.tablayout.fragments.VoicemailCallFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        final ViewPager viewPager = findViewById(R.id.viewPager);

        CallPagerAdapter callPagerAdapter = new CallPagerAdapter(getSupportFragmentManager());
        callPagerAdapter.addFragment(new RecentCallFragment(), "RECENT");
        callPagerAdapter.addFragment(new FavouriteCallFragment(), "FAVOURITE");
        callPagerAdapter.addFragment(new ContactCallFragment(), "CONTACTS");
        callPagerAdapter.addFragment(new KeypadCallFragment(), "KEYPAD");
        callPagerAdapter.addFragment(new VoicemailCallFragment(), "VOICEMAIL");
        fun1(tabLayout, viewPager, callPagerAdapter);
        //fun2(tabLayout, viewPager, callPagerAdapter);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_star_border_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_person_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_dialpad_black_24dp);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_voicemail_black_24dp);
    }

    private void fun2(TabLayout tabLayout, final ViewPager viewPager, CallPagerAdapter callPagerAdapter) {
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition(),true);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        //tabLayout.setTabsFromPagerAdapter(callPagerAdapter);
        viewPager.setAdapter(callPagerAdapter);
    }

    private void fun1(TabLayout tabLayout, ViewPager viewPager, CallPagerAdapter callPagerAdapter) {
        viewPager.setAdapter(callPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
