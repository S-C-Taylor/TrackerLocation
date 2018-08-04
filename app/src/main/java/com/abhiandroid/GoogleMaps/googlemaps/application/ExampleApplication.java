package com.abhiandroid.GoogleMaps.googlemaps.application;

import android.app.Activity;
import android.app.Application;

import com.abhiandroid.GoogleMaps.googlemaps.application.dagger.components.DaggerExampleApplicationComponent;
import com.abhiandroid.GoogleMaps.googlemaps.application.dagger.components.ExampleApplicationComponent;
import com.abhiandroid.GoogleMaps.googlemaps.application.dagger.modules.ContextModule;
import com.abhiandroid.GoogleMaps.googlemaps.application.network.ExampleService;
import com.squareup.picasso.Picasso;

import timber.log.Timber;

/**
 * Created by simon on 7/11/2018.
 */

public class ExampleApplication extends Application {

    private ExampleService roomService;
    private Picasso picasso;
    private ExampleApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());


        component = DaggerExampleApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

        roomService = component.getExampleService();
        picasso = component.getPicasso();
    }

    public ExampleApplicationComponent getComponent(){
        return this.component;
    }

    public static ExampleApplication get(Activity activity) {
        return (ExampleApplication) activity.getApplication();
    }


}
