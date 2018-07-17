package com.example.hp_pc.mall_surabaya

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions



class MapsActivity6 : AppCompatActivity(), OnMapReadyCallback {

    lateinit var nMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps6)
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map6) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        nMap = googleMap
        val p = LatLng(-7.252381,112.750378)
        nMap.addMarker(MarkerOptions().position(p).title("Hi-Tech Mall Surabaya"))
        var zoomLevel = 16.0f
        nMap.moveCamera(CameraUpdateFactory.newLatLngZoom(p, zoomLevel))
    }
}