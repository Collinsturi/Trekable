package com.rsk.trekable

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class LogInActivity : AppCompatActivity() {
    private lateinit var toggle : ActionBarDrawerToggle

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
        val mEditText = findViewById<EditText>(R.id.editTextContentLogIn)
        val mDrawable: Drawable = getDrawable(R.drawable.username_image)!!
        mEditText.setCompoundDrawablesWithIntrinsicBounds   (mDrawable, null, null , null)


        val password_editText = findViewById<EditText>(R.id.editTextContentPassword)
        val passwordImage: Drawable = getDrawable(R.drawable.password_image)!!
        val showPassword: Drawable = getDrawable(R.drawable.ic_baseline_show_password_24)!!
        password_editText.setCompoundDrawablesWithIntrinsicBounds(passwordImage, null, showPassword , null)

    }
}