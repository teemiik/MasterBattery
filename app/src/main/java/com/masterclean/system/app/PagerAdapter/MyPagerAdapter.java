package com.masterclean.system.app.PagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.masterclean.system.app.Fragments.BatterySaver;
import com.masterclean.system.app.Fragments.CPUCooler;
import com.masterclean.system.app.Fragments.JunkCleaner;
import com.masterclean.system.app.Fragments.PhoneBooster;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public MyPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                PhoneBooster tab1 = new PhoneBooster();
                return tab1;
            case 1:
                BatterySaver tab2 = new BatterySaver();
                return tab2;
            case 2:
                CPUCooler tab3 = new CPUCooler();
                return tab3;
            case 3:
                JunkCleaner tab4 = new JunkCleaner();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
