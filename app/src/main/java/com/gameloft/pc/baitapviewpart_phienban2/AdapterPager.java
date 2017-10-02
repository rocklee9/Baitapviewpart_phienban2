package com.gameloft.pc.baitapviewpart_phienban2;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by minhhoang on 10/2/2017.
 */

public class AdapterPager extends FragmentStatePagerAdapter {
    public AdapterPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;

        switch (position){
            case 0:
                frag = new rong();
                break;
            case 1:
                frag= new rua();
                break;
            case 2:
                frag= new ech();
                break;
        }
        return frag;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title="Tag1";
                break;
            case 1:
                title="Tag2";
                break;
            case 2:
                title="Tag3";
                break;
        }

        return title;
    }
}
