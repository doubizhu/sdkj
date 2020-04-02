package com.example.sdkj.fragment;

import androidx.annotation.Nullable;


import android.view.LayoutInflater;

import android.view.ViewGroup;

import com.example.commlib.base.mvvm.BaseFragment;
import com.example.commlib.base.mvvm.BaseViewModel;
import com.example.sdkj.R;
import com.example.sdkj.databinding.FragmentHomePageBinding;
import com.example.sdkj.viewmodel.MainDetialViewModel;

/**
 * 首页
 */
public class HomePageFragment extends BaseFragment<FragmentHomePageBinding, MainDetialViewModel> {

    @Override
    protected int getLayoutId(LayoutInflater inflater, @Nullable ViewGroup container) {
        return R.layout.fragment_home_page;
    }

    @Override
    public void initViewObservable() {

    }

    @Override
    protected void initView() {

    }


}
