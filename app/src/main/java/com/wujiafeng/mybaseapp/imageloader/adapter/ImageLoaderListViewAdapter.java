package com.wujiafeng.mybaseapp.imageloader.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.imageloader.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Jiafeng on 2016/11/28.
 */

public class ImageLoaderListViewAdapter extends BaseAdapter {
    private Context mContext;
    private final ImageLoader mImageLoader;
    private DisplayImageOptions mOptions
            = new DisplayImageOptions.Builder()
            .showStubImage(R.drawable.icon)          // 设置图片下载期间显示的图片
            .showImageForEmptyUri(R.drawable.icon)  // 设置图片Uri为空或是错误的时候显示的图片
            .showImageOnFail(R.drawable.icon)       // 设置图片加载或解码过程中发生错误显示的图片
            .cacheInMemory(true)                        // 设置下载的图片是否缓存在内存中
            .cacheOnDisk(true)                          // 设置下载的图片是否缓存在SD卡中
            .bitmapConfig(Bitmap.Config.RGB_565)        // 设置图片的解码类型
            .build();                                   // 创建配置过得DisplayImageOption对象

    public ImageLoaderListViewAdapter(Context context) {
        mContext = context;
        //初始化ImageView
        mImageLoader = ImageLoader.getInstance();
    }

    @Override
    public int getCount() {
        return Constants.IMAGES.length;
    }

    @Override
    public Object getItem(int position) {
        return Constants.IMAGES[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //获取或者创建viewholder
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_imageloader_listview, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //获取当前的Item数据
        holder.name.setText("item:" + (position + 1));
        //显示数据
        mImageLoader.displayImage(Constants.IMAGES[position], holder.iv, mOptions);
        return convertView;
    }

    class ViewHolder {
        @BindView(R.id.iv_imageloader_listview)
        ImageView iv;

        @BindView(R.id.tv_imageloader_name)
        TextView name;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
