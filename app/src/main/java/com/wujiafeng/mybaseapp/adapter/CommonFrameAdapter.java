package com.wujiafeng.mybaseapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Jiafeng on 2016/11/24.
 */

public class CommonFrameAdapter extends BaseAdapter {
    private Context mContext;

    private String[] mDatas;

    public CommonFrameAdapter(Context context, String[] datas) {
        mContext = context;
        mDatas = datas;
    }

    @Override
    public int getCount() {
        return mDatas.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(mContext);
        textView.setPadding(10,10,10,10);
        textView.setText(mDatas[position]);
        textView.setTextColor(Color.BLUE);
        textView.setTextSize(20);
        return textView;
    }
}
