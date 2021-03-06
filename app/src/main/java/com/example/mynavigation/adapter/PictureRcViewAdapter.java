package com.example.mynavigation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynavigation.R;

public class PictureRcViewAdapter extends RecyclerView.Adapter<PictureRcViewAdapter.rvHolder> {
    //    获取视频的id
    int[] pictureID = new int[]{R.drawable.pic, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4};

    //    设置视频缩略图下的名字
    String[] pictureName = new String[]{"pic.jpeg", "pic2.jpeg", "pic3.jpeg", "pic4.jpeg"};


//    设置每一个item的监听事件
    private OnItemClickListener clickListener;

    public void setClickListener(OnItemClickListener clickListener){
        this.clickListener = clickListener;
    }

//    回调的接口
    public interface OnItemClickListener{
        void onItemClick(View v, int pictureID);
    }

    @NonNull
    @Override
    public rvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        item_rview_adapter_video是每个创建的子类视图的模板
        return new rvHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_rcview_ftvadapter, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull rvHolder holder, final int position) {
        holder.ivVideo.setImageResource(pictureID[position]);
        holder.tvName.setText(pictureName[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickListener != null){
                    clickListener.onItemClick(v,pictureID[position]);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return pictureID.length;
    }

    class rvHolder extends RecyclerView.ViewHolder {
        //        设置全局变量，在上面的onBindViewHolder方法中可以直接调用
        ImageView ivVideo;
        TextView tvName;


        public rvHolder(@NonNull View itemView) {
            super(itemView);
            ivVideo = itemView.findViewById(R.id.iv_video_pic);
            tvName = itemView.findViewById(R.id.tv_video_name);
        }
    }
}
