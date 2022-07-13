package com.l3udy.basicmvpkotlin.presenter

import com.l3udy.basicmvpkotlin.model.Data

interface MainView {
    // Interface to connect the view with the presenter
    fun resultPresenter(data: Data)
}