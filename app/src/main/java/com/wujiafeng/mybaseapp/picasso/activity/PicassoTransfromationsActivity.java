package com.wujiafeng.mybaseapp.picasso.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.picasso.adapter.PicassoTransformationsAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PicassoTransfromationsActivity extends AppCompatActivity {

    @BindView(R.id.lv_picasso_transfromations)
    ListView mLvPicassoTransfromations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_transfromations);
        ButterKnife.bind(this);

        List<String> data = new ArrayList<>();

        for (int i = 1; i<= 36; i++){
            data.add(i+"");
        }

        // 初始化listview
        PicassoTransformationsAdapter picassoTransformationsAdapter = new PicassoTransformationsAdapter(PicassoTransfromationsActivity.this,data);

        mLvPicassoTransfromations.setAdapter(picassoTransformationsAdapter);
    }
}
