package com.bawei.vvp;

import android.content.Context;
import android.graphics.Color;

import com.bawei.vvp.verticaltablayout.QTabView;
import com.bawei.vvp.verticaltablayout.TabAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyTabAdapter implements TabAdapter {

    List<String> titles;
    private Context context;

    public MyTabAdapter(Context context) {
        this.context = context;
    }

    {
        titles = new ArrayList<>();
        Collections.addAll(titles, "Android", "IOS", "Web", "JAVA", "C++"
        );
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public int getBadge(int position) {
        if (position == 5) return position;
        return 0;
    }

    @Override
    public QTabView.TabIcon getIcon(int position) {
        return null;
    }

    @Override
    public QTabView.TabTitle getTitle(int position) {
        return new QTabView.TabTitle.Builder(context)
                .setContent(titles.get(position))
                .setTextColor(Color.BLUE, Color.BLACK)
                .build();
    }

    @Override
    public int getBackground(int position) {
        return 0;
    }
}