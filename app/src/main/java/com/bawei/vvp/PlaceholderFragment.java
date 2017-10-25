package com.bawei.vvp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
     * A placeholder fragment containing a simple view.
     */
    public class PlaceholderFragment extends Fragment {
    String[] array = new String[]{"Android 1", "Android 2", "Android 3",
                "Android 4", "Android 5", "Android 6", "Android 7", "Android 8",
                "Android 9", "Android 10", "Android 11", "Android 12", "Android 13",
                "Android 14", "Android 15", "Android 16"};

        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        private static final String ARG_LISTNUMBER = "list_number";
        private static final String ARG_CONTEXT = "context";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        private  static List<String> list;
        private  static Context context;
        public static PlaceholderFragment newInstance(int sectionNumber, ArrayList<String> list1, Context context1) {
            PlaceholderFragment fragment = new PlaceholderFragment(list1,context1);
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            args.putStringArrayList(ARG_LISTNUMBER,list1);
            context=context1;
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment(List<String> list1,Context context1) {
            this.list=list1;
            this.context=context1;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            final View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

            Log.d("Debug", "creating fragment "
                    + getArguments().getInt(ARG_SECTION_NUMBER));

            switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
                case 0:
                    break;
                case 1:
                    rootView.setBackgroundColor(Color.BLACK);
                    break;

                case 2:
                    rootView.setBackgroundColor(Color.BLUE);
                    break;

                case 3:
                    rootView.setBackgroundColor(Color.GREEN);
                    break;

                case 4:
                    rootView.setBackgroundColor(Color.RED);
                    break;
            }
            final ListView listView = (ListView) rootView.findViewById(R.id.listView);

            ListViewAdapter listViewAdapter = new ListViewAdapter(list, context);
            listView.setAdapter(listViewAdapter);
            return rootView;
        }
    }