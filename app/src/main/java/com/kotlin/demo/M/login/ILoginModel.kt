package com.kotlin.demo.M.login

import android.content.Context
import com.kotlin.demo.P.login.iLoginPersenter

//登录model层接口
interface iLoginModel {
    fun cancelRequest() //在model层做一些取消网络接口请求的具体操作

    //在model层做具体的登录操作，并将登录结果做接口回调，传给persenter层
    fun login(
        context: Context,
        name: String,
        pwd: String,
        loginPresenterListener: iLoginPersenter.loginPresenterListener
    )
}