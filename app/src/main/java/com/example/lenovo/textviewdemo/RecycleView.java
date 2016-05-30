package com.example.lenovo.textviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.example.lenovo.textviewdemo.Adapter.RecylerviewAdapter;
import com.example.lenovo.textviewdemo.entiy.Person;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 2016/3/1.
 */
public class RecycleView extends Activity {
    @Bind(R.id.recylerview)
    RecyclerView recylerview;
    RecyclerViewHeader header;
    private RecylerviewAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview);
        ButterKnife.bind(this);
    header= (RecyclerViewHeader) findViewById(R.id.header);
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("张三", "男"));
        persons.add(new Person("李四", "女"));
        persons.add(new Person("王五", "男"));
        persons.add(new Person("赵六", "女 "));
        RecylerviewAdapter mAdapter=new RecylerviewAdapter(persons, this);
        recylerview.setLayoutManager(new LinearLayoutManager(this));
//        header.attachTo(recylerview,true);
        recylerview.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new RecylerviewAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void OnitemClick(int position) {
                Toast.makeText(getApplicationContext(),"点击的是"+position,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
