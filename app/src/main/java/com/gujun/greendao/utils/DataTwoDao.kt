package com.gujun.greendao.utils

import com.gujun.greendao.DataTwoBean
import com.gujun.greendao.manager.DbManager

class DataTwoDao private constructor() {

    companion object {

        private var instance: DataTwoDao? = null

        fun getInstance(): DataTwoDao {
            if (instance == null) {
                instance = DataTwoDao()
            }
            return instance!!
        }
    }

    fun add(data: DataTwoBean): Boolean {
        return try {
            DbManager.getDaoSession().dataTwoBeanDao.insertOrReplace(data)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun queryAll(): List<DataTwoBean> {
        return DbManager.getDaoSession().dataTwoBeanDao.loadAll()
    }

    fun deleteById(id: Long): Boolean {
        return try {
            DbManager.getDaoSession().dataTwoBeanDao.deleteByKey(id)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun clear(): Boolean {
        return try {
            DbManager.getDaoSession().dataTwoBeanDao.deleteAll()
            true
        } catch (e: Exception) {
            false
        }
    }

}