package com.muzi.constraintanimator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

/**
 * 作者: lipeng
 * 时间: 2018/7/6
 * 邮箱: lipeng@moyi365.com
 * 功能:
 */
public class ItemView extends RelativeLayout {

    public ItemView(Context context) {
        super(context);
        init();
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.item, this, true);
    }

}
