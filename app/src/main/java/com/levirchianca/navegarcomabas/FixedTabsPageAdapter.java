package com.levirchianca.navegarcomabas;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Aluno on 05/10/2016.
 */
public class FixedTabsPageAdapter extends FragmentPagerAdapter {

    public FixedTabsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return  new Fragment1();
            case 1:
                return  new Fragment2();
            case 2:
                return  new Fragment3();
            default:
                return null;
        }

    }
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Tab1";
            case 1:
                return "Tab2";
            case 2:
                return "Tab3";
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
