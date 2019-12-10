package com.android.mvplib.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * TODO
 *
 * @author dev.liang <a href="mailto:dev.liang@outlook.com">Contact me.</a>
 * @version 1.0
 * @since 2019/12/10 11:09
 */
public class ImgListBean implements Parcelable {


    /**
     * total : 1500
     * end : false
     * sid : 9e433e557f6a2333cd9c8fe48c47076d
     * ran : 0
     * ras : 0
     * kn : 0
     * cn : 0
     * gn : 0
     * ps : 1
     * pc : 1
     * adstar : 0
     * lastindex : 3
     * ceg : 177404176
     * list : [{"id":"f0ce944226f09c84343fc575b4d6c6e5","qqface_down_url":false,"downurl":false,"downurl_true":"https://dl.image.so.com/d?imgurl=http%3A%2F%2Fpic19.nipic.com%2F20120309%2F2457387_130124432000_2.jpg&purl=http%3A%2F%2Fwww.nipic.com%2Fshow%2F1%2F48%2F5811631k7d92ca4a.html&key=23320c76e3","grpmd5":false,"type":0,"src":"1","color":1024,"index":2,"title":"<em>北京城市风光<\/em>图片","litetitle":"","width":"1024","height":"683","imgsize":"282KB","imgtype":"JPEG","key":"23320c76e3","dspurl":"www.nipic.com","link":"http://www.nipic.com/show/1/48/5811631k7d92ca4a.html","source":2,"img":"http://pic19.nipic.com/20120309/2457387_130124432000_2.jpg","thumb_bak":"https://p0.ssl.qhimgs1.com/t01924088a0cf8e42ba.jpg","thumb":"https://p0.ssl.qhimgs1.com/t01924088a0cf8e42ba.jpg","_thumb_bak":"https://p0.ssl.qhimgs1.com/sdr/_240_/t01924088a0cf8e42ba.jpg","_thumb":"https://p0.ssl.qhimgs1.com/sdr/_240_/t01924088a0cf8e42ba.jpg","imgkey":"t01924088a0cf8e42ba.jpg","thumbWidth":360,"dsptime":"","thumbHeight":240,"grpcnt":"0","fixedSize":false,"fnum":"0","comm_purl":""}]
     * boxresult : null
     * wordguess : null
     * prevsn : -1
     */

    private int total;
    private boolean end;
    private String sid;
    private int ran;
    private int ras;
    private int kn;
    private int cn;
    private int gn;
    private int ps;
    private int pc;
    private int adstar;
    private int lastindex;
    private int ceg;
    private Object boxresult;
    private Object wordguess;
    private int prevsn;
    private List<ImgInfo> list;

    public ImgListBean() {
    }

    protected ImgListBean(Parcel in) {
        total = in.readInt();
        end = in.readByte() != 0;
        sid = in.readString();
        ran = in.readInt();
        ras = in.readInt();
        kn = in.readInt();
        cn = in.readInt();
        gn = in.readInt();
        ps = in.readInt();
        pc = in.readInt();
        adstar = in.readInt();
        lastindex = in.readInt();
        ceg = in.readInt();
        prevsn = in.readInt();
        list = in.createTypedArrayList(ImgInfo.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(total);
        dest.writeByte((byte) (end ? 1 : 0));
        dest.writeString(sid);
        dest.writeInt(ran);
        dest.writeInt(ras);
        dest.writeInt(kn);
        dest.writeInt(cn);
        dest.writeInt(gn);
        dest.writeInt(ps);
        dest.writeInt(pc);
        dest.writeInt(adstar);
        dest.writeInt(lastindex);
        dest.writeInt(ceg);
        dest.writeInt(prevsn);
        dest.writeTypedList(list);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ImgListBean> CREATOR = new Creator<ImgListBean>() {
        @Override
        public ImgListBean createFromParcel(Parcel in) {
            return new ImgListBean(in);
        }

        @Override
        public ImgListBean[] newArray(int size) {
            return new ImgListBean[size];
        }
    };

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getRan() {
        return ran;
    }

    public void setRan(int ran) {
        this.ran = ran;
    }

    public int getRas() {
        return ras;
    }

    public void setRas(int ras) {
        this.ras = ras;
    }

    public int getKn() {
        return kn;
    }

    public void setKn(int kn) {
        this.kn = kn;
    }

    public int getCn() {
        return cn;
    }

    public void setCn(int cn) {
        this.cn = cn;
    }

    public int getGn() {
        return gn;
    }

    public void setGn(int gn) {
        this.gn = gn;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getAdstar() {
        return adstar;
    }

    public void setAdstar(int adstar) {
        this.adstar = adstar;
    }

    public int getLastindex() {
        return lastindex;
    }

    public void setLastindex(int lastindex) {
        this.lastindex = lastindex;
    }

    public int getCeg() {
        return ceg;
    }

    public void setCeg(int ceg) {
        this.ceg = ceg;
    }

    public Object getBoxresult() {
        return boxresult;
    }

    public void setBoxresult(Object boxresult) {
        this.boxresult = boxresult;
    }

    public Object getWordguess() {
        return wordguess;
    }

    public void setWordguess(Object wordguess) {
        this.wordguess = wordguess;
    }

    public int getPrevsn() {
        return prevsn;
    }

    public void setPrevsn(int prevsn) {
        this.prevsn = prevsn;
    }

    public List<ImgInfo> getList() {
        return list;
    }

    public void setList(List<ImgInfo> list) {
        this.list = list;
    }

    public static class ImgInfo implements Parcelable{
        /**
         * id : f0ce944226f09c84343fc575b4d6c6e5
         * qqface_down_url : false
         * downurl : false
         * downurl_true : https://dl.image.so.com/d?imgurl=http%3A%2F%2Fpic19.nipic.com%2F20120309%2F2457387_130124432000_2.jpg&purl=http%3A%2F%2Fwww.nipic.com%2Fshow%2F1%2F48%2F5811631k7d92ca4a.html&key=23320c76e3
         * grpmd5 : false
         * type : 0
         * src : 1
         * color : 1024
         * index : 2
         * title : <em>北京城市风光</em>图片
         * litetitle :
         * width : 1024
         * height : 683
         * imgsize : 282KB
         * imgtype : JPEG
         * key : 23320c76e3
         * dspurl : www.nipic.com
         * link : http://www.nipic.com/show/1/48/5811631k7d92ca4a.html
         * source : 2
         * img : http://pic19.nipic.com/20120309/2457387_130124432000_2.jpg
         * thumb_bak : https://p0.ssl.qhimgs1.com/t01924088a0cf8e42ba.jpg
         * thumb : https://p0.ssl.qhimgs1.com/t01924088a0cf8e42ba.jpg
         * _thumb_bak : https://p0.ssl.qhimgs1.com/sdr/_240_/t01924088a0cf8e42ba.jpg
         * _thumb : https://p0.ssl.qhimgs1.com/sdr/_240_/t01924088a0cf8e42ba.jpg
         * imgkey : t01924088a0cf8e42ba.jpg
         * thumbWidth : 360
         * dsptime :
         * thumbHeight : 240
         * grpcnt : 0
         * fixedSize : false
         * fnum : 0
         * comm_purl :
         */

        private String id;
        private boolean qqface_down_url;
        private boolean downurl;
        private String downurl_true;
        private boolean grpmd5;
        private int type;
        private String src;
        private int color;
        private int index;
        private String title;
        private String litetitle;
        private String width;
        private String height;
        private String imgsize;
        private String imgtype;
        private String key;
        private String dspurl;
        private String link;
        private int source;
        private String img;
        private String thumb_bak;
        private String thumb;
        private String _thumb_bak;
        private String _thumb;
        private String imgkey;
        private int thumbWidth;
        private String dsptime;
        private int thumbHeight;
        private String grpcnt;
        private boolean fixedSize;
        private String fnum;
        private String comm_purl;

        public ImgInfo() {
        }

        protected ImgInfo(Parcel in) {
            id = in.readString();
            qqface_down_url = in.readByte() != 0;
            downurl = in.readByte() != 0;
            downurl_true = in.readString();
            grpmd5 = in.readByte() != 0;
            type = in.readInt();
            src = in.readString();
            color = in.readInt();
            index = in.readInt();
            title = in.readString();
            litetitle = in.readString();
            width = in.readString();
            height = in.readString();
            imgsize = in.readString();
            imgtype = in.readString();
            key = in.readString();
            dspurl = in.readString();
            link = in.readString();
            source = in.readInt();
            img = in.readString();
            thumb_bak = in.readString();
            thumb = in.readString();
            _thumb_bak = in.readString();
            _thumb = in.readString();
            imgkey = in.readString();
            thumbWidth = in.readInt();
            dsptime = in.readString();
            thumbHeight = in.readInt();
            grpcnt = in.readString();
            fixedSize = in.readByte() != 0;
            fnum = in.readString();
            comm_purl = in.readString();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(id);
            dest.writeByte((byte) (qqface_down_url ? 1 : 0));
            dest.writeByte((byte) (downurl ? 1 : 0));
            dest.writeString(downurl_true);
            dest.writeByte((byte) (grpmd5 ? 1 : 0));
            dest.writeInt(type);
            dest.writeString(src);
            dest.writeInt(color);
            dest.writeInt(index);
            dest.writeString(title);
            dest.writeString(litetitle);
            dest.writeString(width);
            dest.writeString(height);
            dest.writeString(imgsize);
            dest.writeString(imgtype);
            dest.writeString(key);
            dest.writeString(dspurl);
            dest.writeString(link);
            dest.writeInt(source);
            dest.writeString(img);
            dest.writeString(thumb_bak);
            dest.writeString(thumb);
            dest.writeString(_thumb_bak);
            dest.writeString(_thumb);
            dest.writeString(imgkey);
            dest.writeInt(thumbWidth);
            dest.writeString(dsptime);
            dest.writeInt(thumbHeight);
            dest.writeString(grpcnt);
            dest.writeByte((byte) (fixedSize ? 1 : 0));
            dest.writeString(fnum);
            dest.writeString(comm_purl);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<ImgInfo> CREATOR = new Creator<ImgInfo>() {
            @Override
            public ImgInfo createFromParcel(Parcel in) {
                return new ImgInfo(in);
            }

            @Override
            public ImgInfo[] newArray(int size) {
                return new ImgInfo[size];
            }
        };

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public boolean isQqface_down_url() {
            return qqface_down_url;
        }

        public void setQqface_down_url(boolean qqface_down_url) {
            this.qqface_down_url = qqface_down_url;
        }

        public boolean isDownurl() {
            return downurl;
        }

        public void setDownurl(boolean downurl) {
            this.downurl = downurl;
        }

        public String getDownurl_true() {
            return downurl_true;
        }

        public void setDownurl_true(String downurl_true) {
            this.downurl_true = downurl_true;
        }

        public boolean isGrpmd5() {
            return grpmd5;
        }

        public void setGrpmd5(boolean grpmd5) {
            this.grpmd5 = grpmd5;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLitetitle() {
            return litetitle;
        }

        public void setLitetitle(String litetitle) {
            this.litetitle = litetitle;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getImgsize() {
            return imgsize;
        }

        public void setImgsize(String imgsize) {
            this.imgsize = imgsize;
        }

        public String getImgtype() {
            return imgtype;
        }

        public void setImgtype(String imgtype) {
            this.imgtype = imgtype;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getDspurl() {
            return dspurl;
        }

        public void setDspurl(String dspurl) {
            this.dspurl = dspurl;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public int getSource() {
            return source;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getThumb_bak() {
            return thumb_bak;
        }

        public void setThumb_bak(String thumb_bak) {
            this.thumb_bak = thumb_bak;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String get_thumb_bak() {
            return _thumb_bak;
        }

        public void set_thumb_bak(String _thumb_bak) {
            this._thumb_bak = _thumb_bak;
        }

        public String get_thumb() {
            return _thumb;
        }

        public void set_thumb(String _thumb) {
            this._thumb = _thumb;
        }

        public String getImgkey() {
            return imgkey;
        }

        public void setImgkey(String imgkey) {
            this.imgkey = imgkey;
        }

        public int getThumbWidth() {
            return thumbWidth;
        }

        public void setThumbWidth(int thumbWidth) {
            this.thumbWidth = thumbWidth;
        }

        public String getDsptime() {
            return dsptime;
        }

        public void setDsptime(String dsptime) {
            this.dsptime = dsptime;
        }

        public int getThumbHeight() {
            return thumbHeight;
        }

        public void setThumbHeight(int thumbHeight) {
            this.thumbHeight = thumbHeight;
        }

        public String getGrpcnt() {
            return grpcnt;
        }

        public void setGrpcnt(String grpcnt) {
            this.grpcnt = grpcnt;
        }

        public boolean isFixedSize() {
            return fixedSize;
        }

        public void setFixedSize(boolean fixedSize) {
            this.fixedSize = fixedSize;
        }

        public String getFnum() {
            return fnum;
        }

        public void setFnum(String fnum) {
            this.fnum = fnum;
        }

        public String getComm_purl() {
            return comm_purl;
        }

        public void setComm_purl(String comm_purl) {
            this.comm_purl = comm_purl;
        }
    }
}
