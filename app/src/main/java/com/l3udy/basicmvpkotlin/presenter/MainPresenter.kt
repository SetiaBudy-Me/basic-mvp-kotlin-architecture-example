package com.l3udy.basicmvpkotlin.presenter

import com.l3udy.basicmvpkotlin.model.Data

class MainPresenter(private val view: View) {

    fun count(number1: Int, number2: Int) {
        // Create a new variable called result, to accommodate the result
        val result = number1.times(number2)

        // Create a new variable called data
        val data = Data()
        data.result = result

        view.resultPresenter(data)
    }

    interface View {
        // Interface to connect the view with the presenter
        fun resultPresenter(data: Data)
    }
}