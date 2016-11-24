package com.wujiafeng.mybaseapp.fragment;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.wujiafeng.mybaseapp.base.BaseFragment;

/**
 * Created by Jiafeng on 2016/11/24.
 */

public class OtherFragment extends BaseFragment {
    private static final String TAG = OtherFragment.class.getSimpleName();
    private TextView mTextView;

    @Override
    protected View initView() {
        Log.e(TAG,"initView！");
        mTextView = new TextView(mContext);
        mTextView.setText("其他");
        mTextView.setGravity(Gravity.CENTER);
        mTextView.setTextSize(20);
        mTextView.setTextColor(Color.RED);
        return mTextView;
    }

    @Override
    protected void initData() {
        super.initData();
        Log.e(TAG,"initView！");
    }
}
