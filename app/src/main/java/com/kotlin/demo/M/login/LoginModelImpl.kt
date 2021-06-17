package com.kotlin.demo.M.login

import android.content.Context
import android.util.Log
import com.kotlin.demo.P.login.iLoginPersenter
import com.kotlin.demo.entity.LoginResponse

//model实现里面做login接口请求的逻辑实现
class LoginModelImpl : iLoginModel {
    override fun cancelRequest() {
        Log.i("cancelRequest", "cancelRequest")
    }

    override fun login(
        context: Context,
        name: String,
        pwd: String,
        loginPresenterListener: iLoginPersenter.loginPresenterListener
    ) {
//        请求成功
        loginPresenterListener.loginSuccess(
            LoginResponse(
                23, "123",
                LoginResponse.LoginBean("jj", 12, 'M')
            )
        )
    }

}