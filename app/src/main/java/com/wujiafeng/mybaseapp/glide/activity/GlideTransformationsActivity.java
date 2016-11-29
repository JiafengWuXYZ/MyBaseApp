package com.wujiafeng.mybaseapp.glide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.glide.adapter.GlideRecyclerviewAdapter;
import com.wujiafeng.mybaseapp.glide.adapter.GlideTransformationsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GlideTransformationsActivity extends AppCompatActivity {

    @BindView(R.id.rv_glide_transformations)
    RecyclerView mRvGlideTransformations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_transformations);
        ButterKnife.bind(this);
        
        initData();
    }

    private void initData() {
        GlideTransformationsAdapter glideRecyclerviewAdapter = new GlideTransformationsAdapter(this);
        mRvGlideTransformations.setAdapter(glideRecyclerviewAdapter);
        mRvGlideTransformations.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
