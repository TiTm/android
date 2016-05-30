package com.example.lenovo.textviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.textviewdemo.Adapter.SpinnerAdapter;
import com.example.lenovo.textviewdemo.entiy.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 private CheckBox cbox;
    private RadioGroup rg;
    EditText text;
    Switch mSwitch;
    ProgressBar pro;
    SeekBar sb;
    TextView gtext;
    Button btn;
    RatingBar rb;
    Spinner spinner;
    Spinner spinner2;
    Button btn3_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbox= (CheckBox) findViewById(R.id.box);
        rg= (RadioGroup) findViewById(R.id.radiogroup);
        text= (EditText) findViewById(R.id.editText);
        mSwitch= (Switch) findViewById(R.id.switch1);
        pro= (ProgressBar) findViewById(R.id.progressBar2);
        sb= (SeekBar) findViewById(R.id.seekBar);
        gtext= (TextView) findViewById(R.id.textView5);
        btn= (Button) findViewById(R.id.button2);
        rb= (RatingBar) findViewById(R.id.ratingBar);
        spinner= (Spinner) findViewById(R.id.spinner);
        spinner2= (Spinner) findViewById(R.id.spinner2);
        btn3_1= (Button) findViewById(R.id.day3_1);

        //spinner数据源
        List<Person> persons=new ArrayList<Person>();
        persons.add(new Person("张三", "男"));
        persons.add(new Person("李四", "女"));
        persons.add(new Person("王五", "男" ));
        persons.add(new Person("赵六", "女 "));
        //建立adapter绑定
        SpinnerAdapter spinnerAdapter=new SpinnerAdapter(persons,this);
        //绑定适配器
        spinner2.setAdapter(spinnerAdapter);
        //______________________________________________________________________
        //多选框
        cbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                text.setText("1");
                Toast.makeText(getApplicationContext(),isChecked?"选中" :"取消",Toast.LENGTH_SHORT).show();
//                Toast.makeText(getApplicationContext(),cbox.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int btnid=group.getCheckedRadioButtonId();
                RadioButton btn= (RadioButton) findViewById(btnid);
                text.setText(btn.getText());
            }
        });
        //开关监听事件
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    text.setText("开启");
                } else {
                    text.setText("关闭");
                }
            }
        });
        //拖动条
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                MainActivity.this.gtext.append("正在拖动,当前值:" + seekBar.getProgress() + "\n");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                MainActivity.this.gtext.append("开始拖动,当前值:" + seekBar.getProgress() + "\n");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                MainActivity.this.gtext.append("停止拖动,当前值:" + seekBar.getProgress() + "\n");
            }
        });
        //btn 点击
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gtext.setText(" ");
            }
        });
        //评分
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Toast.makeText(getApplicationContext(),"stars"+ratingBar.getRating(),Toast.LENGTH_SHORT).show();
            }
        });
        //
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] languages = getResources().getStringArray(R.array.languages);
                Toast.makeText(MainActivity.this, "你点击的是:" + languages[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //_____________________________________________
        }
}
