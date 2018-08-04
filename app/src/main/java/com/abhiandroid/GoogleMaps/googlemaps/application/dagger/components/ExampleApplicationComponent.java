package com.abhiandroid.GoogleMaps.googlemaps.application.dagger.components;


import com.abhiandroid.GoogleMaps.googlemaps.application.dagger.modules.ExampleServiceModule;
import com.abhiandroid.GoogleMaps.googlemaps.application.dagger.modules.PicassoModule;
import com.abhiandroid.GoogleMaps.googlemaps.application.dagger.scopes.ExampleApplicationScope;
import com.abhiandroid.GoogleMaps.googlemaps.application.network.ExampleService;
import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * Created by simon on 6/27/2018.
 */

@ExampleApplicationScope
@Component(modules = {ExampleServiceModule.class, PicassoModule.class})
public interface ExampleApplicationComponent {

    Picasso getPicasso();

    ExampleService getExampleService();
}
