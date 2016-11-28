package com.wujiafeng.mybaseapp.imageloader.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.imageloader.Constants;

/**
 * Created by Jiafeng on 2016/11/28.
 */

public class ImageLoaderViewPagerAdapter extends PagerAdapter {
    private Context mContext;
    private ImageLoader mImageLoader;
    // 配置图片加载参数
    private DisplayImageOptions mOptions = new DisplayImageOptions.Builder()
            .showImageForEmptyUri(R.drawable.icon)  // 设置图片Uri为空或是错误的时候显示的图片
            .showImageOnFail(R.drawable.icon)       // 设置图片加载或解码过程中发生错误显示的图片
            .resetViewBeforeLoading(true)               // 设置图片在下载前是否重置，复位
            .cacheOnDisc(true)                          // 设置下载的图片是否缓存在SD卡中
            .imageScaleType(ImageScaleType.EXACTLY)     // 设置图片以如何的编码方式显示
            .bitmapConfig(Bitmap.Config.RGB_565)        // 设置图片的解码类型
            .displayer(new FadeInBitmapDisplayer(300))  // 设置图片渐变显示
            .build();

    public ImageLoaderViewPagerAdapter(Context context) {
        mContext = context;
        mImageLoader = ImageLoader.getInstance();
    }

    @Override
    public int getCount() {
        return Constants.IMAGES.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = View.inflate(mContext, R.layout.item_imageloader_viewpager, null);
        ImageView iv = (ImageView) view.findViewById(R.id.iv_imageloader_viewpager);
        mImageLoader.displayImage(Constants.IMAGES[position], iv, mOptions);
        ((ViewPager)container).addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}
