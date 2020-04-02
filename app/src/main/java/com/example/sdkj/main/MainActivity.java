package com.example.sdkj.main;

import android.os.Bundle;


import com.example.commlib.base.mvvm.BaseActivity;
import com.example.commlib.base.mvvm.BaseFragment;
import com.example.commlib.base.mvvm.BaseViewModel;
import com.example.commlib.utils.FragmentTabUtils;
import com.example.sdkj.R;
import com.example.sdkj.databinding.ActivityMainBinding;
import com.example.sdkj.fragment.BluetoothFragment;
import com.example.sdkj.fragment.HomePageFragment;
import com.example.sdkj.fragment.MineFragment;
import com.example.sdkj.fragment.QueryFragment;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends BaseActivity<ActivityMainBinding, BaseViewModel> {

    List<BaseFragment> fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViewObservable() {

    }

    @Override
    protected void initView() {
        fragments= new ArrayList<>();
        fragments.add(new HomePageFragment());
        fragments.add(new BluetoothFragment());
        fragments.add(new QueryFragment());
        fragments.add(new MineFragment());
        FragmentTabUtils tabUtils = new FragmentTabUtils(getSupportFragmentManager(),fragments,R.id.fl_content,mBinding.rgMain);
    }


}
