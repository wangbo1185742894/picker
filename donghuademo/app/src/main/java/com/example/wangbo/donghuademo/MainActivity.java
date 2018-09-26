package com.example.wangbo.donghuademo;

import android.app.Notification;
import android.app.VoiceInteractor;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_send) Button btn_send;
    @BindView(R.id.tv_result) TextView tv_result;

    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            if (msg.what == 0)
                tv_result.setText("asdfasd");

            return false;
        }
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_send})
    public void OnClick(View view){


        new Thread(){
            public void run(){

                handler.sendEmptyMessage(0);

//                String path = "http://t.11max.com/tbz/url.html";
//
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        tv_result.setText("asd");
//                    }
//                });


            }
        }.start();

    }
}
