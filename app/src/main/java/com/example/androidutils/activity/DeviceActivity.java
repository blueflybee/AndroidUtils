package com.example.androidutils.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blankj.utilcode.util.DeviceUtils;
import com.example.androidutils.R;
import com.example.androidutils.base.BaseBackActivity;

/**
 * <pre>
 *     author: Blankj
 *     blog : http://blankj.com
 *     time : 2016/09/27
 *     desc : Device工具类Demo
 * </pre>
 */
public class DeviceActivity extends BaseBackActivity {

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_device;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        getSupportActionBar().setTitle(getString(R.string.demo_device));

        findViewById(R.id.btn_shutdown).setOnClickListener(this);
        findViewById(R.id.btn_reboot).setOnClickListener(this);
        findViewById(R.id.btn_reboot_to_recovery).setOnClickListener(this);
        findViewById(R.id.btn_reboot_to_bootloader).setOnClickListener(this);
        TextView tvAboutDevice = (TextView) findViewById(R.id.tv_about_device);
        tvAboutDevice.setText("isRoot: " + DeviceUtils.isDeviceRooted()
                + "\ngetSDKVersion: " + DeviceUtils.getSDKVersion()
                + "\ngetAndroidID: " + DeviceUtils.getAndroidID()
                + "\ngetMacAddress: " + DeviceUtils.getMacAddress()
                + "\ngetManufacturer: " + DeviceUtils.getManufacturer()
                + "\ngetModel: " + DeviceUtils.getModel()
        );
    }

    @Override
    public void doBusiness(Context context) {

    }

    @Override
    public void onWidgetClick(View view) {
        switch (view.getId()) {
            case R.id.btn_shutdown:
                DeviceUtils.shutdown();
                break;
            case R.id.btn_reboot:
                DeviceUtils.reboot();
                break;
            case R.id.btn_reboot_to_recovery:
                DeviceUtils.reboot2Recovery();
                break;
            case R.id.btn_reboot_to_bootloader:
                DeviceUtils.reboot2Bootloader();
                break;
        }
    }
}