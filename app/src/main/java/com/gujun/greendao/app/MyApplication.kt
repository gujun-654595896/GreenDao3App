package com.gujun.greendao.app

import android.app.Application
import com.gujun.greendao.manager.DbManager

/**
 *    author : gujun
 *    date   : 2021/1/18 14:30
 *    desc   :
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DbManager.initDb(applicationContext)
    }
}