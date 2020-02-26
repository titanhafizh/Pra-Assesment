package com.d3ifcool.praasesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

   //private var binding =

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  val binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val navController = this.findNavController(R.id.navigation)
        NavigationUI.setupActionBarWithNavController(this, navController)

    }

    override fun onSupportNavigateUp(): Boolean {

        val navController = this.findNavController(R.id.navigation)
        return navController.navigateUp()


    }
}
