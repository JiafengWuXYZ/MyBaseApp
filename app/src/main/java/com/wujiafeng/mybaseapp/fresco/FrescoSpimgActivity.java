package com.wujiafeng.mybaseapp.fresco;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.facebook.drawee.drawable.ProgressBarDrawable;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.wujiafeng.mybaseapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FrescoSpimgActivity extends AppCompatActivity {
    @BindView(R.id.tv_title)
    TextView mTextView;

    @BindView(R.id.sdv_fresco_spimg)
    SimpleDraweeView mSdvFrescoSpimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco_spimg);
        ButterKnife.bind(this);

        initData();
        
    }

    private void initData() {
        mTextView.setText("带进度条的网络图片");
        //设置样式
        GenericDraweeHierarchyBuilder builder = new GenericDraweeHierarchyBuilder(getResources());
        GenericDraweeHierarchy hierarchy = builder.setProgressBarImage(new ProgressBarDrawable()).build();
        mSdvFrescoSpimg.setHierarchy(hierarchy);

        //加载图片地址
        Uri uri = Uri.parse("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/logo_white_fe6da1ec.png");

        //加载图片
        mSdvFrescoSpimg.setImageURI(uri);

    }
}
