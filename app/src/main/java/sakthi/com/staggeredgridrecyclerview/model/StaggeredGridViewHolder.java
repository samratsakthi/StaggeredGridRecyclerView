package sakthi.com.staggeredgridrecyclerview.model;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;

import sakthi.com.staggeredgridrecyclerview.R;
import sakthi.com.staggeredgridrecyclerview.adapter.StaggeredGridViewAdapter;

/**
 * Created by a6000680 on 12/12/15.
 */
public class StaggeredGridViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ImageView mImageView;
    public StaggeredGridViewAdapter.ClickListener mClickListener;

    public StaggeredGridViewHolder(View view,StaggeredGridViewAdapter.ClickListener listener) {
        super(view);
        view.setOnClickListener(this);
        mImageView = (ImageView) view.findViewById(R.id.imageView);
        mClickListener = listener;
    }

    @Override
    public void onClick(View item) {
        mClickListener.onClickItem(this);
    }
}
