package com.gujun.greendao.utils

import com.gujun.greendao.DataBean
import com.gujun.greendao.manager.DbManager

class DataDao private constructor() {

    companion object {

        private var instance: DataDao? = null

        fun getInstance(): DataDao {
            if (instance == null) {
                instance = DataDao()
            }
            return instance!!
        }
    }

    fun add(data: DataBean): Boolean {
        return try {
            DbManager.getDaoSession().dataBeanDao.insertOrReplace(data)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun queryAll(): List<DataBean> {
        return DbManager.getDaoSession().dataBeanDao.loadAll()
    }

    fun deleteById(id: Long): Boolean {
        return try {
            DbManager.getDaoSession().dataBeanDao.deleteByKey(id)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun clear(): Boolean {
        return try {
            DbManager.getDaoSession().dataBeanDao.deleteAll()
            true
        } catch (e: Exception) {
            false
        }
    }

}