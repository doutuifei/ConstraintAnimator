# Constraint动画

## 预览

![img](https://github.com/mzyq/ConstraintAnimator/blob/5d8229725a4c16205a1570e23dbdcd5d1ceac76b/img/img.gif)

* TransitionManager只对直接的子view有效果，如果是ViewGroup内部的View就没有效果。
* TransitionManager动画和内部ViewGroup的动画不能同时执行，可以用```Handler```设置延时。