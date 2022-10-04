package com.rsk.trekable

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var toggle : ActionBarDrawerToggle

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolBar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
   //     setSupportActionBar(toolBar)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.open, R.string.close )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        navView.setNavigationItemSelectedListener {item ->
            when(item.itemId){
                R.id.nav_profile-> Toast.makeText(applicationContext, "Profile Clicked", Toast.LENGTH_LONG).show()
                R.id.nav_Locations -> Toast.makeText(applicationContext, "Locations clicked", Toast.LENGTH_LONG).show()
                R.id.nav_rate_us -> Toast.makeText(applicationContext, "Rated 5-Stars", Toast.LENGTH_LONG).show()
                R.id.nav_Favourites -> Toast.makeText(applicationContext, "Favourites clicked", Toast.LENGTH_LONG).show()

            }

            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }

    }

    override fun onBackPressed() {
        val drawerlayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        super.onBackPressed()
        if(drawerlayout.isDrawerOpen(GravityCompat.START)){
            drawerlayout.closeDrawer(GravityCompat.START)
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}