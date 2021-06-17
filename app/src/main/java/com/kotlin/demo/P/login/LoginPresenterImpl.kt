package com.kotlin.demo.P.login

import android.content.Context
import com.kotlin.demo.M.login.LoginModelImpl
import com.kotlin.demo.V.login.iLoginView
import com.kotlin.demo.entity.LoginResponse

class LoginPresenterImpl(var loginInterface: iLoginView?) : iLoginPersenter,
    iLoginPersenter.loginPresenterListener {

    // 需要 M 去请求服务器 初始化M
    private val loginModel: LoginModelImpl = LoginModelImpl()
    override fun loginAction(context: Context, name: String, pwd: String) {
        //一些列的name和pwd的操作逻辑 比如：校验逻辑 比对逻辑
        loginModel.login(context, name, pwd, this) //调用M层的方法去做实际的登录请求

    }

    override fun unAttachView() {
        loginInterface == null //置空处理
        loginModel.cancelRequest()
    }

    override fun loginSuccess(loginResponse: LoginResponse) {
        //M 层的请求结果 回调结果
        loginInterface?.loginSuccess(loginResponse)
    }

    override fun loginFail(errorMsg: String) {
        loginInterface?.loginFailture(errorMsg)
    }
}