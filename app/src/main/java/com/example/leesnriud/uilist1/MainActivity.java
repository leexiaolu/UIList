package com.example.leesnriud.uilist1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * android 部分UI组件
 *
 */
public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_textview, R.id.bt_edittext, R.id.bt_button, R.id.bt_imagebutton, R.id.bt_imageview, R.id.bt_radiobutton, R.id.bt_checkbox})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_textview:
                intent = new Intent(MainActivity.this,TextviewActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_edittext:
                intent = new Intent(MainActivity.this,EdittextActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_button:
                intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_imagebutton:
                intent = new Intent(MainActivity.this,ImagebuttonActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_imageview:
                intent = new Intent(MainActivity.this,ImageviewActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_radiobutton:
                intent = new Intent(MainActivity.this,RadiobuttonActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_checkbox:
                intent = new Intent(MainActivity.this,CheckboxActivity.class);
                startActivity(intent);
                break;
        }
    }
}
