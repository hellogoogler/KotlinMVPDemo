package com.kotlin.demo.V.login

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.kotlin.demo.P.login.LoginPresenterImpl
import com.kotlin.demo.V.base.BaseActivity
import com.kotlin.demo.R
import com.kotlin.demo.P.login.iLoginPersenter
import com.kotlin.demo.entity.LoginResponse

class LoginActivity : BaseActivity<iLoginPersenter>(), iLoginView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)
        val userLoginBtn = findViewById<Button>(R.id.user_login_bt);
        userLoginBtn.setOnClickListener(onClickListener)
    }

    val onClickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.user_login_bt -> {
                Toast.makeText(this, "开始登录", Toast.LENGTH_LONG).show()
                Handler().postDelayed(Runnable {
                    presenter?.loginAction(this, "derry", "123456")
                }, 2000)
            }
            else -> {
                Toast.makeText(this, "else", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun createPresenter(): iLoginPersenter {
        return LoginPresenterImpl(this)
    }

    override fun loginSuccess(loginResponse: LoginResponse) {
        val msg = loginResponse.msg
        Toast.makeText(this, "登录完成：msg " + msg, Toast.LENGTH_LONG).show()
    }

    override fun loginFailture(errorMsg: String) {
        Toast.makeText(this, "登录失败：errorMsg " + errorMsg, Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        presenter.unAttachView()  //在onPause声明周期里面做UNattachView的模拟操作
    }
}