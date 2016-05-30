package com.example.lenovo.textviewdemo.Adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lenovo on 2016/3/2.
 */
public class newVpA extends PagerAdapter {
    private List<View> mlist;

    public newVpA(List<View> mlist) {
        this.mlist = mlist;
    }



    @Override  //添加
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mlist.get(position));//添加页卡
        return mlist.get(position);
    }

    @Override//删除
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mlist.get(position));//删除页卡
      }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
