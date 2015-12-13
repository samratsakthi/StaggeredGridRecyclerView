package sakthi.com.staggeredgridrecyclerview.animation;

import android.view.animation.Animation;
import android.widget.ImageView;

import sakthi.com.staggeredgridrecyclerview.R;

/**
 * Created by a6000680 on 12/12/15.
 */
public class AnimationUtils {

    public static void rotateImage(ImageView imageView,long duration) {
        Animation rotateAnimation = android.view.animation.AnimationUtils.loadAnimation(imageView.getContext(), R.anim.rotate);
        rotateAnimation.setDuration(duration);
        imageView.startAnimation(rotateAnimation);
    }
}
