package com.wujiafeng.mybaseapp.imageloader.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.imageloader.adapter.ImageLoaderGridViewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ImageLoaderGridViewActivity extends AppCompatActivity {

    @BindView(R.id.gv_imageloader_gridview)
    GridView mGvImageloaderGridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_loader_grid_view);
        ButterKnife.bind(this);
        
        initData();
    }

    private void initData() {
        //初始化GridView
        ImageLoaderGridViewAdapter imageLoaderGridViewAdapter = new ImageLoaderGridViewAdapter(this);
        mGvImageloaderGridview.setAdapter(imageLoaderGridViewAdapter);
    }
}
