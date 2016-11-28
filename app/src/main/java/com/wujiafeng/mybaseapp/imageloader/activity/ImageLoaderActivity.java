package com.wujiafeng.mybaseapp.imageloader.activity;

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

public class ImageLoaderActivity extends AppCompatActivity {


    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @BindView(R.id.bt_imageloader_listview)
    Button mBtImageloaderListview;
    @BindView(R.id.bt_imageloader_gridview)
    Button mBtImageloaderGridview;
    @BindView(R.id.bt_imageloader_viewpager)
    Button mBtImageloaderViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_loader);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_imageloader_listview, R.id.bt_imageloader_gridview, R.id.bt_imageloader_viewpager})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_imageloader_listview:
                Intent intent1 = new Intent(ImageLoaderActivity.this, ImageLoaderListViewActivity.class);
                startActivity(intent1);
                break;

            case R.id.bt_imageloader_gridview:
                Intent intent2 = new Intent(ImageLoaderActivity.this, ImageLoaderGridViewActivity.class);
                startActivity(intent2);
                break;

            case R.id.bt_imageloader_viewpager:
                Intent intent3 = new Intent(ImageLoaderActivity.this, ImageLoaderViewPagerActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
