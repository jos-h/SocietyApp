package com.example.androiddemo
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.signup.*


class SignUp : Activity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val email: EditText = findViewById(R.id.emailaddress)

        val password: EditText = findViewById(R.id.password)

        val confirmPassword: EditText = findViewById(R.id.confirm_password)

        val signUp: Button = findViewById(R.id.signUp)

        signUp.setOnClickListener{ registerUser(email.text.toString(), password, confirmPassword)}
    }

    private fun registerUser(text: String, password: EditText, confirmPassword: EditText) {
//        Log.i("SignUpActivity", "On click event")
        val passwordValue: String = password.text.toString()
        val confirmPasswordValue: String = confirmPassword.text.toString()

        if(text.isEmpty())
        {
            emailaddress.error= "Field cannot be empty!!!".toString()
            return
        }
        else if(!(Patterns.EMAIL_ADDRESS.matcher(text).matches()))
        {
            emailaddress.error= "Please enter valid email address!!!".toString()
            return
        }
//        println("$password_value=====================$confirmPassword_value")

        when {
            password.text.isEmpty() -> {
                password.error= "Field cannot be empty!!!".toString()
                return
            }
            confirmPassword.text.isEmpty() -> {
                confirmPassword.error= "Field cannot be empty!!!".toString()
                return
            }

            passwordValue != confirmPasswordValue -> {
                confirmPassword.error= "Passwords does not match!!!!".toString()
                return
            }
            else -> {
                val intent = Intent(this, MainActivity::class.java)
                val userName: List<String> = text.split("@")
                intent.putExtra("username", userName[0])
                intent.putExtra("FlatNo", "A-44")
                startActivity(intent)
            }
        }

    }


}