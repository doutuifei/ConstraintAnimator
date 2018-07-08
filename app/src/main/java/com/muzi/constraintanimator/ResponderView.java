package com.muzi.constraintanimator;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;

/**
 * 作者: lipeng
 * 时间: 2018/7/8
 * 邮箱: lipeng@moyi365.com
 * 功能:
 */
public class ResponderView extends ConstraintLayout {

    private ConstraintSet first, second, third, fourth, fifth, sixth, seventh, eighth;
    private ConstraintLayout firstLayout;
    private int index = 1;
    private Transition addTransition, stubTransition;

    public ResponderView(Context context) {
        super(context);
        init();
    }

    public ResponderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout1, this, true);
        firstLayout = findViewById(R.id.contentPanel);

        addTransition = new AutoTransition();
        stubTransition = new AutoTransition();

        first = new ConstraintSet();
        second = new ConstraintSet();
        third = new ConstraintSet();
        fourth = new ConstraintSet();
        fifth = new ConstraintSet();
        sixth = new ConstraintSet();
        seventh = new ConstraintSet();
        eighth = new ConstraintSet();

        first.clone(firstLayout);
        second.clone(getContext(), R.layout.layout2);
        third.clone(getContext(), R.layout.layout3);
        fourth.clone(getContext(), R.layout.layout4);
        fifth.clone(getContext(), R.layout.layout5);
        sixth.clone(getContext(), R.layout.layout6);
        seventh.clone(getContext(), R.layout.layout7);
        eighth.clone(getContext(), R.layout.layout8);
    }


    public void addView() {
        _addView();
    }

    public void stubView() {
        _stubView();
    }

    private void _stubView() {
        switch (index) {
            case 2:
                index = 1;
                TransitionManager.beginDelayedTransition(firstLayout, stubTransition);
                first.applyTo(firstLayout);
                break;
            case 3:
                index = 2;
                TransitionManager.beginDelayedTransition(firstLayout, stubTransition);
                second.applyTo(firstLayout);
                break;
            case 4:
                index = 3;
                TransitionManager.beginDelayedTransition(firstLayout, stubTransition);
                third.applyTo(firstLayout);
                break;
            case 5:
                index = 4;
                TransitionManager.beginDelayedTransition(firstLayout, stubTransition);
                fourth.applyTo(firstLayout);
                break;
            case 6:
                index = 5;
                TransitionManager.beginDelayedTransition(firstLayout, stubTransition);
                fifth.applyTo(firstLayout);
                break;
            case 7:
                index = 6;
                TransitionManager.beginDelayedTransition(firstLayout, stubTransition);
                sixth.applyTo(firstLayout);
                break;
            case 8:
                index = 7;
                TransitionManager.beginDelayedTransition(firstLayout, stubTransition);
                seventh.applyTo(firstLayout);
                break;
        }
    }

    private void _addView() {
        switch (index) {
            case 1:
                index = 2;
                TransitionManager.beginDelayedTransition(firstLayout, addTransition);
                second.applyTo(firstLayout);
                break;
            case 2:
                index = 3;
                TransitionManager.beginDelayedTransition(firstLayout, addTransition);
                third.applyTo(firstLayout);
                break;
            case 3:
                index = 4;
                TransitionManager.beginDelayedTransition(firstLayout, addTransition);
                fourth.applyTo(firstLayout);
                break;
            case 4:
                index = 5;
                TransitionManager.beginDelayedTransition(firstLayout, addTransition);
                fifth.applyTo(firstLayout);
                break;
            case 5:
                index = 6;
                TransitionManager.beginDelayedTransition(firstLayout, addTransition);
                sixth.applyTo(firstLayout);
                break;
            case 6:
                index = 7;
                TransitionManager.beginDelayedTransition(firstLayout, addTransition);
                seventh.applyTo(firstLayout);
                break;
            case 7:
                index = 8;
                TransitionManager.beginDelayedTransition(firstLayout, addTransition);
                eighth.applyTo(firstLayout);
                break;
        }
    }


}
