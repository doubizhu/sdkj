package com.example.sdkj.fragment;


import androidx.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.commlib.base.mvvm.BaseFragment;
import com.example.sdkj.R;
import com.example.sdkj.databinding.FragmentQueryBinding;
import com.example.sdkj.viewmodel.MainDetialViewModel;

/**
 * 查询
 */
public class QueryFragment extends BaseFragment<FragmentQueryBinding, MainDetialViewModel> {

    @Override
    protected int getLayoutId(LayoutInflater inflater, @Nullable ViewGroup container) {
        return R.layout.fragment_query;
    }

    @Override
    public void initViewObservable() {

    }

    @Override
    protected void initView() {

    }
}
