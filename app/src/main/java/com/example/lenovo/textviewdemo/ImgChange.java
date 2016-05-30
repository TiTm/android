package com.example.lenovo.textviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.nineoldandroids.view.ViewHelper;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by lenovo on 2016/3/2.
 */
public class ImgChange extends Activity {

    @Bind(R.id.imageView)
    ImageView imageView;
    @Bind(R.id.right)
    Button right;
    @Bind(R.id.button6)
    Button button6;
    @Bind(R.id.left)
    Button left;
    @Bind(R.id.top)
    Button top;
    @Bind(R.id.header_logo)
    FrameLayout header_logo;

    private float moveDistanceY = 25;// logo初始移动距离为10
    private float moveDistanceX = 25;// logo初始移动距离为10

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imgchange);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.right, R.id.button6, R.id.left, R.id.top})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.right:
                moveDistanceX += 20;
                ViewHelper.setTranslationX(imageView, moveDistanceX);
                break;
            case R.id.button6:
                moveDistanceY += 20;
                ViewHelper.setTranslationY(imageView, moveDistanceY);
                             break;
            case R.id.left:
                moveDistanceX -= 20;
                ViewHelper.setTranslationY(imageView, moveDistanceY);
                         break;
            case R.id.top:
                moveDistanceY -= 20;
                ViewHelper.setTranslationY(imageView, moveDistanceY);
                        break;
        }
    }
}
