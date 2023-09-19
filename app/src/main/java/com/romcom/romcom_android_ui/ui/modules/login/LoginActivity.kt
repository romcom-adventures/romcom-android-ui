package com.romcom.romcom_android_ui.ui.modules.login

import android.R.attr.fragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.romcom.romcom_android_ui.R
import com.romcom.romcom_android_ui.databinding.ActivityLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
  private lateinit var binding: ActivityLoginBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityLoginBinding.inflate(layoutInflater)
    setContentView(binding.root)
    initFragment()

  }

  fun initFragment(){
    val mFragmentManager = supportFragmentManager
    val mFragmentTransaction = mFragmentManager.beginTransaction()
    val mFragment = MobileFragment()
    mFragmentTransaction.add(R.id.activity_login_container, mFragment).commit()
  }
}