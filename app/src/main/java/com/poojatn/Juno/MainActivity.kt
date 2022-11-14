package com.poojatn.Juno

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.poojatn.Juno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        const val RESULT = "RESULT"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnScan.setOnClickListener {
            val intent = Intent(applicationContext, ScanActivity::class.java)
            startActivity(intent)
        }
        binding.btnScan2.setOnClickListener {
            val intent = Intent(applicationContext, ScanActivity::class.java)
            startActivity(intent)
        }



        val result = intent.getStringExtra(RESULT)

        if (result != null) {

            binding.result.text = result.toString()

        }

    }


}
