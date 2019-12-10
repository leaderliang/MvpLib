package com.android.mvplib.contract;


import com.android.core.mvp.mvp.MvpPresenter;
import com.android.core.mvp.mvp.MvpView;
import com.android.mvplib.bean.ImgListBean;

import java.util.List;


/**
 * @author devliang
 */
public interface ImgListContract {

    interface View extends MvpView {
        void onQueryImgListSuccess(List<ImgListBean.ImgInfo> bean);
    }

    interface Presenter extends MvpPresenter<View> {

        /**
         * @param searchName
         * @param pageNum
         * @param pageSize
         */
        void requestImgList(String searchName, int pageNum,int pageSize);

    }
}
