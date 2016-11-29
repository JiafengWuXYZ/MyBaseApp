package com.wujiafeng.mybaseapp.glide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.glide.adapter.GlideRecyclerviewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GlideRecyclerviewActivity extends AppCompatActivity {

    @BindView(R.id.rv_glide)
    RecyclerView mRvGlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_recyclerview);
        ButterKnife.bind(this);

        initData();
    }

    private void initData() {
        //初始化RecyclerView
        GlideRecyclerviewAdapter glideRecyclerviewAdapter = new GlideRecyclerviewAdapter(this);
        mRvGlide.setAdapter(glideRecyclerviewAdapter);
        mRvGlide.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
