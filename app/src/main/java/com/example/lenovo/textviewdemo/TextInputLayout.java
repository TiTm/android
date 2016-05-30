package com.example.lenovo.textviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 2016/3/3.
 */
public class TextInputLayout extends Activity {
    @Bind(R.id.textView10)
    TextView wecl;
    @Bind(R.id.username)
    EditText username;
    @Bind(R.id.password)
    EditText password;
    @Bind(R.id.passwordWrapper)
    android.support.design.widget.TextInputLayout passwordWrapper;
    @Bind(R.id.usernameWrapper)
    android.support.design.widget.TextInputLayout usernameWrapper;
    @Bind(R.id.button3)
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textinputlayout);
        ButterKnife.bind(this);
        passwordWrapper.setHint("请输入密码");
        usernameWrapper.setHint("请输入用户名");
        login.setHint("登陆");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TextInputLayout.this,DarwLayoutDemo.class);
                startActivity(intent);
            }
        });
    }
}
