package com.example.brianneil.login12;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

/**
 * Created by Alejandro on 02/12/2015.
 */
public class Fragment_mapa extends Fragment
{
    MapView mMapView;
    GoogleMap googleMap;

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // inflat and return the layout
        View v = inflater.inflate(R.layout.fm_mapa, container, false);

        mMapView = (MapView)v.findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);

        googleMap = mMapView.getMap();

        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.setMyLocationEnabled(true);



        // Perform any camera updates here
        return v;
    }
}
