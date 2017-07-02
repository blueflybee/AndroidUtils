package com.example.androidutils.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blankj.utilcode.util.PinyinUtils;
import com.example.androidutils.R;
import com.example.androidutils.base.BaseBackActivity;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 17/02/01
 *     desc  : Pinyin工具类Demo
 * </pre>
 */
public class PinyinActivity extends BaseBackActivity {

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_pinyin;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        getSupportActionBar().setTitle(getString(R.string.demo_pinyin));

        TextView tvAboutPinyin = (TextView) findViewById(R.id.tv_about_pinyin);
        tvAboutPinyin.setText("测试拼音工具类"
                + "\n转拼音: " + PinyinUtils.ccs2Pinyin("测试拼音工具类", " ")
                + "\n获取首字母: " + PinyinUtils.getPinyinFirstLetters("测试拼音工具类", " ")
                + "\n澹台: " + PinyinUtils.getSurnamePinyin("澹台"));
    }

    @Override
    public void doBusiness(Context context) {

    }

    @Override
    public void onWidgetClick(View view) {

    }
}
