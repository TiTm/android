package com.example.lenovo.textviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.lenovo.textviewdemo.Adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 2016/3/2.
 */
public class ViewPager extends Activity {
    View view1;
    View view2;
    View view3;
    List<View> viewList;
    @Bind(R.id.viewpager)
    android.support.v4.view.ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager);
        ButterKnife.bind(this);
        LayoutInflater lf = getLayoutInflater().from(this);
        view1 = lf.inflate(R.layout.draw_left, null);
        view2 = lf.inflate(R.layout.activity_main, null);
        view3 = lf.inflate(R.layout.linearlayout, null);

        viewList = new ArrayList<>();// 将要分页显示的View装入数组中
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        ViewPagerAdapter vAdapter=new ViewPagerAdapter(viewList);
        viewpager.setAdapter(vAdapter);

    }
}
