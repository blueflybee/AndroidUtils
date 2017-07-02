package com.example.androidutils.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.blankj.utilcode.util.FragmentUtils;
import com.example.androidutils.R;
import com.example.androidutils.base.BaseBackActivity;
import com.example.androidutils.fragment.Demo0Fragment;

import java.util.ArrayList;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 17/02/01
 *     desc  : Fragment工具类Demo
 * </pre>
 */
public class FragmentActivity extends BaseBackActivity {

    public Fragment rootFragment;

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_fragment;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        getSupportActionBar().setTitle(getString(R.string.demo_fragment));
    }

    @Override
    public void doBusiness(Context context) {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(Demo0Fragment.newInstance());
        rootFragment = FragmentUtils.addFragments(getSupportFragmentManager(), fragments, R.id.fragment_container, 0);
    }

    @Override
    public void onWidgetClick(View view) {

    }


    @Override
    public void onBackPressed() {
        if (!FragmentUtils.dispatchBackPress(getSupportFragmentManager())) {
            super.onBackPressed();
        }
    }
}