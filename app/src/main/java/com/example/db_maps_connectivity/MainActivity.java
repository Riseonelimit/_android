package com.example.db_maps_connectivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.db_maps_connectivity.databinding.ActivityMapsBinding;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        //========================================
        //          DATABASE-HELPER
        //========================================

//        DBHelper dbHelper = new DBHelper(this);
//
////        dbHelper.insertRecord("Mango",100);
////        dbHelper.insertRecord("Orange",90);
////        dbHelper.insertRecord("Banana",40);
////        dbHelper.insertRecord("Grapes",70);
//
//        ArrayList<FruitsModel> result = dbHelper.getAllData();
//
//        for (FruitsModel data : result) {
//            Log.d("DATA_OUTPUT", "Fruit: " + data.name + " | Quality: " + data.quality);
//        }
    }

    @Override
    public void onMapReady( GoogleMap googleMap) {
        mMap = googleMap;

        //Add a marker in Sydney and move the camera
        LatLng dmart = new LatLng(18.566779144801636, 73.80719395855633);
        mMap.addMarker(new MarkerOptions().position(dmart).title("D Mart Aund-Baner"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dmart,16));
    }
}