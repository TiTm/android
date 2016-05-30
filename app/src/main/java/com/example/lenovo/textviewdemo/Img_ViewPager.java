package com.example.lenovo.textviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 2016/3/2.
 */
public class Img_ViewPager extends Activity {
    int[] mlist;
    @Bind(R.id.viewpager)
    android.support.v4.view.ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_viewpager);
        ButterKnife.bind(this);
         final int[] m=new int[]{ R.mipmap.boy,R.mipmap.gril};

        viewpager.setAdapter(new PagerAdapter() {

            @Override  //添加
            public Object instantiateItem(ViewGroup container, int position) {
                ImageView imageView = new ImageView(Img_ViewPager.this);
                imageView.setImageResource(m[position]);
                container.addView(imageView);
                return imageView;
            }

            @Override//删除
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView((View) object);//删除页卡
            }

            @Override
            public int getCount() {
                return m.length;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view==object;
            }

        }
        );

    }
}
