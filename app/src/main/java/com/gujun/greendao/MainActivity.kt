package com.gujun.greendao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gujun.greendao.utils.DataDao
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateUi()

        val data = DataBean()
        data.setId_(1)
        data.setDesc("teset1")
        add.setOnClickListener {
            DataDao.getInstance().add(data)
            updateUi()
        }

        delete.setOnClickListener {
            DataDao.getInstance().deleteById(1)
            updateUi()
        }

        val dataNew = DataBean()
        dataNew.setId_(1)
        dataNew.setDesc("teset----------")
        update.setOnClickListener {
            DataDao.getInstance().add(dataNew)
            updateUi()
        }
    }

    private fun updateUi() {
        val list = DataDao.getInstance().queryAll()
        val stringBuilder = StringBuilder()
        list.forEach { stringBuilder.append(it.desc).append(",,") }
        content.text = stringBuilder
    }
}