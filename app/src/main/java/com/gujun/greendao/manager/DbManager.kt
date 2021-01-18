package com.gujun.greendao.manager

import android.content.Context
import com.gujun.greendao.gen.DaoMaster
import com.gujun.greendao.gen.DaoSession

object DbManager {

    //注意密码的保密性
    private const val db_password = "123456"

    private lateinit var mDaoSession: DaoSession

    /**
     * 在App启动时进行初始化
     */
    fun initDb(context: Context) {
        val devOpenHelper = DaoMaster.DevOpenHelper(context, "test.db", null)
        //使用加密可写的数据库
        val mDaoMaster = DaoMaster(devOpenHelper.getEncryptedWritableDb(db_password))
        mDaoSession = mDaoMaster.newSession()
    }

    fun getDaoSession(): DaoSession {
        return mDaoSession
    }

}