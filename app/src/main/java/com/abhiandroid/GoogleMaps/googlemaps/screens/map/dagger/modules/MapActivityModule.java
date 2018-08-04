package com.abhiandroid.GoogleMaps.googlemaps.screens.map.dagger.modules;

import com.abhiandroid.GoogleMaps.googlemaps.screens.map.MapsActivity;

import dagger.Module;

/**
 * Created by simon on 7/18/2018.
 */

@Module
public class MapActivityModule {

    private final MapsActivity mapsActivity;

    public MapActivityModule(MapsActivity mapsActivity){
        this.mapsActivity = mapsActivity;
    }
}
