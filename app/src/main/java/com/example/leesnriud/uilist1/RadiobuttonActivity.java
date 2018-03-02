package com.example.leesnriud.uilist1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * android radiobutton
 */
public class RadiobuttonActivity extends AppCompatActivity {

    @BindView(R.id.rb_yes)
    RadioButton rbYes;
    @BindView(R.id.rb_no)
    RadioButton rbNo;
    @BindView(R.id.rg_radiogroup)
    RadioGroup rgRadiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
        ButterKnife.bind(this);

        rgRadiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb = findViewById(i);
                Toast.makeText(RadiobuttonActivity.this,"你选择了 " + rb.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @OnClick(R.id.bt_commit)
    public void onViewClicked() {
        for (int i = 0; i < rgRadiogroup.getChildCount(); i++) {
            RadioButton rd = (RadioButton) rgRadiogroup.getChildAt(i);
            if (rd.isChecked()) {
                Toast.makeText(getApplicationContext(), "你选择的是:" + rd.getText(), Toast.LENGTH_LONG).show();
                break;
            }
        }
    }
}
