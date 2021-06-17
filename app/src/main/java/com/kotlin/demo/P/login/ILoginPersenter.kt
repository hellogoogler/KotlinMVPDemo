package com.kotlin.demo.P.login

import android.content.Context
import com.kotlin.demo.P.base.IBasePersenter
import com.kotlin.demo.entity.LoginResponse

//登录presenter层接口
interface iLoginPersenter: IBasePersenter {
    //该方法做登录UI界面的登录逻辑
    fun loginAction(context: Context, name: String, pwd: String)

    //该接口做为登录Model中逻辑处理后的相关回调
    interface loginPresenterListener {
        fun loginSuccess(loginResponse: LoginResponse)
        fun loginFail(errorMsg: String)
    }
}