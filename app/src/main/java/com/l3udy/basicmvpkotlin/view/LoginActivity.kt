package com.l3udy.basicmvpkotlin.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.l3udy.basicmvpkotlin.databinding.ActivityLoginBinding
import com.l3udy.basicmvpkotlin.model.ApiResult
import com.l3udy.basicmvpkotlin.presenter.LoginPresenter

class LoginActivity : AppCompatActivity(), LoginPresenter.View {

    // View Binding
    private lateinit var binding: ActivityLoginBinding

    // Presenter
    private lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        // Initialize presenter
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize presenter
        presenter = LoginPresenter(this)

        setupClickListeners()
    }

    override fun loginResult(apiResult: ApiResult) {
        when {
            apiResult.success != null -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            apiResult.error != null -> Toast.makeText(this, getString(apiResult.error), Toast.LENGTH_SHORT).show()
            apiResult.errorMessage != null -> Toast.makeText(this, apiResult.errorMessage, Toast.LENGTH_SHORT).show()
        }
    }

    // Setup the button in our activity
    private fun setupClickListeners() {
        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            presenter.login(email, password)
        }
    }
}