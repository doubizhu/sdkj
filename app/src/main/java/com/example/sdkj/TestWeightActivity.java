package com.example.sdkj;


import com.example.commlib.base.mvvm.BaseActivity;
import com.example.commlib.base.mvvm.BaseViewModel;
import com.example.commlib.rx.RxTimerUtil;
import com.example.commlib.utils.animations.Other;
import com.example.commlib.utils.animations.RxAnimation;
import com.example.commlib.weight.IProgressBar;
import com.example.sdkj.databinding.ActivityTestWeightBinding;


import java.util.concurrent.TimeUnit;

/**
 * @anthor yzh
 * @time 2019/11/30 15:07
 */
public class TestWeightActivity extends BaseActivity<ActivityTestWeightBinding, BaseViewModel> {

    int num=0;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_test_weight;
    }

//    @Override
//    protected BaseMvvmViewModel initMVVMViewModel() {
//        return null;
//    }

    @Override
    public void initViewObservable() {

    }

    @Override
    protected void initView() {
        mBinding.mCircleProgressBar.setIProgressBarTextGenerator(new IProgressBar.IProgressBarTextGenerator() {
            @Override
            public String generateText(IProgressBar progressBar, int value, int maxValue) {
                if(value==maxValue){
                    mBinding.mCircleProgressBar.setProgress(0);
                    RxTimerUtil.cancel("TestWeightActivity");
                }
                return 100 * value / maxValue + "%";
            }
        });

        //倒计时工具类
        RxTimerUtil.interval(100, TimeUnit.MILLISECONDS,"TestWeightActivity",(number, timerName) -> {
            mBinding.mCircleProgressBar.setProgress(num++);

        });

        mBinding.mCountDownView.startCountDown();
        mBinding.mCountDownView.setAddCountDownListener(() -> mBinding.mCountDownView.startCountDown());
        mBinding.mLineWaveVoiceView.startRecord();

        //示例动画工具类使用
        RxAnimation.get().setAnimation(Other.pulseAnimator(mBinding.mCountDownView,2))
                .setDuration(1000)
                .start();
    }
}
