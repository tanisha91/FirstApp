package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

//    private val inflateFragment(){
//
//    }

    ///@SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomBar = findViewById<BottomNavigationView>(R.id.Bottom_bar)
        bottomBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.guard_home -> {
                    inflateFragment(GuardFragment.newInstance())
                }
                R.id.dash_board -> {
                    inflateFragment(HomeFragment.newInstance())
                }
                R.id.das_home -> {
                    inflateFragment(dashboadFragment.newInstance())
                }
                R.id.pro_home -> {
                    inflateFragment(ProfileFragment.newInstance())
                }
            }

                true
        }
        bottomBar.selectedItemId=R.id.dash_board
    }

    private fun inflateFragment(newInstance: Fragment) {
        val transition = supportFragmentManager.beginTransaction()
        transition.replace(R.id.container,newInstance)
        transition.commit()

    }


//        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()
//        var btn=findViewById<Button>(R.id.calculate)
//        btn.setOnClickListener{
//            openScreen()
//        }
//    }
//
//fun openScreen() {
//    var intent=Intent(this,GuardScreen::class.java)
//    startActivity(intent
//    )
//        var num_a=findViewById<EditText>(R.id.num_a)
//        var numb=findViewById<EditText>(R.id.num_b)
//        var valA=num_a.text.toString().toInt()
//        var valB=numb.text.toString().toInt()
//var sum=valA+valB
//        Toast.makeText(this,"$sum",Toast.LENGTH_LONG).show()
//



}