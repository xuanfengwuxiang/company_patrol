package com.mingshu.vm.patrol.device;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;

import androidx.core.content.FileProvider;

import com.xuanfeng.xflibrary.utils.AppUtil;
import com.xuanfeng.xflibrary.utils.ImageUtil;

import java.io.File;

/**
 * 拍照界面工具
 */
public class DeviceReportActivityUtil {
    public static final int REQUEST_CODE_TAKE_PHOTO = 0;//拍照片
    public static final int REQUEST_CODE_PERMISSION = 1;//请求权限
    public static final String TEMP_TAKE_PHOTO = "take.jpg";//拍照临时缓存名字
    public static final String TEMP_UPLOAD = "upload.jpg";//界面截图缓存名字


    /**
     * 拍照
     *
     * @param activity activity
     */
    public static void takePhoto(Activity activity) {
        Uri out = Uri.fromFile(new File(getTakePhotoPath(activity)));
        if (Build.VERSION.SDK_INT >= 24) {
            out = FileProvider.getUriForFile(activity, activity.getPackageName() + ".fileprovider", new File(getTakePhotoPath(activity)));
        }
        ImageUtil.takePhoto(activity, out, REQUEST_CODE_TAKE_PHOTO);
    }

    //拍照 缓存路径
    public static String getTakePhotoPath(Activity activity) {
        return AppUtil.getAppTempPath(activity) + File.separator + TEMP_TAKE_PHOTO;
    }

    /**
     * 上传截图 缓存路径
     * @param activity activity
     * @return 路径
     */
    public static String getUploadPhotoPath(Activity activity) {
        return AppUtil.getAppTempPath(activity);
    }
}
