package com.android.mvplib.net;



import com.android.core.bean.BaseResponse;
import com.android.core.bean.LoginBean;
import com.android.core.bean.Repo;
import com.android.core.mvp.mvp.BaseMvpModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;

/**
 * BaseModel
 * @author devliang
 */
public class BaseModel implements BaseMvpModel {
    private final String TAG = BaseModel.class.getSimpleName();

    private RetrofitService mRetrofitService;

    public BaseModel() {
        this.mRetrofitService = RetrofitClient.getInstance().getApiService();
    }

    public Flowable<BaseResponse<LoginBean>> login(String username, String password) {
        return mRetrofitService.login(username, password);
    }


    public Observable<BaseResponse<List<Repo>>> getUserRepo() {
        return RetrofitClient.getInstance().getApiService().getUserRepos();
    }

    // ---- 更多相应接口 -----

    public RetrofitService getRetrofitService(){
        return mRetrofitService;
    }

}
