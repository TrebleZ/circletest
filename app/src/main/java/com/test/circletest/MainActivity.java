package com.test.circletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CircleChart circleChart;//圆环饼图

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleChart = (CircleChart) findViewById(R.id.cir_point);
        circleChart.setmFirstPoint(60);//设置第一比例
    }
}
