package com.gujun.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * author : gujun
 * date   : 2021/1/18 14:03
 * desc   :
 */
@Entity
public class DataBean {

    @Id
    Long id_;

    String desc;

    @Generated(hash = 789425396)
    public DataBean(Long id_, String desc) {
        this.id_ = id_;
        this.desc = desc;
    }

    @Generated(hash = 908697775)
    public DataBean() {
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
