package com.wujiafeng.mybaseapp.fragment;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.adapter.CommonFrameAdapter;
import com.wujiafeng.mybaseapp.base.BaseFragment;
import com.wujiafeng.mybaseapp.butterknife.ButterKnifeActivity;
import com.wujiafeng.mybaseapp.eventbus.EventBusActivity;
import com.wujiafeng.mybaseapp.fresco.FrescoActivity;
import com.wujiafeng.mybaseapp.glide.activity.GlideActivity;
import com.wujiafeng.mybaseapp.imageloader.activity.ImageLoaderActivity;
import com.wujiafeng.mybaseapp.json.activity.FastJsonActivity;
import com.wujiafeng.mybaseapp.json.activity.GsonActivity;
import com.wujiafeng.mybaseapp.json.activity.NativeJsonParseAcitivity;
import com.wujiafeng.mybaseapp.picasso.activity.PicassoActivity;
import com.wujiafeng.mybaseapp.xutils3.XUtils3Activity;

/**
 * Created by Jiafeng on 2016/11/24.
 */

public class CommonFrameFragment extends BaseFragment {
    private static final String TAG = CommonFrameFragment.class.getSimpleName();
    private TextView mTextView;
    private String[] datas;
    private ListView mListView;
    private CommonFrameAdapter mCommonFrameAdapter;

    @Override
    protected View initView() {
        Log.e(TAG,"initView！");
        View view = View.inflate(mContext, R.layout.fragment_common_frame,null);
        mListView = (ListView) view.findViewById(R.id.listview);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = datas[position];
                Toast.makeText(mContext,data,Toast.LENGTH_SHORT).show();
                if(data.toLowerCase().equals("okhttp")){
                    //暂不做
                }else if (data.toLowerCase().equals("nativejsonparse")){
                    Intent intent = new Intent(mContext, NativeJsonParseAcitivity.class);
                    mContext.startActivity(intent);
                }else if (data.toLowerCase().equals("gson")){
                    Intent intent = new Intent(mContext, GsonActivity.class);
                    mContext.startActivity(intent);
                }else if (data.toLowerCase().equals("fastjson")){
                    Intent intent = new Intent(mContext, FastJsonActivity.class);
                    mContext.startActivity(intent);
                }else if (data.toLowerCase().equals("xutils3")){
                    Intent intent = new Intent(mContext, XUtils3Activity.class);
                    mContext.startActivity(intent);
                }else if (data.toLowerCase().equals("picasso")){
                    Intent intent = new Intent(mContext, PicassoActivity.class);
                    mContext.startActivity(intent);
                }else if (data.toLowerCase().equals("butterknife")){
                    Intent intent = new Intent(mContext, ButterKnifeActivity.class);
                    mContext.startActivity(intent);
                }else if (data.toLowerCase().equals("eventbus")){
                    Intent intent = new Intent(mContext, EventBusActivity.class);
                    mContext.startActivity(intent);
                }else if (data.toLowerCase().equals("imageloader")){
                    Intent intent = new Intent(mContext, ImageLoaderActivity.class);
                    mContext.startActivity(intent);
                }else if (data.toLowerCase().equals("glide")){
                    Intent intent = new Intent(mContext, GlideActivity.class);
                    mContext.startActivity(intent);
                }else if (data.toLowerCase().equals("fresco")){
                    Intent intent = new Intent(mContext, FrescoActivity.class);
                    mContext.startActivity(intent);
                }
            }
        });
        return view;
    }

    @Override
    protected void initData() {
        super.initData();
        Log.e(TAG,"initView！");

        datas = new String[]{"OKHttp","NativeJsonParse","Gson","EventBus","FastJson","xUtils3","ButterKnife","ImageLoader","Fresco","Picasso","Glide","Retrofit2","Glide","greenDao","RxJava","volley","Gson","FastJson","picasso","evenBus","jcvideoplayer","pulltorefresh","Expandablelistview","UniversalVideoView","....."};
        mCommonFrameAdapter = new CommonFrameAdapter(mContext, datas);
        mListView.setAdapter(mCommonFrameAdapter);
    }
}
