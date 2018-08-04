package com.abhiandroid.GoogleMaps.googlemaps.screens.map.dagger.components;

import com.abhiandroid.GoogleMaps.googlemaps.application.dagger.components.ExampleApplicationComponent;
import com.abhiandroid.GoogleMaps.googlemaps.screens.map.MapsActivity;
import com.abhiandroid.GoogleMaps.googlemaps.screens.map.dagger.modules.MapActivityModule;
import com.abhiandroid.GoogleMaps.googlemaps.screens.map.dagger.scopes.MapActivityScope;

import dagger.Component;

/**
 * Created by simon on 7/18/2018.
 */

@MapActivityScope
@Component(modules = {MapActivityModule.class}, dependencies = {ExampleApplicationComponent.class})
public interface MapActivityComponent {

    void injectMapComponent(MapsActivity mapsActivity);

}
