package com.example.android.moodtracker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static android.support.v4.view.PagerAdapter.POSITION_NONE;

/**
 * Created by Anthony BOUTET - OpenClassromms on ${Date}.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    FragmentManager fragmentManager;
    Fragment fragment;


    public PagerAdapter(FragmentManager fm) {
        super(fm);
        this.fragmentManager = fm;
        this.fragment = fragment;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SadSmileyFragment();
            case 1:
                return new DisappointedSmileyFragment();
            case 2:
                return new NormalSmileyFragment();
            case 3:
                return new HappySmileyFragment();
            case 4:
                return new SuperHappySmileyFragment();
        }
        return null;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
