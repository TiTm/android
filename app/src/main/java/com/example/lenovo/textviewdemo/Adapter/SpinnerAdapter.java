package com.example.lenovo.textviewdemo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.textviewdemo.R;
import com.example.lenovo.textviewdemo.entiy.Person;

import java.util.List;

/**
 * Created by lenovo on 2016/3/1.
 * ————————————————下拉框适配器——————
 */
public class SpinnerAdapter extends BaseAdapter {
    private List<Person> mList;
    private Context mContext;

    public SpinnerAdapter(List<Person> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }



    @Override
    public int getCount() {

        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(mContext);
        convertView=inflater.inflate(R.layout.item, null);
        ImageView simg= (ImageView) convertView.findViewById(R.id.simg);
        TextView stext1= (TextView) convertView.findViewById(R.id.stext1);
        TextView stext2= (TextView) convertView.findViewById(R.id.stext2);
        simg.setImageResource(R.mipmap.hai);
        stext1.setText(mList.get(position).getPersonName());
        stext2.setText(mList.get(position).getPersonAddress());
        return convertView;
    }
}
