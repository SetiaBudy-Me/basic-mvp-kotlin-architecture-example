package com.l3udy.basicmvpkotlin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.l3udy.basicmvpkotlin.databinding.ActivityMainBinding
import com.l3udy.basicmvpkotlin.model.Data
import com.l3udy.basicmvpkotlin.presenter.MainPresenter
import com.l3udy.basicmvpkotlin.presenter.MainView

class MainActivity : AppCompatActivity(), MainView {

    // View Binding
    private lateinit var binding: ActivityMainBinding

    // Presenter
    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize presenter
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize presenter
        presenter = MainPresenter(this)

        setupClickListeners()
    }

    override fun resultPresenter(data: Data) {
        // Show result data
        binding.tvResult.text = data.result.toString()
    }

    // Setup the button in our activity
    private fun setupClickListeners() {
        binding.btnCount.setOnClickListener {
            try {
                // Initialize the number to be calculated
                val number1 = binding.etNumber1.text.toString().toInt()
                val number2 = binding.etNumber2.text.toString().toInt()

                // Calling a function inside the presenter
                presenter.count(number1, number2)
            } catch (e: Exception) {
                Log.e("MainActivity", "Error Exception -> ${e.localizedMessage}")
                Toast.makeText(this, "Oops something wrong..!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}