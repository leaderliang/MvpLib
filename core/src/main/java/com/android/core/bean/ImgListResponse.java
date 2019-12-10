package com.android.core.bean;

import android.os.Parcel;
import android.os.Parcelable;

import com.android.core.constant.AppConstant;
import com.android.core.net.NetworkError;
import com.android.core.net.ServerException;

/**
 * {@link ImgListResponse}
 * 三位数字，⽤用于对响应结果做出类型化描述(如「获取成功」「内容未找到」)。
 * 1xx:临时性消息。如:100 (继续发送)、101(正在切换协议)
 * 2xx:成功。最典型的是 200(OK)、201(创建成功)。
 * 3xx:重定向。如 301(永久移动)、302(暂时移动)、304(内容未改变)。 4xx:客户端错误。如 400(客户端请求错误)、401(认证失败)、403(被禁⽌止)、404(找 不不到内容)。
 * 5xx:服务器器错误。如 500(服务器器内部错误)。
 *
 * @author devliang
 * @date 2019-07-11 14:14:06
 */
public class ImgListResponse<T> implements Parcelable {

    private T list;

    public ImgListResponse() {
    }

    protected ImgListResponse(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ImgListResponse> CREATOR = new Creator<ImgListResponse>() {
        @Override
        public ImgListResponse createFromParcel(Parcel in) {
            return new ImgListResponse(in);
        }

        @Override
        public ImgListResponse[] newArray(int size) {
            return new ImgListResponse[size];
        }
    };

    public T getList() {
        return list;
    }

    public void setList(T list) {
        this.list = list;
    }

    public boolean resultOk() {
        // 接口成功
        if (list != null) {
            return true;
        } else {
            NetworkError.error(new ServerException(500, "服务器器错误"));
            return false;
        }
    }
}
