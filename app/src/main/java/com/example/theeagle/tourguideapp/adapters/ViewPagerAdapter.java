package com.example.theeagle.tourguideapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.theeagle.tourguideapp.ui.CafesFragment;
import com.example.theeagle.tourguideapp.ui.HotelsFragment;
import com.example.theeagle.tourguideapp.ui.RestaurantsFragment;
import com.example.theeagle.tourguideapp.ui.SitesFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SitesFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();

        } else if (position == 2) {
            return new CafesFragment();
        } else {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
