package com.example.kotlinkeywordstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kotlinkeywordstudy.lines.CrossLineKeyword
import com.example.kotlinkeywordstudy.lines.NoInLineKeyword
import com.example.kotlinkeywordstudy.lines.ReiFiedKeyword

/**
 * 참고
 * https://leveloper.tistory.com/138?category=761696
 */
class MainActivity : AppCompatActivity() {

    private lateinit var txt1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt1 = findViewById<TextView>(R.id.mainTxt)
    }

    override fun onResume() {
        super.onResume()

        //InlineKeyword()
        //NoInLineKeyword()
        //CrossLineKeyword(txt1)
        //ReiFiedKeyword(txt1)


        //Get_Set()
        Other()



    }

}