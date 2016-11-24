package com.wujiafeng.mybaseapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

import com.wujiafeng.mybaseapp.base.BaseFragment;
import com.wujiafeng.mybaseapp.fragment.CommonFrameFragment;
import com.wujiafeng.mybaseapp.fragment.CustomFragment;
import com.wujiafeng.mybaseapp.fragment.OtherFragment;
import com.wujiafeng.mybaseapp.fragment.ThirdPartyFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private RadioGroup mRg_main;
    private List<BaseFragment> mBaseFragment;
    private int postion;
    /**
     * 上次切换的Fragment;
     */
    private BaseFragment mContentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initFragment();
        setListener();
    }

    private void setListener() {
        mRg_main.setOnCheckedChangeListener(new MyOnCheckedChangeListener());
        //设置默认选中
        mRg_main.check(R.id.rb_common_frame);
    }

    private class MyOnCheckedChangeListener implements RadioGroup.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.rb_common_frame:
                    postion = 0;
                    break;
                case R.id.rb_thirdparty:
                    postion = 1;
                    break;
                case R.id.rb_custom:
                    postion = 2;
                    break;
                case R.id.rb_other:
                    postion = 3;
                    break;
                default:
                    postion = 0;
                    break;
            }

            BaseFragment toFragment = getFragment();
            switchFragment(mContentFragment,toFragment);
        }
    }

    /**
     * 这里有隐患，后面解决
     * @param from
     * @param to
     */
    private void switchFragment(BaseFragment from, BaseFragment to) {
        if (from != to) {
            mContentFragment = to;
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (!to.isAdded()){
                //to 没有被添加
                //from隐藏
                if (from!=null){
                    transaction.hide(from);
                }
                //添加 to
                if (to!=null){
                    transaction.add(R.id.fl_content,to).commit();
                }
            }else{
                //to 已经添加
                //from隐藏
                //显示 to
                if (from!=null){
                    transaction.hide(from);
                }
                if (to!=null){
                    transaction.show(to).commit();
                }
            }
        }
    }

//    private void switchFragment(BaseFragment fragment) {
//        //得到FragmentManager
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        //开启事务
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        //替换
//        transaction.replace(R.id.fl_content,fragment);
//        //提交事务
//        transaction.commit();
//    }

    private BaseFragment getFragment() {
        BaseFragment fragment = mBaseFragment.get(postion);
        return fragment;
    }

    private void initFragment() {
        mBaseFragment = new ArrayList<>();
        mBaseFragment.add(new CommonFrameFragment());
        mBaseFragment.add(new ThirdPartyFragment());
        mBaseFragment.add(new CustomFragment());
        mBaseFragment.add(new OtherFragment());
    }

    private void initView() {
        setContentView(R.layout.activity_main);
        mRg_main = (RadioGroup) findViewById(R.id.rg_main);

    }
}
