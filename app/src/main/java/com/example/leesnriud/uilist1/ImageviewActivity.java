package com.example.leesnriud.uilist1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * android imageview
 * src 是按照图片大小直接填充，并不会进行拉伸
 * background 指的是背景，会根据imageview给定的宽度来进行拉伸
 *      解决background拉伸变形方法
 *      动态加载view LinearLayout.LayoutParams layoutParam = new LinearLayout.layoutParams(48,48);
 *              layout.addView(tu,layoutParam);
 *      通过xml布局的方式引入imageview
 *              通过drawable的bitmap资源文件夹来完成 然后background属性设置为该文件即可
 *              具体文件见game_bg.xml
 *
 * java代码中设置src 和 background
 *      src setImageDrawable();
 *      background setBackgroundDrawable();
 *
 * adjustViewBounds 设置作坊是否保存原图长宽比
 *      maxHeight 设置imageview的最大高度
 *      maxWidth 设置imageview的最大宽度
 *
 *  scaleType 设置缩放类型
 *      fitXY:对图像的横向与纵向进行独立缩放,使得该图片完全适应ImageView,但是图片的横纵比可能会发生改变
 *      fitStart:保持纵横比缩放图片,知道较长的边与Image的编程相等,缩放完成后将图片放在ImageView的左上角
 *      fitCenter:同上,缩放后放于中间;
 *      fitEnd:同上,缩放后放于右下角;
 *      center:保持原图的大小，显示在ImageView的中心。当原图的size大于ImageView的size，超过部分裁剪处理。
 *      centerCrop:保持横纵比缩放图片,知道完全覆盖ImageView,可能会出现图片的显示不完全
 *      centerInside:保持横纵比缩放图片,直到ImageView能够完全地显示图片
 *      matrix:默认值，不改变原图的大小，从ImageView的左上角开始绘制原图， 原图超过ImageView的部分作裁剪处理
 *
 *      centerCrop:按横纵比缩放,直接完全覆盖整个ImageView
 *      centerInside:按横纵比缩放,使得ImageView能够完全显示这个图片
 *
 */
public class ImageviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
    }
}
