package com.example.leesnriud.uilist1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * android button
 *
 * drawable:引用的Drawable位图,我们可以把他放到最前面,就表示组件的正常状态
 * state_focused:是否获得焦点
 * state_window_focused:是否获得窗口焦点
 * state_enabled:控件是否可用
 * state_checkable:控件可否被勾选,eg:checkbox
 * state_checked:控件是否被勾选
 * state_selected:控件是否被选择,针对有滚轮的情况
 * state_pressed:控件是否被按下
 * state_active:控件是否处于活动状态,eg:slidingTab
 * state_single:控件包含多个子控件时,确定是否只显示一个子控件
 * state_first:控件包含多个子控件时,确定第一个子控件是否处于显示状态
 * state_middle:控件包含多个子控件时,确定中间一个子控件是否处于显示状态
 * state_last:控件包含多个子控件时,确定最后一个子控件是否处于显示状态
 */
public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }
}
