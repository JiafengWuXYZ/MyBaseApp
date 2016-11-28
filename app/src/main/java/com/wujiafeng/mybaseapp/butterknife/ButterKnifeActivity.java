package com.wujiafeng.mybaseapp.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.wujiafeng.mybaseapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterKnifeActivity extends AppCompatActivity {

    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @BindView(R.id.tv_butterknife)
    TextView mTvButterknife;
    @BindView(R.id.cb_butterknife)
    CheckBox mCbButterknife;
    @BindView(R.id.bt_butterknife)
    Button mBtButterknife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife);
        ButterKnife.bind(this);

        initData();
    }

    private void initData() {
        mTvTitle.setText("ButterKnife");
    }

    @OnClick({R.id.cb_butterknife, R.id.bt_butterknife})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cb_butterknife:
                Toast.makeText(ButterKnifeActivity.this, "cb_butterknife", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_butterknife:
                Toast.makeText(ButterKnifeActivity.this, "bt_butterknife", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
