package com.kotlin.demo.V.login

import com.kotlin.demo.entity.LoginResponse

//登录view层接口
interface iLoginView {
    fun loginSuccess(loginResponse: LoginResponse)
    fun loginFailture(errorMsg: String)
}