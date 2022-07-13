package com.l3udy.basicmvpkotlin.presenter

import com.l3udy.basicmvpkotlin.model.Data

class MainPresenter(private val data: MainView) {

    fun count(number1: Int, number2: Int) {
        // Create a new variable called result, to accommodate the result
        val result = number1.times(number2)

        // Create a new variable called model
        val model = Data()
        model.result = result

        data.resultPresenter(model)
    }
}