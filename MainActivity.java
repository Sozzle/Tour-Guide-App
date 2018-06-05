package com.example.android.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.android.tourguide.R.id.tabs;
import static com.example.android.tourguide.R.id.view_pager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find theviewpager that will allow the user to swipe between fragments.

        ViewPager viewPager = findViewById(R.id.viewpager);

        //Create an adapter that knows which fragment should be shown on each page.

        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        //Set the adapter onto the viewpager

        ViewPager.setAdapter(adapter);

        //Give the Tablayout the ViewPager

        TabLayout tablayout = findViewById(tabs);
        tablayout.setupWithViewPager(viewPager);




    }




}

