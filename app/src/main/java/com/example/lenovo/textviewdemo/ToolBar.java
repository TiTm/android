package com.example.lenovo.textviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

/**
 * Created by lenovo on 2016/3/3.
 */
public class ToolBar  extends AppCompatActivity{
    private Toolbar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);
        bar= (Toolbar) findViewById(R.id.toobar);
        setSupportActionBar(bar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //设置标题
        bar.setTitle("标题");
//设置子标题
        bar.setSubtitle("子标题");
//设置Logo
        bar.setLogo(R.mipmap.ic_launcher);
//设置导航图标
        bar.setNavigationIcon(R.mipmap.ic_launcher);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
}
