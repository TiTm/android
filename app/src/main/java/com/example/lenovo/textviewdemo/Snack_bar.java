package com.example.lenovo.textviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by lenovo on 2016/3/3.
 */
public class Snack_bar extends Activity {
    private  Snackbar mSnackBar;
    @Bind(R.id.button_bar)
    Button buttonBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.button_bar)
    public void onClick() {
        mSnackBar.make(buttonBar,"hahhah",Snackbar.LENGTH_SHORT).show();
    }

}
