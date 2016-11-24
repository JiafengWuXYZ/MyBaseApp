package com.wujiafeng.mybaseapp.fragment;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.wujiafeng.mybaseapp.R;
import com.wujiafeng.mybaseapp.adapter.CommonFrameAdapter;
import com.wujiafeng.mybaseapp.base.BaseFragment;

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
            }
        });
        return view;
    }

    @Override
    protected void initData() {
        super.initData();
        Log.e(TAG,"initView！");

        datas = new String[]{"OKHttp", "xUtils3","Retrofit2","Fresco","Glide","greenDao","RxJava","volley","Gson","FastJson","picasso","evenBus","jcvideoplayer","pulltorefresh","Expandablelistview","UniversalVideoView","....."};
        mCommonFrameAdapter = new CommonFrameAdapter(mContext, datas);
        mListView.setAdapter(mCommonFrameAdapter);
    }
}
