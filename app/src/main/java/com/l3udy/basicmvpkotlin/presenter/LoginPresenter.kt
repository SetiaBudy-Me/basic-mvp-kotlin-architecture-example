package com.l3udy.basicmvpkotlin.presenter

import com.l3udy.basicmvpkotlin.R
import com.l3udy.basicmvpkotlin.model.ApiResult
import com.l3udy.basicmvpkotlin.model.User

class LoginPresenter(private val view: View) {

    fun login(email: String, password: String) {
        if (email.isEmpty() || password.isEmpty()) {
            // Create a new data model
            val apiResult = ApiResult(error = R.string.login_email_password_empty)
            view.loginResult(apiResult)
        } else {
            // Create a new data model
            val apiResult = ApiResult(success = true)
            view.loginResult(apiResult)
        }
    }

    interface View {
        // Interface to connect the view with the presenter
        fun loginResult(apiResult: ApiResult)
    }
}