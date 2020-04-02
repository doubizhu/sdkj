package com.example.sdkj.fragment;



import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.commlib.base.mvvm.BaseFragment;
import com.example.sdkj.R;
import com.example.sdkj.databinding.FragmentBluetoothBinding;
import com.example.sdkj.viewmodel.MainDetialViewModel;

/**
 * 蓝牙
 */
public class BluetoothFragment extends BaseFragment<FragmentBluetoothBinding, MainDetialViewModel> {
    @Override
    protected int getLayoutId(LayoutInflater inflater, @Nullable ViewGroup container) {
        return R.layout.fragment_bluetooth;
    }

    @Override
    public void initViewObservable() {

    }

    @Override
    protected void initView() {

    }
    // TODO: Rename parameter arguments, choose names that match

}
