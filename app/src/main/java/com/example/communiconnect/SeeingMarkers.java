package com.example.communiconnect;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class SeeingMarkers extends AppCompatActivity {

    private GoogleMap googleMap;
    private double[][] locations = {
            {37.7749, -122.4194}, // San Francisco, CA
            {34.0522, -118.2437}, // Los Angeles, CA
            {40.7128, -74.0060},  // New York, NY
            {51.5074, -0.1278},   // London, UK
            {48.8566, 2.3522},    // Paris, France

            // Add more locations as needed
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeing_markers);

        FragmentManager fragmentManager = getSupportFragmentManager();
        SupportMapFragment mapFragment = (SupportMapFragment) fragmentManager.findFragmentById(R.id.maptosee);

        if (mapFragment == null) {
            mapFragment = SupportMapFragment.newInstance();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.map, mapFragment);
            fragmentTransaction.commit();
        }

        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap map) {
                googleMap = map;
                markLocationsOnMap();
            }
        });
    }


    private void markLocationsOnMap() {
        if (googleMap == null) {
            Toast.makeText(this, "Google Map is not ready yet", Toast.LENGTH_SHORT).show();
            return;
        }

        googleMap.clear(); // Clear existing markers

        for (double[] location : locations) {
            final double lat = location[0];
            final double lng = location[1];
            LatLng latLng = new LatLng(lat, lng);
            Marker marker = googleMap.addMarker(new MarkerOptions().position(latLng));

            // Add a click listener to the marker
            googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                @Override
                public boolean onMarkerClick(Marker clickedMarker) {
                    LatLng markerPosition = clickedMarker.getPosition();
                    double clickedLat = markerPosition.latitude;
                    double clickedLng = markerPosition.longitude;

                    Toast.makeText(SeeingMarkers.this, clickedLat + "," + clickedLng, Toast.LENGTH_SHORT).show();

                    return true;
                }
            });

        }
    }
}
