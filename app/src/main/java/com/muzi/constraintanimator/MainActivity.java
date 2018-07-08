package com.muzi.constraintanimator;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ConstraintSet first, second, third, fourth;
    private ConstraintLayout firstLayout;
    private Button start;
    int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        first = new ConstraintSet();
        second = new ConstraintSet();
        third = new ConstraintSet();
        fourth = new ConstraintSet();
        firstLayout = findViewById(R.id.contentPanel);
        start = findViewById(R.id.start);

        first.clone(firstLayout);
        second.clone(this, R.layout.layout2);
        third.clone(this, R.layout.layout3);
        fourth.clone(this, R.layout.layout4);
        start.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                switch (index) {
                    case 1:
                        index = 2;
                        TransitionManager.beginDelayedTransition(firstLayout);// 动画效果
                        second.applyTo(firstLayout);
                        break;
                    case 2:
                        index = 3;
                        TransitionManager.beginDelayedTransition(firstLayout);// 动画效果
                        third.applyTo(firstLayout);
                        break;
                    case 3:
                        index = 4;
                        TransitionManager.beginDelayedTransition(firstLayout);
                        fourth.applyTo(firstLayout);
                        break;
                    case 4:
                        index = 1;
                        TransitionManager.beginDelayedTransition(firstLayout);
                        first.applyTo(firstLayout);
                        break;
                }
            }
        });
    }

}
