package sakthi.com.staggeredgridrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import sakthi.com.staggeredgridrecyclerview.adapter.StaggeredGridViewAdapter;
import sakthi.com.staggeredgridrecyclerview.animation.AnimationUtils;
import sakthi.com.staggeredgridrecyclerview.model.StaggeredGridViewHolder;

public class MainActivity extends AppCompatActivity implements StaggeredGridViewAdapter.ClickListener {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private StaggeredGridLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        int columns = 3;
        mLayoutManager = new StaggeredGridLayoutManager(columns, OrientationHelper.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);
        int[] drawables = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four,
                R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eight,
                R.drawable.nine, R.drawable.ten, R.drawable.eleven, R.drawable.twelve,
                R.drawable.thirteen, R.drawable.fourteen, R.drawable.fifteen, R.drawable.sixteen,
                R.drawable.seventeen, R.drawable.eighteen, R.drawable.nineteen, R.drawable.twenty,
                R.drawable.twentyone, R.drawable.twentytwo, R.drawable.twentythree, R.drawable.twentyfour,
                R.drawable.sports, R.drawable.auto, R.drawable.sports1, R.drawable.corvette,
                R.drawable.meadow, R.drawable.landscape, R.drawable.tree, R.drawable.leaf,
                R.drawable.chrome, R.drawable.motorcycle, R.drawable.oil, R.drawable.torre,
                R.drawable.buttons, R.drawable.jewelry, R.drawable.crown, R.drawable.twentyfour,
                R.drawable.twentyone, R.drawable.twentytwo, R.drawable.twentythree, R.drawable.twentyfour,};
        mAdapter = new StaggeredGridViewAdapter(this, drawables, this);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onClickItem(StaggeredGridViewHolder holder) {
        AnimationUtils.rotateImage(holder.mImageView, 3000);
    }

}
