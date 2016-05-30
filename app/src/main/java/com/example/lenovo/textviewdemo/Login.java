package com.example.lenovo.textviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 2016/2/29.
 */
public class Login extends Activity {
    @Bind(R.id.img)
    ImageView img;
    @Bind(R.id.user)
    EditText user;
    @Bind(R.id.pass)
    EditText pass;
    @Bind(R.id.login)
    Button btn;
    @Bind(R.id.cb)
    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ButterKnife.bind(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,MainActivity.class);
                startActivity(intent);
            }
        });
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    img.setImageResource(R.mipmap.gril);
                }
                else {
                    img.setImageResource(R.mipmap.boy);
                }
            }
        });
    }
}
