package com.gujun.greendao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gujun.greendao.utils.DataDao
import com.gujun.greendao.utils.DataTwoDao
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateUi()

        val data = DataBean()
        data.setId_(1)
        data.setDesc("data")

        val dataTwo = DataTwoBean()
        dataTwo.setId_(1)
        dataTwo.setDesc("data two")

        add.setOnClickListener {
            DataDao.getInstance().add(data)
            DataTwoDao.getInstance().add(dataTwo)
        }
    }

    private fun updateUi() {
        val list = DataDao.getInstance().queryAll()
        val stringBuilder = StringBuilder()
        list.forEach { stringBuilder.append(it.desc).append(",,") }
        val list2 = DataTwoDao.getInstance().queryAll()
        list2.forEach { stringBuilder.append(it.desc).append(",,") }
        content.text = stringBuilder
    }
}