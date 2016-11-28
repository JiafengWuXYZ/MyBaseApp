package com.wujiafeng.mybaseapp.imageloader.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.imageloader.adapter.ImageLoaderListViewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ImageLoaderListViewActivity extends AppCompatActivity {

    @BindView(R.id.lv_imageloader)
    ListView mLvImageloader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_loader_list_view);
        ButterKnife.bind(this);

        initData();
    }

    private void initData() {
        ImageLoaderListViewAdapter imageloadListViewAdapter = new ImageLoaderListViewAdapter(ImageLoaderListViewActivity.this);
        mLvImageloader.setAdapter(imageloadListViewAdapter);
    }


}
