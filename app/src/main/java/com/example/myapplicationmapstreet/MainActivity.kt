package com.example.myapplicationmapstreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.maps.MapView
import com.mapbox.mapboxsdk.maps.Style

var mapView: MapView? = null



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //setContentView(R.layout.activity_main)
        Mapbox.getInstance(this, "pk.eyJ1IjoiY2FybG9zYWxiZXJ0b21iNDE0IiwiYSI6ImNrdzA2NWljbmRkaDUydnBndGRqZ3V3bDEifQ.tBYpTmk9KtDME7HNnM-3Vw")
        setContentView(R.layout.activity_main)
        mapView = findViewById(R.id.mapView)
        mapView?.onCreate(savedInstanceState)
        mapView?.getMapAsync {
            mapboxMap -> mapboxMap.setStyle(Style.MAPBOX_STREETS)
        }

    }

    public override fun onResume() {
        super.onResume()
        mapView?.onResume()
    }

    override fun onStart() {
        super.onStart()
        mapView?.onStart()
    }

    override fun onStop() {
        super.onStop()
        mapView?.onStop()
    }

    public override fun onPause() {
        super.onPause()
        mapView?.onPause()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView?.onLowMemory()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView?.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView?.onSaveInstanceState(outState)
    }
}