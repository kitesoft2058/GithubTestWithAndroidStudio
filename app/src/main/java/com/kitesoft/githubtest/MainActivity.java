package com.kitesoft.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv= findViewById(R.id.tv);
        tv.setText("Nice GitHub!");
        
        //원격저장소[GitHub]에서 문서 업데이트
        tv.setTextSize(40);

        //새로운 branch에서 GitHub로 push하기
        tv.setTextColor(0xFFFF0000);
    }
}
