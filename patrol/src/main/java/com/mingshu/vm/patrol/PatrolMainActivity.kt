package com.mingshu.vm.patrol

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
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
        val navController = findNavController(this, R.id.nav_host_fragment)
        navView.setOnNavigationItemSelectedListener(object : BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                if (item.title.toString() == resources.getString(R.string.call)) {
                    val intent = Intent(resources.getString(R.string.demo_action))
                    startActivity(intent)
                    return false
                }
                navController.navigate(item.itemId)
                return true
            }
        })

    }
}