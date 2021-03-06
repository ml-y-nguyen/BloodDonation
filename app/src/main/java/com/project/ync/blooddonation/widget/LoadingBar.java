package com.project.ync.blooddonation.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.ProgressBar;

import com.project.ync.blooddonation.R;

/**
 * @author YNC
 */
public class LoadingBar extends ProgressBar {
    public LoadingBar(Context context) {
        this(context, null);
    }

    public LoadingBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(getContext(), R.color.colorPrimary), PorterDuff.Mode.SRC_IN);
    }
}
