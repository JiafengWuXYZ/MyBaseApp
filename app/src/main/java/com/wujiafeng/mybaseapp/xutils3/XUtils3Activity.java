package com.wujiafeng.mybaseapp.xutils3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.xutils3.annotation.FragmentXUtils3Activity;
import com.wujiafeng.mybaseapp.xutils3.net.XUtils3NetActivity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_xutils3)
public class XUtils3Activity extends Activity {


    @ViewInject(R.id.tv_title)
    private TextView tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_xutils3);
        x.view().inject(XUtils3Activity.this);
        tv_title.setText("xUtils3的使用");
    }

    @Event(value = {R.id.btn_annotation,R.id.btn_net,R.id.btn_image,R.id.btn_image_list})
    private void getEvent(View view){
        switch (view.getId()){
            case R.id.btn_annotation:
                Toast.makeText(XUtils3Activity.this,"注解模块被点击了！",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(XUtils3Activity.this, FragmentXUtils3Activity.class);
                startActivity(intent1);
                break;
            case R.id.btn_net:
                Toast.makeText(XUtils3Activity.this,"联网模块被点击了！",Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(XUtils3Activity.this, XUtils3NetActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_image:
                Toast.makeText(XUtils3Activity.this,"加载单张图片被点击了！",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_image_list:
                Toast.makeText(XUtils3Activity.this,"加载列表图片被点击了！",Toast.LENGTH_SHORT).show();
                break;

        }
    }
//
//    @Event(value = R.id.btn_net)
//    private void getEvent2(View view){
//        Toast.makeText(XUtils3Activity.this,"联网模块被点击了！",Toast.LENGTH_SHORT).show();
//    }
}
