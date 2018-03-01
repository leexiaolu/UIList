package com.example.leesnriud.uilist1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.EditText;

/**
 * Created by lee.snriud on 2018/3/1.
 */


@SuppressLint("AppCompatCustomView")
public class EditTextWithDel extends EditText {

    private final static String TAG = "EditTextWithDel";
    private Drawable imgInable;
    private Drawable imgAble;
    private Context mContext;

    public EditTextWithDel(Context context) {
        super(context);
        mContext = context;
        init();
    }
    public EditTextWithDel(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        mContext = context;
        init();
    }
    public EditTextWithDel(Context context,AttributeSet attributeSet,int defStyleAttr){
        super(context,attributeSet,defStyleAttr);
        mContext = context;
        init();

    }

    private void init(){
        imgInable = mContext.getResources().getDrawable(R.drawable.ic_launcher_background);
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                setDrawable();
            }
        });
        setDrawable();
    }

    //设置删除图片
    private void setDrawable(){
        if(length()<1){
            setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
        }else{
            setCompoundDrawablesWithIntrinsicBounds(null,null,imgInable,null);
        }
    }

    //处理删除事件
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(imgInable != null && event.getAction() == MotionEvent.ACTION_UP){
            int eventX = (int) event.getRawX();
            int eventY = (int) event.getRawY();

            Log.e(TAG,"eventX = "+eventX+"; eventY = " + eventY);

            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            rect.left = rect.right - 100;
            if(rect.contains(eventX,eventY))
                setText("");
        }
        return super.onTouchEvent(event);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}