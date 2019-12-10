package com.android.mvplib.adapter;


import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.android.core.constant.AppConstant;
import com.android.imageloader.GlideImageLoader;
import com.android.mvplib.R;
import com.android.mvplib.adapter.callback.ImageCallback;
import com.android.mvplib.adapter.holder.BaseViewHolder;
import com.android.mvplib.bean.ImgListBean;
import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.List;


/**
 * TODO
 *
 * @author dev.liang <a href="mailto:dev.liang@outlook.com">Contact me.</a>
 * @version 1.0
 * @since 2019/05/03 00:57
 */
public class MyImgListAdapter extends BaseQuickAdapter<ImgListBean.ImgInfo, BaseViewHolder> {


    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public MyImgListAdapter(@Nullable List<ImgListBean.ImgInfo> data) {
        super(R.layout.view_img_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ImgListBean.ImgInfo item) {
        if (item != null) {
            helper.setImage(R.id.img_item, new ImageCallback() {
                @Override
                public void callback(ImageView imageView) {
                    GlideImageLoader.loadImage(item.getThumb(), imageView);
                }
            });
        }

    }


}
