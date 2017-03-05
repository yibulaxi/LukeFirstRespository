package com.tbug.android.collection.widget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.tbug.android.collection.R;
import com.tbug.android.collection.testview.DialogUtilActivity;

public class WidgetActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);
        initView();
    }

    /**
     * 初始化控件
     */
    private void initView() {
        findViewById(R.id.TextView).setOnClickListener(this);
        findViewById(R.id.EditText).setOnClickListener(this);
        findViewById(R.id.Button).setOnClickListener(this);
        findViewById(R.id.ImageButton).setOnClickListener(this);
        findViewById(R.id.CheckBox).setOnClickListener(this);
        findViewById(R.id.RadioGroup).setOnClickListener(this);
        findViewById(R.id.Toast).setOnClickListener(this);
        findViewById(R.id.Spinner).setOnClickListener(this);
        findViewById(R.id.ListView).setOnClickListener(this);
        findViewById(R.id.TabHost).setOnClickListener(this);
        findViewById(R.id.Menu).setOnClickListener(this);
        findViewById(R.id.AutoCompleteTextView).setOnClickListener(this);
        findViewById(R.id.DatePicker).setOnClickListener(this);
        findViewById(R.id.Timepicker).setOnClickListener(this);
        findViewById(R.id.Dialog).setOnClickListener(this);
        findViewById(R.id.ImageView).setOnClickListener(this);
        findViewById(R.id.Gallery).setOnClickListener(this);
        findViewById(R.id.ImageSwitcher).setOnClickListener(this);
        findViewById(R.id.GridView).setOnClickListener(this);
        findViewById(R.id.ProgressBar).setOnClickListener(this);
        findViewById(R.id.SeekBar).setOnClickListener(this);
        findViewById(R.id.RatingBar).setOnClickListener(this);
        findViewById(R.id.ProgressDialog).setOnClickListener(this);
        findViewById(R.id.Notification).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Class<?> targetClass = null;
        switch (v.getId()){
            case R.id.TextView:
                targetClass = TextViewActivity.class;
                break;
            case R.id.EditText:
                targetClass = EditTextActivity.class;
                break;
            case R.id.Button:
                break;
            case R.id.ImageButton:
                break;
            case R.id.CheckBox:
                break;
            case R.id.RadioGroup:
                break;
            case R.id.Toast:
                break;
            case R.id.Spinner:
                break;
            case R.id.ListView:
                break;
            case R.id.TabHost:
                break;
            case R.id.Menu:
                break;
            case R.id.AutoCompleteTextView:
                break;
            case R.id.DatePicker:
                break;
            case R.id.Timepicker:
                break;
            case R.id.Dialog:
                targetClass = DialogUtilActivity.class;
                break;
            case R.id.ImageView:
                break;
            case R.id.Gallery:
                break;
            case R.id.ImageSwitcher:
                break;
            case R.id.GridView:
                break;
            case R.id.ProgressBar:
                break;
            case R.id.SeekBar:
                break;
            case R.id.RatingBar:
                break;
            case R.id.ProgressDialog:
                break;
            case R.id.Notification:
                break;

            default:
                Toast.makeText(WidgetActivity.this,"默认的点击",Toast.LENGTH_SHORT).show();
                break;
        }
        if (targetClass != null){
            startActivity(new Intent(WidgetActivity.this,targetClass));
        }
    }
}
