package com.kotlin.demo.entity

data class LoginResponse(val code: Int, val msg: String, val loginBean: LoginBean) {
    class LoginBean(val name: String, val age: Int, val sex: Char)
}