package com.mindorks.framework.lsgpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.mindorks.framework.lsgpractice.ui.framework.main.standing.Standing
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frameLayout = findViewById<FrameLayout>(R.id.frame1)
         supportFragmentManager
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame1, news_fragment())
        transaction.commit()


        val transaction1 = supportFragmentManager.beginTransaction()
        transaction1.replace(R.id.frame2, Standing())
//        transaction1.addToBackStack(null);
        transaction1.commit()

        val transaction2 = supportFragmentManager.beginTransaction()
        transaction2.replace(R.id.frame3, SquadsFragment())
//        transaction2.addToBackStack(null);
        transaction2.commit()

        val transaction3 = supportFragmentManager.beginTransaction()
        transaction3.replace(R.id.frame4, latest_update_fragment())
//        transaction2.addToBackStack(null);
        transaction3.commit()






    }
}