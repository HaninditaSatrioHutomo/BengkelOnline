package com.satriohutomoproject.bengkelonlineproject;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng maguwo = new LatLng(-7.7662876,110.4138804);
        mMap.addMarker(new MarkerOptions().position(maguwo).title("Jl. KH Muhdi, Corongan, Depok, Sleman").snippet("Hanindita Satrio, Bengkel Maju Lancar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(maguwo));
        LatLng maguwoa = new LatLng(-7.8762876,110.4238804);
        mMap.addMarker(new MarkerOptions().position(maguwoa).title("Jl. HR Benyamin, Pundong, Bantul").snippet("Bagus Andi, Bengkel Lancar Jaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(maguwoa));
        LatLng maguwob = new LatLng(-7.7062876,110.4538804);
        mMap.addMarker(new MarkerOptions().position(maguwob).title("Jl. Raya Barat, Wangon, Gunung Kidul").snippet("Caesar Malta, Bengkel Jaya Kusuma"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(maguwob));
        LatLng bantul = new LatLng(-7.8978265,110.222668);
        mMap.addMarker(new MarkerOptions().position(bantul).title("Jl. Patriot, Godean, Bantul").snippet("Amar Nuruddin, Bengkel Kusuma Negara"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bantul));
        LatLng kota = new LatLng(-7.9730465,110.4242874);
        mMap.addMarker(new MarkerOptions().position(kota).title("Jl. Patimura, Kota Gede, Sleman").snippet("Ezra Uvidtyan, Bengkel Negara Motor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kota));
        LatLng GK = new LatLng(-7.9675797,110.5300309);
        mMap.addMarker(new MarkerOptions().position(GK).title("Jl. Ahmad Dahlan, Kota, Kraton").snippet("Nindya Kharisma, Bengkel Motor Less"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GK));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kota,10));
    }
}
