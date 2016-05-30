package com.example.lenovo.textviewdemo.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.textviewdemo.R;

/**
 * Created by lenovo on 2016/3/2.
 */
public class left_fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.draw_left,container,false);
        return view;
    }
}
