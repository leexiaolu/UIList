package com.example.leesnriud.uilist1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * android edittext
 * <p>
 * hint 设置默认提示文本
 * selectAllOnFocus 设置为true时，获得焦点后选取的是所有文本
 * inputTyoe 设置输入类型
 * minLines  设置最小行数
 * maxLines  设置最大行数 当输入内容超过maxLines时，文字会自动向上滚动
 * singleLine 设置单行输入
 * textScaleX textScaleY 字与字之间的水平 垂直间距
 * capitalize 设置英文字母大写类型 sentences 仅第一个字母大写 words 每一个单词的首字母大写 空格区分单词 characters 每个英文字母都大写
 * windowSoftInputMode 在AndroidManifest中设置 主窗口与软键盘的交互模式
 * stateUnspecified 软键盘的状态并没有指定，系统将选择一个合适的状态或依赖于主题的设置
 * stateUnchanged 软键盘将一直保持在上一个activity里的状态，无论是隐藏还是现实
 * stateHidden 用户选择activity时，软键盘总是被隐藏
 * stateAlwaysHidden 当该activity主窗口获取焦点时，软键盘也总是被隐藏的
 * stateVisible 软键盘是可见的
 * stateAlwaysVisible 用户选择activity时，软键盘总是可见的
 * adjustUnspecified 默认设置，通常由系统自行决定是隐藏还是显示
 * adjustResize 该activity总是调整屏幕的大小以便留出软键盘的空间
 * adjustPan 当前窗口的内容将自动移动以便当前焦点从不被键盘覆盖和用户能总是看到输入内容的部分
 * 带删除按钮的edittext实现
 * 为edittext设置addTextChangedListener 重写TextWatcher 里的抽象方法
 * setCompoundDrawablesWithIntrinsicBounds设置删除的图片 重写onTouchEvent
 */
public class EdittextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);
    }

}
