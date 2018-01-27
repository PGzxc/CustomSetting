package com.pgzxc.customsetting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.pgzxc.customsetting.widget.TopTitleBar;

public class MainActivity extends AppCompatActivity {
    private TopTitleBar topTitleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topTitleBar = findViewById(R.id.titleBar);
        initData();
    }

    private void initData() {
        topTitleBar.setLeftText("左侧");
        topTitleBar.setTitleTextView("标题");
        topTitleBar.setRightText("右侧");

    }
}
