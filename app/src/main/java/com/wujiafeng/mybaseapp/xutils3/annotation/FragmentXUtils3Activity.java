package com.wujiafeng.mybaseapp.xutils3.annotation;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;

import com.wujiafeng.mybaseapp.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_xutils3_fragment)
public class FragmentXUtils3Activity extends FragmentActivity {

    @ViewInject(R.id.tv_title)
    private TextView tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_xutils3_fragment);
        x.view().inject(FragmentXUtils3Activity.this);

        tv_title.setText("Fragment使用注解");

        //得到FragmentManager
        FragmentManager manager = getSupportFragmentManager();
        //开启事务
        FragmentTransaction transaction = manager.beginTransaction();
        //替换
        transaction.replace(R.id.fl_content,new DemoFragment());
        //提交事务
        transaction.commit();
    }
}
