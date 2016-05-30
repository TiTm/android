package com.example.lenovo.textviewdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2016/3/1.
 */
public class GridView extends Activity {
    private android.widget.GridView gridView;
    private List<Map<String,Object>> mlist;
    private SimpleAdapter sAdapter;
    private int[] img={R.mipmap.a,R.mipmap.b,R.mipmap.c,R.mipmap.d,R.mipmap.e,R.mipmap.f,R.mipmap.g,R.mipmap.a};
    private  String[] text={ "通讯录", "日历", "照相机", "时钟", "游戏", "短信", "铃声","设置"};
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        gridView= (android.widget.GridView) findViewById(R.id.gridView);
        mlist=new ArrayList<Map<String,Object>>();
        getData();
        String [] from={"image","text"};
        int [] to={R.id.gridviewimg,R.id.gridViewtext};
        sAdapter = new SimpleAdapter(getApplicationContext(), mlist, R.layout.gridview_item, from, to);
        gridView.setAdapter(sAdapter);

    }




    public List<Map<String,Object>> getData() {
        for (int i=0;i<img.length;i++){
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("image", img[i]);
            map.put("text", text[i]);
            mlist.add(map);
        }
        return  mlist;
    }
}
