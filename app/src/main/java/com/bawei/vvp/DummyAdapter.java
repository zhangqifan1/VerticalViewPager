package com.bawei.vvp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class DummyAdapter extends FragmentPagerAdapter {
        List<PlaceholderFragment> fragments = new ArrayList<>();
        private ArrayList<ArrayList<String>> lists;
        private Context context;
        public DummyAdapter(FragmentManager fm,ArrayList<ArrayList<String>> lists,Context context) {
            super(fm);
            this.lists=lists;
            this.context=context;
            //左边几个条目就循环几次
            for (int i = 0; i < 5; i++) {
                fragments.add(PlaceholderFragment.newInstance(i,lists.get(i),context));
            }
        }

    @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            //return PlaceholderFragment.newInstance(position + 1);
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 5;
        }

        @Override
         public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "PAGE 0";
                case 1:
                    return "PAGE 1";
                case 2:
                    return "PAGE 2";
                case 3:
                    return "PAGE 3";
                case 4:
                    return "PAGE 4";
            }
            return null;
        }
    }