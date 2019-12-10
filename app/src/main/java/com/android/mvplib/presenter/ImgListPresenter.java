package com.android.mvplib.presenter;

import com.android.core.bean.ImgListResponse;
import com.android.core.mvp.mvp.BaseMvpPresenter;
import com.android.core.net.RxScheduler;
import com.android.mvplib.bean.ImgListBean;
import com.android.mvplib.contract.ImgListContract;
import com.android.mvplib.net.BaseImgListObserver;
import com.android.mvplib.net.BaseModel;

import java.util.List;


/**
 * ImgListPresenter
 *
 * @author devliang
 */
public class ImgListPresenter extends BaseMvpPresenter<ImgListContract.View> implements ImgListContract.Presenter {

    private BaseModel mBaseModel;

    public ImgListPresenter() {
        this.mBaseModel = new BaseModel();
    }


    @Override
    public void requestImgList(String searchName, int pageNum, int pageSize) {
        if (!isViewAttached()) {
            return;
        }
        mMvpView.showLoading();

        mBaseModel.getRetrofitService().getImgList(searchName, pageNum, pageSize)
                .compose(RxScheduler.Obs_io_main())
                .as(mMvpView.bindAutoDispose())
                .subscribe(new BaseImgListObserver<List<ImgListBean.ImgInfo>>() {

                    @Override
                    protected void onSuccess(ImgListResponse<List<ImgListBean.ImgInfo>> response) {
                        if (isViewAttached()) {
                            mMvpView.dismissLoading();
                            if (response == null) {
                                mMvpView.onThrowable(new NullPointerException());
                            } else {
                                mMvpView.onQueryImgListSuccess(response.getList());
                            }

                        }
                    }

                    @Override
                    protected void onFailure(ImgListResponse<List<ImgListBean.ImgInfo>> errorResponse) {
                        mMvpView.dismissLoading();
                        mMvpView.onError("查询失败");
                    }

                    @Override
                    protected void onNetError(Throwable throwable) {
//                        super.onNetError(throwable);
                        mMvpView.onThrowable(throwable);
                    }
                });
    }
}
