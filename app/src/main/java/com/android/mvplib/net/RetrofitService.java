package com.android.mvplib.net;


import com.android.core.bean.BaseResponse;
import com.android.core.bean.ImgListResponse;
import com.android.core.bean.LoginBean;
import com.android.core.bean.Repo;
import com.android.core.net.RetrofitApi;
import com.android.mvplib.bean.ImgListBean;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * TODO ApiService
 *
 * @author dev.liang <a href="mailto:dev.liang@outlook.com">Contact me.</a>
 * @version 1.0
 * @since 2019/04/23 15:29
 */
public interface RetrofitService {

    /**
     * 登陆
     *
     * @param username 账号
     * @param password 密码
     * @return
     */
    @FormUrlEncoded
    @POST("user/login")
    Flowable<BaseResponse<LoginBean>> login(@Field("username") String username,
                                            @Field("password") String password);


    @GET("/users/leaderliang/repos")
    Call<List<Repo>> getUserRepos_();


    /**
     * @return
     */
    @GET("/users/leaderliang/repos")
    Observable<BaseResponse<List<Repo>>> getUserRepos();


    /**
     * q=北京&sn=2&pn=1
     * @param searchKey
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GET(RetrofitApi.GET_IMG_LIST)
    Observable<ImgListResponse<List<ImgListBean.ImgInfo>>> getImgList(@Query("q") String searchKey, @Query("sn") int pageNum, @Query("pn") int pageSize);

}
