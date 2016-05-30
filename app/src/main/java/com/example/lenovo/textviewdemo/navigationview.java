package com.example.lenovo.textviewdemo;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.nineoldandroids.view.ViewHelper;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 2016/3/4.
 */
public class navigationview extends AppCompatActivity {
    @Bind(R.id.id_nv_menu)
    NavigationView idNvMenu;
    @Bind(R.id.bgimg)
    LinearLayout bgimg;

    private Snackbar snackbar;

    Toolbar toolbar;
    private DrawerLayout mdrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigationview);
        ButterKnife.bind(this);
        toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setTitle("侧滑布局");
        initView();
        initEvents();
        click();
    }


    private void click() {
        idNvMenu.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            MenuItem nmenuItem;

            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                //首先将选中条目变为选中状态 即checked为true,后关闭Drawer，以前选中的Item需要变为未选中状态
//                if (nmenuItem != null)
//                    nmenuItem.setChecked(false);
//                nmenuItem.setChecked(true);
//                mdrawerLayout.closeDrawers();
//                nmenuItem = item;

                switch (item.getItemId()) {
                    case R.id.left1:
                        bgimg.setBackgroundResource(R.mipmap.boy);
                        mdrawerLayout.closeDrawers();
                        break;
                    case R.id.left2:
                        bgimg.setBackgroundResource(R.mipmap.gril);
                        mdrawerLayout.closeDrawers();
                        break;
                    case R.id.left3:
                        bgimg.setBackgroundResource(R.mipmap.boy);
                        mdrawerLayout.closeDrawers();
                        break;
                    case R.id.left4:
                        bgimg.setBackgroundResource(R.mipmap.gril);
                        mdrawerLayout.closeDrawers();
                        break;
                    case R.id.left_1:
                        bgimg.setBackgroundResource(R.mipmap.boy);
                        mdrawerLayout.closeDrawers();
                        break;
                    case R.id.left_2:
                        bgimg.setBackgroundResource(R.mipmap.gril);
                        mdrawerLayout.closeDrawers();
                        break;
                }
                return true;
            }
        });

    }

    private void initEvents() {
        mdrawerLayout.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerStateChanged(int newState) {
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                View mContent = mdrawerLayout.getChildAt(0);
                View mMenu = drawerView;
                float scale = 1 - slideOffset;
                float rightScale = 0.8f + scale * 0.2f;

                float leftScale = 1 - 0.2f * scale;

                ViewHelper.setScaleX(mMenu, leftScale);
                ViewHelper.setScaleY(mMenu, leftScale);
                ViewHelper.setAlpha(mMenu, 0.6f + 0.4f * (1 - scale));
                ViewHelper.setTranslationX(mContent, mMenu.getMeasuredWidth() * (1 - scale));
                ViewHelper.setPivotX(mContent, 0);
                ViewHelper.setPivotY(mContent, mContent.getMeasuredHeight() / 2);
                mContent.invalidate();
                ViewHelper.setScaleX(mContent, rightScale);
                ViewHelper.setScaleY(mContent, rightScale);

            }

            @Override
            public void onDrawerOpened(View drawerView) {
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                mdrawerLayout.setDrawerLockMode(
                        DrawerLayout.LOCK_MODE_LOCKED_CLOSED, Gravity.RIGHT);
            }
        });
    }

    private void initView() {
        mdrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mdrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED,
                Gravity.RIGHT);
    }

}
