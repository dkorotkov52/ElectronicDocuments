package ru.korotkov.electronicdocuments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_authorization.*

class AuthActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun newIntent(context: Context): Intent =
            Intent(context, AuthActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)
        sing.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.sing -> login()
        }
    }

    private fun login() {
        val loginText = login.text.toString()
        val passwordText = password.text.toString()
        if(loginText == "89" && passwordText == "12345678"){
            finish()
        }else{
            showSnackbar("Ошибка вхда")
        }
    }

    private fun showSnackbar(text: String){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}