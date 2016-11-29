package com.wujiafeng.mybaseapp.picasso.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.wujiafeng.mybaseapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PicassoActivity extends AppCompatActivity {

    @BindView(R.id.bt_picasso_base)
    Button mBtPicassoBase;
    @BindView(R.id.bt_picasso_listview)
    Button mBtPicassoListview;
    @BindView(R.id.bt_picasso_tranformations)
    Button mBtPicassoTranformations;
    @BindView(R.id.iv_picasso_result1)
    ImageView mIvPicassoResult1;
    @BindView(R.id.iv_picasso_result2)
    ImageView mIvPicassoResult2;
    @BindView(R.id.iv_picasso_result3)
    ImageView mIvPicassoResult3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_picasso_base, R.id.bt_picasso_listview, R.id.bt_picasso_tranformations})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_picasso_base:
                // 基本用法

                // 普通加载图片
                Picasso.with(PicassoActivity.this)
                        .load("http://n.sinaimg.cn/translate/20160819/9BpA-fxvcsrn8627957.jpg")
                        .into(mIvPicassoResult1);

                // 裁剪的方式加载图片
                Picasso.with(PicassoActivity.this)
                        .load("http://n.sinaimg.cn/translate/20160819/9BpA-fxvcsrn8627957.jpg")
                        .resize(100, 100)
                        .into(mIvPicassoResult2);

                // 选择180度
                Picasso.with(PicassoActivity.this)
                        .load("http://n.sinaimg.cn/translate/20160819/9BpA-fxvcsrn8627957.jpg")
                        .rotate(180)
                        .into(mIvPicassoResult3);
                break;

            case R.id.bt_picasso_listview:
                // 跳转到listview页面
                Intent intent1 = new Intent(PicassoActivity.this, PicassoListviewActivity.class);

                startActivity(intent1);
                break;
            case R.id.bt_picasso_tranformations:
                // 跳转到图片转换页面
                Intent intent2 = new Intent(PicassoActivity.this, PicassoTransfromationsActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
