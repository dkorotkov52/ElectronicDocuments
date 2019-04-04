package ru.korotkov.electronicdocuments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
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
        when(v!!.id){
            R.id.sing -> login()
        }
    }

    private fun login() {
        if(login.text!!.equals("89000000000") && password.text!!.equals("12345678")) {
            finish()
        }
    }

}