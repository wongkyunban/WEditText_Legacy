package com.wong.wedittext_legacy;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

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
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < 50; i++) {
            list.add("No." + i + "号");
        }
        spinnerEditText.setOptions(list);

        ClearEditText cet = (ClearEditText)findViewById(R.id.cet);
//        cet.setShakeAnimation();
//        Drawable drawable = getResources().getDrawable(R.mipmap.ic_launcher,null);
//        drawable.setBounds(0,0,drawable.getIntrinsicWidth(),drawable.getIntrinsicHeight());
//        cet.setCompoundDrawablesRelative(null,null,drawable,null);

        /*SimpleSpinnerEditText*/
        List<Object> strings = new ArrayList<Object>();
        for (int i = 0; i < 50; i++) {
            strings.add("No." + i + "号");
        }
        SimpleSpinnerEditText simpleSpinnerEditText = (SimpleSpinnerEditText)findViewById(R.id.sset);
        simpleSpinnerEditText.setOptions(strings);
//        simpleSpinnerEditText.setPopupDivider(getDrawable(R.drawable.divider_bg));
//        simpleSpinnerEditText.setPopupDividerHeight(80);

    }
}
