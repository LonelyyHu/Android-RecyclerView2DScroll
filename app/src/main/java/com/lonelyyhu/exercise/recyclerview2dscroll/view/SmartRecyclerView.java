package com.lonelyyhu.exercise.recyclerview2dscroll.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by hulonelyy on 2017/12/7.
 */

public class SmartRecyclerView extends RecyclerView{

    public int computedWidth;

    public SmartRecyclerView(Context context) {
        super(context);
    }

    public SmartRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SmartRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

//    @Override
//    public boolean canScrollHorizontally(int direction) {
//        return false;
//    }
//
//    @Override
//    public int getMinimumWidth() {
//        return computedWidth;
//    }
//
//    @Override
//    protected void onMeasure(int widthSpec, int heightSpec) {
//        super.onMeasure(widthSpec, heightSpec);
//        setMeasuredDimension(computedWidth, getMeasuredHeight());
//    }
//
//    @Override
//    protected int getSuggestedMinimumWidth() {
//        return computedWidth;
//    }
}
