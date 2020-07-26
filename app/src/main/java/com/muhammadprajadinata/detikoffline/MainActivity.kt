package com.muhammadprajadinata.detikoffline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.muhammadprajadinata.detikoffline.fragmnet.HomeFragment
import com.muhammadprajadinata.detikoffline.fragmnet.KategoriFragment
import com.muhammadprajadinata.detikoffline.fragmnet.LayananFragment
import com.muhammadprajadinata.detikoffline.fragmnet.VideoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav.setOnNavigationItemSelectedListener(onBottomNavListener)

//        bottom_nav.getOrCreateBadge(R.id.itemHome).apply {
//            number = 20
//            isVisible = true
//            backgroundColor = resources.getColor(R.color.colorAccent)
//        }

        val frag = supportFragmentManager.beginTransaction()
        frag.add(R.id.fragContainer, HomeFragment())
        frag.commit()
    }

    private val onBottomNavListener = BottomNavigationView.OnNavigationItemSelectedListener {i->
        var selectedFragment: Fragment = HomeFragment()

        when(i.itemId) {
            R.id.itemHome -> {
                selectedFragment = HomeFragment()
            }
            R.id.itemLayanan -> {
                selectedFragment = LayananFragment()
            }
            R.id.itemKategori -> {
                selectedFragment = KategoriFragment()
            }
            R.id.itemVideo -> {
                selectedFragment = VideoFragment()
            }
        }
        val frag = supportFragmentManager.beginTransaction()
        frag.replace(R.id.fragContainer, selectedFragment)
        frag.commit()

        true

    }
}