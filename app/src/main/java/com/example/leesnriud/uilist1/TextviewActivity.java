package com.example.leesnriud.uilist1;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * android textview
 * <p>
 * id
 * layout_width
 * layout_height
 * gravity
 * text
 * textColor
 * textStyle
 * textSize
 * background
 */
public class TextviewActivity extends AppCompatActivity {

    @BindView(R.id.tv_html)
    TextView tvHtml;
    @BindView(R.id.tv_txtone)
    TextView tvTxtone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);
        ButterKnife.bind(this);
        setTvHtml();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <20; i ++){
            sb.append("好友"+ i +",");
        }

        String likeUsers = sb.substring(0,sb.lastIndexOf(",")).toString();
        tvTxtone.setMovementMethod(LinkMovementMethod.getInstance());
        tvTxtone.setText(addClickPart(likeUsers),TextView.BufferType.SPANNABLE);
    }

    //定义一个点击每个部分文字的处理方法
    private SpannableStringBuilder addClickPart(String str){
        SpannableStringBuilder ssb = new SpannableStringBuilder();
        ssb.append(str);
        String[] likeUsers = str.split(",");
        if(likeUsers.length>0){
            for (int i = 0; i< likeUsers.length;i++){
                final String name = likeUsers[i];
                final int start = str.indexOf(name);
                ssb.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TextviewActivity.this,name,Toast.LENGTH_LONG).show();

                    }
                    @Override
                    public void updateDrawState(TextPaint ds){
                        super.updateDrawState(ds);
                        ds.setColor(Color.BLUE);
                        ds.setUnderlineText(false);
                    }

                },start,start+name.length(),0);
            }
        }
        return ssb.append("等"+likeUsers.length+"个人觉得赞");
    }

    //设置html文本
    private void setTvHtml() {
        SpannableString span = new SpannableString("红色打电话斜体删除线绿色下划线图片：.");
        //设置背景色 setSpan 时要指定的flag Spanned.SPAN_EXCLUSIVE_EXCLUSIVE(前后都不包括)
        span.setSpan(new ForegroundColorSpan(Color.RED), 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //用超链接标记文本
        span.setSpan(new URLSpan("tel:123321"), 2, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //用样式标记文本（斜体）
        span.setSpan(new StyleSpan(Typeface.BOLD_ITALIC), 5, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //用删除线标记文本
        span.setSpan(new StrikethroughSpan(), 7, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //用下划线标记文本
        span.setSpan(new UnderlineSpan(), 10, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //用颜色标记
        span.setSpan(new ForegroundColorSpan(Color.GREEN), 10, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //获取drawable资源
        Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
        d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
        //创建imageSpan，然后用imageSpan代替文本
        ImageSpan imageSpan = new ImageSpan(d, ImageSpan.ALIGN_BASELINE);
        span.setSpan(imageSpan, 18, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        tvHtml.setText(span);
    }

}
