package com.wujiafeng.mybaseapp.picasso.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.picasso.adapter.PicassoListviewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PicassoListviewActivity extends AppCompatActivity {

    @BindView(R.id.lv_picasso)
    ListView mLvPicasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_listview);
        ButterKnife.bind(this);

        // 初始化listview
        PicassoListviewAdapter picassoListviewAdapter = new PicassoListviewAdapter(this);

        mLvPicasso.setAdapter(picassoListviewAdapter);
    }
}
