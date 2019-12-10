package com.android.mvplib;

import android.os.Bundle;

import com.android.core.constant.AppConstant;
import com.android.core.mvp.activity.BaseActivity;
import com.android.core.utils.CollectionUtils;
import com.android.core.view.toast.ToastUtils;
import com.android.mvplib.adapter.MyImgListAdapter;
import com.android.mvplib.bean.ImgListBean;
import com.android.mvplib.contract.ImgListContract;
import com.android.mvplib.presenter.ImgListPresenter;
import com.chad.library.adapter.base.BaseQuickAdapter;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @author devliang
 */
public class MainActivity extends BaseActivity<ImgListContract.View, ImgListContract.Presenter> implements ImgListContract.View {

    @BindView(R.id.swipe_refresh_layout)
    SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    private ArrayList<ImgListBean.ImgInfo> mImgList;

    private MyImgListAdapter mMyImgListAdapter;

    private int currentPage = 1;

    private int pageSize = 10;

    private List<ImgListBean.ImgInfo> mImgListData;

    private boolean mIsRefresh;

    @Override
    public ImgListContract.Presenter createMvpPresenter() {
        return new ImgListPresenter();
    }

    @Override
    protected boolean isUseToolBar() {
        return true;
    }

    @Override
    protected void setViewListener() {

    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        requestPermission();

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!isHasPermission()) {
            showMessageToast("请开启相关权限");
        }
    }

    @Override
    protected void initData(@Nullable Bundle savedInstanceState) {
        super.initData(savedInstanceState);
        mIsRefresh = true;
        mImgList = new ArrayList<>();
        mMyImgListAdapter = new MyImgListAdapter(mImgList);
        mMyImgListAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                mIsRefresh = false;
                currentPage++;
                requestData();
            }
        }, mRecyclerView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3, RecyclerView.VERTICAL, false));

        mRecyclerView.setAdapter(mMyImgListAdapter);

        requestData();
    }

    private void requestData() {
        getMvpPresenter().requestImgList("北京", currentPage, 50);
    }

    @Override
    protected void onViewClick(View v) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.img_list_layout;
    }

    @Override
    protected SwipeRefreshLayout getSwipeRefreshLayout() {
        return mSwipeRefreshLayout;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onQueryImgListSuccess(List<ImgListBean.ImgInfo> bean) {
        setRefreshing(false);
        if(!CollectionUtils.isEmpty(bean)){
            mImgListData = bean;
            if(mIsRefresh && CollectionUtils.isEmpty(mImgListData)){
                mImgListData.clear();
                mMyImgListAdapter.setNewData(mImgListData);
            }else{
//                mImgList.addAll(mImgListData);
                mMyImgListAdapter.addData(mImgListData);
                mMyImgListAdapter.loadMoreComplete();
//                mMyImgListAdapter.notifyDataSetChanged();
            }
//            ToastUtils.show(mImgListData.size());

        }
    }

    @Override
    protected void onRefresh() {
        super.onRefresh();
        currentPage = 1;
        mIsRefresh = true;
        requestData();
    }
}
