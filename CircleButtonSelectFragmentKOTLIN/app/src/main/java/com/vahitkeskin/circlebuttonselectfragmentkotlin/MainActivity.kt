package com.vahitkeskin.circlebuttonselectfragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.vahitkeskin.circlebuttonselectfragmentkotlin.databinding.ActivityMainBinding
import com.vahitkeskin.circlebuttonselectfragmentkotlin.fragment.*

//Vahit Keskin Github -> Vahit11

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun homeFloating(view: View) {
        val homeFragment = HomeFragment()
        selectedFragment(homeFragment)

    }

    fun searchFloating(view: View) {
        val searchFragment = SearchFragment()
        selectedFragment(searchFragment)

    }

    fun addFloating(view: View) {
        val addFragment = AddFragment()
        selectedFragment(addFragment)

    }

    fun personFloating(view: View) {
        val personFragment = PersonFragment()
        selectedFragment(personFragment)

    }

    fun settingsFloating(view: View) {
        val settingsFragment = SettingsFragment()
        selectedFragment(settingsFragment)

    }

    private fun selectedFragment(fragment: Fragment) {
        binding.forFragmentClickFloatingButtonId.visibility = View.INVISIBLE
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransition : FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransition.replace(R.id.main_activity_frame_layout,fragment).commit()
    }
}