package com.gujun.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * author : gujun
 * date   : 2021/1/18 16:33
 * desc   :
 */
@Entity
public class DataTwoBean {
    @Id
    Long id_;

    String desc;

    @Generated(hash = 1503429611)
    public DataTwoBean(Long id_, String desc) {
        this.id_ = id_;
        this.desc = desc;
    }

    @Generated(hash = 494862157)
    public DataTwoBean() {
    }

    public Long getId_() {
        return this.id_;
    }

    public void setId_(Long id_) {
        this.id_ = id_;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
