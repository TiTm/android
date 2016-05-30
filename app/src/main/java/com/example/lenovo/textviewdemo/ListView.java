package com.example.lenovo.textviewdemo;

import android.app.Activity;
import android.os.Bundle;

import com.example.lenovo.textviewdemo.Adapter.ListViewAdapter;
import com.example.lenovo.textviewdemo.entiy.Person;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 2016/3/1.
 */
public class ListView extends Activity {
    @Bind(R.id.listView)
    android.widget.ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        ButterKnife.bind(this);
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("张三", "男"));
        persons.add(new Person("李四", "女"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("赵六", "女 "));
        //建立adapter绑定
        ListViewAdapter listViewAdapter = new ListViewAdapter(persons,this);
        //绑定适配器
        listView.setAdapter(listViewAdapter);
    }
}
