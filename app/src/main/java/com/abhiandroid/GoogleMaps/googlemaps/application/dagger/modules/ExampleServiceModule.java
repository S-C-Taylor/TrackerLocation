package com.abhiandroid.GoogleMaps.googlemaps.application.dagger.modules;

import com.abhiandroid.GoogleMaps.googlemaps.application.dagger.scopes.ExampleApplicationScope;
import com.abhiandroid.GoogleMaps.googlemaps.application.network.ExampleService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by simon on 6/27/2018.
 */

@Module(includes = {NetworkModule.class})
public class ExampleServiceModule {
    @Provides
    @ExampleApplicationScope
    public ExampleService roomService(Retrofit retrofit){
        return retrofit.create(ExampleService.class);
    }

    @Provides
    @ExampleApplicationScope
    public Gson gson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }

    @Provides
    @ExampleApplicationScope
    public Retrofit retrofit(OkHttpClient okHttpClient, Gson gson){
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .baseUrl("https://dispatch-soak.firebaseio.com/")
                .build();
    }
}
