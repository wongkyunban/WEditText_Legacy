package com.wong.wedittext_legacy;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import com.wong.widget.legacy.utils.DensityUtils;
import com.wong.widget.legacy.widget.ClearEditText;
import com.wong.widget.legacy.widget.SimpleSpinnerEditText;
import com.wong.widget.legacy.widget.SpinnerEditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SpinnerEditText spinnerEditText = (SpinnerEditText)findViewById(R.id.set_select_input);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            list.add("NNo." + i + "号");
        }
        spinnerEditText.setOptions(list);
        spinnerEditText.setItemTextColor(0xff00ff00);
        spinnerEditText.setItemTextSize(DensityUtils.sp2px(this,10));

        ClearEditText cet = (ClearEditText)findViewById(R.id.cet);
//        cet.setShakeAnimation();
//        Drawable drawable = getResources().getDrawable(R.mipmap.ic_launcher,null);
//        drawable.setBounds(0,0,drawable.getIntrinsicWidth(),drawable.getIntrinsicHeight());
//        cet.setCompoundDrawablesRelative(null,null,drawable,null);

        /*SimpleSpinnerEditText*/
        SimpleSpinnerEditText simpleSpinnerEditText = (SimpleSpinnerEditText)findViewById(R.id.sset);

        List<Bean> strings = new ArrayList<Bean>();
        for (int i = 0; i < 50; i++) {
            Bean bean = new Bean("Tom"+i,"NO."+i);
            strings.add(bean);
        }
        simpleSpinnerEditText.setOptions(strings);
        simpleSpinnerEditText.setItemTextColor(Color.BLUE);
        simpleSpinnerEditText.setItemTextSize(DensityUtils.sp2px(this,5));
//        simpleSpinnerEditText.setPopupDivider(getDrawable(R.drawable.divider_bg));
//        simpleSpinnerEditText.setPopupDividerHeight(80);

    }
}
