package com.mingshu.vm.patrol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;

import com.king.zxing.CameraScan;
import com.mingshu.vm.patrol.area.activity.AreaStandardActivity;
import com.mingshu.vm.patrol.databinding.FragmentPatrolBinding;
import com.mingshu.vm.patrol.device.DeviceInfoActivity;
import com.mingshu.vm.patrol.login.LoginUtil;
import com.mingshu.vm.patrol.scan.ScanActivity;
import com.xuanfeng.xflibrary.mvp.BaseFragment;
import com.xuanfeng.xflibrary.mvp.BasePresenter;

/**
 * 巡检界面
 */
public class PatrolFragment extends BaseFragment<BasePresenter, FragmentPatrolBinding> implements View.OnClickListener {

    public static final String TAG = "PatrolFragment";
    // 重要部位
    ActivityResultLauncher mPartLauncher;
    // 重要区域
    ActivityResultLauncher mAreaLauncher;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_patrol;
    }

    @Override
    public BasePresenter initPresenter() {
        return null;
    }

    @Override
    public void initData(Bundle bundle) {
        mBinding.setFragment(this);
        LoginUtil.login(getActivity());
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAreaLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() != Activity.RESULT_OK) {
                    return;
                }
                Intent data = result.getData();
                Log.i(TAG, "扫码结果= " + CameraScan.parseScanResult(data));

                Intent intent = new Intent(getContext(), AreaStandardActivity.class);
                intent.putExtra(AreaStandardActivity.AREA_ID, CameraScan.parseScanResult(data));
                startActivity(intent);
            }
        });

        mPartLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() != Activity.RESULT_OK) {
                    return;
                }
                Intent data = result.getData();
                Log.i(TAG, "扫码结果= " + CameraScan.parseScanResult(data));

                Intent intent = new Intent(getContext(), DeviceInfoActivity.class);
                intent.putExtra(DeviceInfoActivity.DEVICE_ID, CameraScan.parseScanResult(data));
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.bt_important_part) {
            mPartLauncher.launch(new Intent(getContext(), ScanActivity.class));
        } else if (id == R.id.bt_important_area) {
            mAreaLauncher.launch(new Intent(getContext(), ScanActivity.class));
        }
    }
}