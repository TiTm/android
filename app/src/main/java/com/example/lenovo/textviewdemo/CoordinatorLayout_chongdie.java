package com.example.lenovo.textviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.lenovo.textviewdemo.Adapter.RecylerviewAdapter;
import com.example.lenovo.textviewdemo.entiy.Person;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 2016/3/4.
 */
public class CoordinatorLayout_chongdie extends AppCompatActivity {


    @Bind(R.id.collapsing_toolbar)
    Toolbar collapsingToolbar;
    @Bind(R.id.rvToDoLists)
    RecyclerView rvToDoList;
    @Bind(R.id.main_contents)
    android.support.design.widget.CoordinatorLayout mainContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinatorlayout_chongdie);
        ButterKnife.bind(this);
//        toolbar_chongdie.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v, "FAB", Snackbar.LENGTH_LONG)
//                        .setAction("cancel", new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                //这里的单击事件代表点击消除Action后的响应事件
//
//                            }
//                        })
//                        .show();
//            }
//        });
//
//        toolbar_chongdie.setTitle("重叠");
//        toolbar_chongdie.setSubtitle("12321");
//        setSupportActionBar(toolbar_chongdie);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);

//        //设置标题
//        toolbar.setTitle("标题");
////设置子标题
//        toolbar.setSubtitle("子标题");
////设置Logo
//        toolbar.setLogo(R.mipmap.ic_launcher);
////设置导航图标
//        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
//        toolbar.setOnMenuItemClickListener(onMenuItemClick);

        //_________________________________________
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("张三", "男"));
        persons.add(new Person("李四", "女"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("赵六", "女 "));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("王五", "男"));
        RecylerviewAdapter mAdapter = new RecylerviewAdapter(persons, this);
        rvToDoList.setLayoutManager(new LinearLayoutManager(this));
        rvToDoList.setAdapter(mAdapter);
    }

    private Toolbar.OnMenuItemClickListener onMenuItemClick = new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            String msg = "";
            switch (menuItem.getItemId()) {
                case R.id.action_edit:
                    msg += "Click edit";
                    break;
                case R.id.action_share:
                    msg += "Click share";
                    break;
                case R.id.action_settings:
                    msg += "Click setting";
                    break;
            }
            if (!msg.equals("")) {
                Toast.makeText(CoordinatorLayout_chongdie.this, msg, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
    };

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
}
