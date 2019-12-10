package com.android.mvplib.contract;


import com.android.core.mvp.mvp.MvpPresenter;
import com.android.core.mvp.mvp.MvpView;


/**
 * TODO   通用的 Contract，没有任何接口时调用
 *
 * @author dev.liang <a href="mailto:dev.liang@outlook.com">Contact me.</a>
 * @version 1.0
 * @since 2019/04/27 12:04
 */
public interface CommonContract {


    interface View extends MvpView {

    }

    interface Presenter extends MvpPresenter<View> {

    }
}
