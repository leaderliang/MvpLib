package com.android.imageloader.config;

import android.widget.ImageView;

public class ImageConfig {
    protected String url;

    protected int drawableId;
    protected ImageView imageView;
    protected int placeholder;
    protected int errorPic;


    public String getUrl() {
        return url;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public int getPlaceholder() {
        return placeholder;
    }

    public int getErrorPic() {
        return errorPic;
    }
}
