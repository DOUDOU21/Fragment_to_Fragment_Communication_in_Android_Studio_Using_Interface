package com.ndoudou.usinginterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ndoudou.usinginterface.model.User

class MainActivity : AppCompatActivity() , Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FormFragment())
                .commit()
        }

    }

    override fun passDataCom(user: User) {
        val bundle = Bundle().apply {
            putSerializable("user", user)
        }
        val transaction = this.supportFragmentManager.beginTransaction()
        val infoFragment = InfoFragment()
        infoFragment.arguments = bundle
        transaction.replace(R.id.container, infoFragment)
        transaction.commit()
    }


}
