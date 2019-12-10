package com.android.mvplib.adapter.holder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.IdRes;

import com.android.mvplib.adapter.callback.ImageCallback;


/**
 * TODO
 *
 * @author dev.liang <a href="mailto:dev.liang@outlook.com">Contact me.</a>
 * @version 1.0
 * @since 2019/05/03 01:00
 */
public class BaseViewHolder extends com.chad.library.adapter.base.BaseViewHolder {
    public BaseViewHolder(View view) {
        super(view);
    }

    public BaseViewHolder setImage(@IdRes int imageId, ImageCallback callback) {
        ImageView imageView = getView(imageId);
        if (imageView != null && callback != null) {
            callback.callback(imageView);
        }
        return this;
    }
}
