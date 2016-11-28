package com.wujiafeng.mybaseapp.imageloader.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.imageloader.adapter.ImageLoaderViewPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ImageLoaderViewPagerActivity extends AppCompatActivity {

    @BindView(R.id.vp_imageloader_viewpager)
    ViewPager mVpImageloaderViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_loader_view_pager);
        ButterKnife.bind(this);

        initData();
    }

    private void initData() {
        ImageLoaderViewPagerAdapter imageLoaderViewPagerAdapter = new ImageLoaderViewPagerAdapter(this);
        mVpImageloaderViewpager.setAdapter(imageLoaderViewPagerAdapter);
        mVpImageloaderViewpager.setCurrentItem(1);
    }
}
