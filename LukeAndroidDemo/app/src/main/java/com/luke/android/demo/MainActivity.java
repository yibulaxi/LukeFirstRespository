package com.luke.android.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.luke.android.demo.animation.AnimationActivity;
import com.luke.android.demo.datechangereceiver.TimeChangedActivity;
import com.luke.android.demo.handler.HandlerTestActivity;
import com.luke.android.demo.sessionlifecycle.SessionActivity1;
import com.luke.android.demo.webservice.WebServiceActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        int id = v.getId();
        Intent intent = new Intent();
        switch (id){
            case R.id.anim_main:
                intent.setClass(this, AnimationActivity.class);
                break;
            case R.id.handler_main:
                intent.setClass(this, HandlerTestActivity.class);
                break;
            case R.id.web_main:
                intent.setClass(this, WebServiceActivity.class);
                break;
            case R.id.activityLifeCycle_main:
                intent.setClass(this, SessionActivity1.class);
                break;
            case R.id.receiver_main:
                intent.setClass(this, TimeChangedActivity.class);
                break;
        }
        startActivity(intent);
    }
}
