package com.mingshu.vm.patrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * app主界面
 *
 */
class PatrolMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patrol_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(this,R.id.nav_host_fragment)
        NavigationUI.setupWithNavController(navView,navController );

    }
}