package com.example.sdkj.fragment;



import androidx.annotation.Nullable;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.commlib.base.mvvm.BaseFragment;
import com.example.sdkj.R;
import com.example.sdkj.databinding.FragmentMineBinding;
import com.example.sdkj.viewmodel.MainDetialViewModel;

/**
 * 我的.
 */
public class MineFragment extends BaseFragment<FragmentMineBinding, MainDetialViewModel> {


    @Override
    protected int getLayoutId(LayoutInflater inflater, @Nullable ViewGroup container) {
        return R.layout.fragment_mine;
    }

    @Override
    public void initViewObservable() {

    }

    @Override
    protected void initView() {

    }
}
