package com.example.fitnessapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;

public class LegsWorkout1ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.absworkoutone1, R.drawable.absworkoutone2};

    LegsWorkout1ImageAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }
}