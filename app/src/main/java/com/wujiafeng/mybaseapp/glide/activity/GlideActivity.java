package com.wujiafeng.mybaseapp.glide.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wujiafeng.mybaseapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GlideActivity extends AppCompatActivity {

    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @BindView(R.id.bt_glide_base)
    Button mBtGlideBase;
    @BindView(R.id.bt_glide_recyclerview)
    Button mBtGlideRecyclerview;
    @BindView(R.id.bt_glide_tranfromations)
    Button mBtGlideTranfromations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {

    }

    @OnClick({R.id.bt_glide_base, R.id.bt_glide_recyclerview, R.id.bt_glide_tranfromations})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_glide_base:
                Intent intent1 = new Intent(GlideActivity.this, GlideBaseActivity.class);
                startActivity(intent1);
                break;

            case R.id.bt_glide_recyclerview:
                Intent intent2 = new Intent(GlideActivity.this, GlideRecyclerviewActivity.class);
                startActivity(intent2);
                break;

            case R.id.bt_glide_tranfromations:
                Intent intent3 = new Intent(GlideActivity.this, GlideTransformationsActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
