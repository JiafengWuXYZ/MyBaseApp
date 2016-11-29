package com.wujiafeng.mybaseapp.fresco;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.wujiafeng.mybaseapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FrescoActivity extends AppCompatActivity {
    @BindView(R.id.tv_title)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco);
        ButterKnife.bind(this);
        mTextView.setText("Fresco");
    }

    @OnClick({R.id.bt_fresco_spimg, R.id.bt_fresco_crop, R.id.bt_fresco_circleAndCorner, R.id.bt_fresco_jpeg, R.id.bt_fresco_gif, R.id.bt_fresco_multi, R.id.bt_fresco_listener, R.id.bt_fresco_resize, R.id.bt_fresco_modifyImg, R.id.bt_fresco_autoSizeImg})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_fresco_spimg:
                Intent intent1 = new Intent(FrescoActivity.this, FrescoSpimgActivity.class);
                startActivity(intent1);
                break;
            case R.id.bt_fresco_crop:
                Intent intent2 = new Intent(FrescoActivity.this, FrescoCropActivity.class);
                startActivity(intent2);
                break;
            case R.id.bt_fresco_circleAndCorner:
                Intent intent3 = new Intent(FrescoActivity.this, FrescoCircleAndCornerActivity.class);
                startActivity(intent3);
                break;
            case R.id.bt_fresco_jpeg:
                Intent intent4 = new Intent(FrescoActivity.this, FrescoJpegActivity.class);
                startActivity(intent4);
                break;
            case R.id.bt_fresco_gif:
                Intent intent5 = new Intent(FrescoActivity.this, FrescoGifAcitivity.class);
                startActivity(intent5);
                break;
            case R.id.bt_fresco_multi:
                Intent intent6 = new Intent(FrescoActivity.this, FrescoMultiActivity.class);
                startActivity(intent6);
                break;
            case R.id.bt_fresco_listener:
                Intent intent7 = new Intent(FrescoActivity.this, FrescoListenerActivity.class);
                startActivity(intent7);
                break;
            case R.id.bt_fresco_resize:
                Intent intent8 = new Intent(FrescoActivity.this, FrescoResizeActivity.class);
                startActivity(intent8);
                break;
            case R.id.bt_fresco_modifyImg:
                Intent intent9 = new Intent(FrescoActivity.this, FrescoModifyActivity.class);
                startActivity(intent9);
                break;
            case R.id.bt_fresco_autoSizeImg:
                Intent intent10 = new Intent(FrescoActivity.this, FrescoAutoSizeActivity.class);
                startActivity(intent10);
                break;
        }
    }
}
