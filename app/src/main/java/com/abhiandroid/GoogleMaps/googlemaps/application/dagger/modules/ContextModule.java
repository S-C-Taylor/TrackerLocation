package com.abhiandroid.GoogleMaps.googlemaps.application.dagger.modules;

import android.content.Context;


import com.abhiandroid.GoogleMaps.googlemaps.application.dagger.scopes.ExampleApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by simon on 6/27/2018.
 */

@Module
public class ContextModule {
    private final Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @Provides
    @ExampleApplicationScope
    public Context context(){
        return this.context;
    }
}
