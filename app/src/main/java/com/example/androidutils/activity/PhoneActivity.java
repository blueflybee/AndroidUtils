package com.example.androidutils.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blankj.utilcode.util.PhoneUtils;
import com.example.androidutils.R;
import com.example.androidutils.base.BaseBackActivity;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2016/10/13
 *     desc  : Phone工具类Demo
 * </pre>
 */
public class PhoneActivity extends BaseBackActivity {

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_phone;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        getSupportActionBar().setTitle(getString(R.string.demo_phone));

        findViewById(R.id.btn_dial).setOnClickListener(this);
        findViewById(R.id.btn_call).setOnClickListener(this);
        findViewById(R.id.btn_send_sms).setOnClickListener(this);
        findViewById(R.id.btn_send_sms_silent).setOnClickListener(this);
        TextView tvAboutPhone = (TextView) findViewById(R.id.tv_about_phone);
        tvAboutPhone.setText("isPhone: " + PhoneUtils.isPhone()
                + "\ngetIMEI: " + PhoneUtils.getIMEI()
                + "\ngetIMSI: " + PhoneUtils.getIMSI()
                + "\ngetPhoneType: " + PhoneUtils.getPhoneType()
                + "\nisSimCardReady: " + PhoneUtils.isSimCardReady()
                + "\ngetSimOperatorName: " + PhoneUtils.getSimOperatorName()
                + "\ngetSimOperatorByMnc: " + PhoneUtils.getSimOperatorByMnc()
                + "\n获取手机状态信息: " + PhoneUtils.getPhoneStatus()
        );
    }

    @Override
    public void doBusiness(Context context) {

    }

    @Override
    public void onWidgetClick(View view) {
        switch (view.getId()) {
            case R.id.btn_dial:
                PhoneUtils.dial("10000");
                break;
            case R.id.btn_call:
                PhoneUtils.call("10000");
                break;
            case R.id.btn_send_sms:
                PhoneUtils.sendSms("10000", "test");
                break;
            case R.id.btn_send_sms_silent:
                PhoneUtils.sendSmsSilent("10000", "test");
                break;
        }
    }
}
