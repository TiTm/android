package com.example.lenovo.textviewdemo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by lenovo on 2016/3/23.
 */
public class B_imageview extends AppCompatActivity {
    @Bind(R.id.imageView3)
    ImageView img;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.imageView3)
    public void onClick() {
        AlertDialog.Builder builder = new AlertDialog.Builder(B_imageview.this);
//        builder.setIcon(R.drawable.ic_launcher);
        builder.setTitle("请选择性别");
        final String[] sex = {"男", "女", "未知性别"};
        //    设置一个单项选择下拉框
        /**
         * 第一个参数指定我们要显示的一组下拉单选框的数据集合
         * 第二个参数代表索引，指定默认哪一个单选框被勾选上，1表示默认'女' 会被勾选上
         * 第三个参数给每一个单选项绑定一个监听器
         */
        builder.setMultiChoiceItems(sex,null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    if (isChecked){
                        Toast.makeText(getApplicationContext(), "爱好为：" + sex.toString(), Toast.LENGTH_SHORT).show();

                    }
            }
        });


        builder.setPositiveButton("确定", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }
}

