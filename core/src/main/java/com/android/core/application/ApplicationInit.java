package com.android.core.application;

import android.app.Application;
import android.content.Context;

import com.android.core.BuildConfig;
import com.android.core.utils.Trace;
import com.android.core.view.toast.ToastUtils;
import com.android.core.view.toast.style.ToastAliPayStyle;
import com.android.imageloader.GlideImageLoader;


/**
 * TODO
 *
 * @author dev.liang <a href="mailto:dev.liang@outlook.com">Contact me.</a>
 * @version 1.0
 * @since 2019/04/23 16:38
 */
public class ApplicationInit {

    private static final String TAG = "ApplicationInit";
    private Context mContext;


    public void initApp(Application context) {
        if (context == null) {
            return;
        }
        mContext = context;


        debug(BuildConfig.DEBUG);

        /*初始化吐司工具类*/
        ToastUtils.init(context, new ToastAliPayStyle());

        /*初始化一些服务*/
//        GlideImageLoader.init(context.getApplicationContext());


    }


    private void debug(boolean debug) {
        Trace.setLevel(debug ? Trace.LEVEL_VERBOSE : Trace.LEVEL_SILENCE);
    }


}
