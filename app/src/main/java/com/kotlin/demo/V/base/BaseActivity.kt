package com.kotlin.demo.V.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.demo.P.base.IBasePersenter

abstract class BaseActivity<P> : AppCompatActivity() where P : IBasePersenter { //定义限定泛型P
    lateinit var presenter: P
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
    }

    abstract fun createPresenter(): P

}