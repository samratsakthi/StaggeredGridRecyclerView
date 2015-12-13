package sakthi.com.staggeredgridrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sakthi.com.staggeredgridrecyclerview.R;
import sakthi.com.staggeredgridrecyclerview.model.StaggeredGridViewHolder;

/**
 * Created by a6000680 on 12/12/15.
 */
public class StaggeredGridViewAdapter extends RecyclerView.Adapter<StaggeredGridViewHolder> {

    private Context mContext;
    private int[] mDrawables;
    private ClickListener mClickListener;

    public StaggeredGridViewAdapter(Context context,int []resources,ClickListener listener) {
        mContext = context;
        mDrawables = resources;
        mClickListener = listener;
    }

    @Override
    public StaggeredGridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.layout_grid_item,parent,false);
        StaggeredGridViewHolder gridViewHolder = new StaggeredGridViewHolder(layout,mClickListener);
        return gridViewHolder;
    }

    @Override
    public void onBindViewHolder(StaggeredGridViewHolder holder, int position) {
        holder.mImageView.setImageResource(mDrawables[position]);
    }

    @Override
    public int getItemCount() {
        return mDrawables.length;
    }

    public static interface ClickListener {
        void onClickItem(StaggeredGridViewHolder holder);
    }
}
