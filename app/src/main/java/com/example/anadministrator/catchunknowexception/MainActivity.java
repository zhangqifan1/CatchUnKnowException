package com.example.anadministrator.catchunknowexception;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 *
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 钒哥千秋万载,万载千秋
     */
    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mTv = (TextView) findViewById(R.id.tv);
        mTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv:
                Object o = null;
                System.out.println(o.toString());
                break;
        }
    }
}
