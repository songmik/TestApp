package org.techtown.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 버튼을 누르면 순환률로 화면이동
        button.setOnClickListener{
            val circulation = Intent(this, Mcirculation::class.java)
            startActivity(circulation)
        }

        // 버튼2를 누르면 체류시간으로 이동
        button2.setOnClickListener{
            val residensetime = Intent(this, Mresidensetime::class.java)
            startActivity(residensetime)
        }

        // 버튼3을 누르면 CCTV로 이동
        button3.setOnClickListener{
            val cctv = Intent(this, Mcctv::class.java)
            startActivity(cctv)
        }

        // 버튼4를 누르면 settings로 이동
        button4.setOnClickListener{
            val membership = Intent(this, MainActivity::class.java)
            startActivity(membership)
        }
    }
}