package com.project.ync.blooddonation.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * @author YNC
 */
public class NoSwipeViewPager extends ViewPager {

    public NoSwipeViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return false;

    }
}
