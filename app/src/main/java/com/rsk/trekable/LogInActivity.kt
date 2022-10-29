package com.rsk.trekable

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar

class LogInActivity : AppCompatActivity() {
    private lateinit var toggle : ActionBarDrawerToggle

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_log_in)

        val toolBar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout_LogIN)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.open, R.string.close )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_profile_LogIN -> Toast.makeText(
                                                applicationContext,
                                                "Profile Clicked",
                                                Toast.LENGTH_LONG
                                            ).show()

                R.id.nav_rate_us_LogIN -> Toast.makeText(
                                                applicationContext,
                                                "Rated 5-Stars",
                                                Toast.LENGTH_LONG
                                            ).show()


            }

            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }

        val textViewForgetPassword : TextView = findViewById(R.id.textViewForgetPassword)
        textViewForgetPassword.setOnClickListener{
            Snackbar.make(textViewForgetPassword, "Forgot password", Snackbar.LENGTH_SHORT).show()
        }

        val buttonLogIn: Button = findViewById(R.id.buttonLogIN)
        buttonLogIn.setOnClickListener{
            Snackbar.make(buttonLogIn, "Logging in", Snackbar.LENGTH_SHORT).show()
            startActivity(Intent(this, MainPageActivity::class.java))
        }
        val buttonSignup: Button = findViewById(R.id.buttonSIGNUP)
        buttonSignup.setOnClickListener{
            Snackbar.make(buttonSignup, "Signing up", Snackbar.LENGTH_SHORT).show()
        }

    }
}