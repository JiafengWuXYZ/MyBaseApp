package com.wujiafeng.mybaseapp.glide.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.wujiafeng.mybaseapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Jiafeng on 2016/11/29.
 */
public class GlideRecyclerviewAdapter extends RecyclerView.Adapter<GlideRecyclerviewAdapter.ViewHolder> {
    private Context mContext;

    String[] mDatas = new String[]{
            "http://www.sinaimg.cn/qc/photo_auto/photo/84/35/39698435/39698435_140.jpg",
            "http://www.sinaimg.cn/qc/photo_auto/photo/44/23/39674423/39674423_140.jpg",
            "http://www.sinaimg.cn/qc/photo_auto/photo/74/19/39657419/39657419_140.jpg",
            "http://www.sinaimg.cn/qc/photo_auto/photo/34/09/39653409/39653409_140.jpg",
            "http://www.sinaimg.cn/qc/photo_auto/photo/53/97/39645397/39645397_140.jpg",
            "http://www.sinaimg.cn/qc/photo_auto/photo/93/94/39629394/39629394_140.jpg",
            "http://www.sinaimg.cn/qc/photo_auto/photo/63/79/39616379/39616379_140.jpg",
            "http://img.zcool.cn/community/0180b555437fa50000019ae99381c3.jpg"
    };

    public GlideRecyclerviewAdapter(Context context) {
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = View.inflate(mContext, R.layout.item_glide_recyclerview, null);
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // 获取当前item数据

        // 显示数据
        int width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200f, mContext.getResources().getDisplayMetrics());
        int height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200f, mContext.getResources().getDisplayMetrics());

        Glide.with(mContext)
                .load(mDatas[position])
                .placeholder(R.mipmap.ic_launcher) //占位图
                .error(R.mipmap.ic_launcher)  //出错的占位图
                .override(width, height) //图片显示的分辨率 ，像素值 可以转化为DP再设置
                .animate(R.anim.glide_anim)
                .centerCrop()
                .fitCenter()
                .into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.iv_glide_recyclerview)
        ImageView iv;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

}
