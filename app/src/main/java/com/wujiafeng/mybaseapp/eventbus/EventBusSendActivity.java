package com.wujiafeng.mybaseapp.eventbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.eventbus.event.MessageEvent;
import com.wujiafeng.mybaseapp.eventbus.event.StickyEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class EventBusSendActivity extends AppCompatActivity {

    private TextView tv_title;
    private Button bt_eventbus_send_main;
    private Button bt_eventbus_send_sticky;
    private TextView tv_eventbus_send_result;
private boolean isFirstFlag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus_send);
        initView();

        initData();

        initListener();
    }

    private void initData() {
        tv_title.setText("EventBus发送数据页面");
    }

    private void initView() {
        tv_title = (TextView)findViewById(R.id.tv_title);
        bt_eventbus_send_main = (Button)findViewById(R.id.bt_eventbus_send_main);
        bt_eventbus_send_sticky = (Button)findViewById(R.id.bt_eventbus_send_sticky);
        tv_eventbus_send_result = (TextView)findViewById(R.id.tv_eventbus_send_result);
    }

    private void initListener() {
        // 主线程发送数据按钮点击事件处理
        bt_eventbus_send_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 4 发送消息
                EventBus.getDefault().post(new MessageEvent("主线程发送过来的消息"));
                // 结束当前页面
                finish();
            }
        });

        // 接收粘性事件数据按钮的点击事件处理
        bt_eventbus_send_sticky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //注册
                if (isFirstFlag){
                    isFirstFlag = false;
                    EventBus.getDefault().register(EventBusSendActivity.this);
                }
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN,sticky = true)
    public void StickyEventBus(StickyEvent event){
        tv_eventbus_send_result.setText(event.msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().removeAllStickyEvents();
        EventBus.getDefault().unregister(EventBusSendActivity.this);
    }
}
