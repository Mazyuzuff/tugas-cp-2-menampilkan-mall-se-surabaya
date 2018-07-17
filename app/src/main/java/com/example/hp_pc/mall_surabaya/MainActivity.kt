package com.example.hp_pc.mall_surabaya

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMapI.setOnClickListener {
            val maintomap = Intent(this, MapsActivity::class.java)
            startActivity(maintomap)

            btnMap1.setOnClickListener {
                val maintomapu = Intent(this, MapsActivity2::class.java)
                startActivity(maintomapu)

                btnMap2.setOnClickListener {
                    val maintomapk = Intent(this, MapsActivity3::class.java)
                    startActivity(maintomapk)

                    btnMap3.setOnClickListener {
                        val maintomapl = Intent(this, MapsActivity4::class.java)
                        startActivity(maintomapl)

                        btnMap4.setOnClickListener {
                            val maintomapj = Intent(this, MapsActivity5::class.java)
                            startActivity(maintomapj)

                            btnMap5.setOnClickListener {
                                val maintomapx = Intent(this, MapsActivity6::class.java)
                                startActivity(maintomapx)
                            }
                        }
                    }

                }
            }
        }
    }
}
