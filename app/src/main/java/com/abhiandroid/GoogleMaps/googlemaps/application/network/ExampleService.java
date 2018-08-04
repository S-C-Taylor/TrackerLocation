package com.abhiandroid.GoogleMaps.googlemaps.application.network;


import com.abhiandroid.GoogleMaps.googlemaps.models.TrackerLocation;

import io.reactivex.Completable;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

/**
 * Created by simon on 6/27/2018.
 */

public interface ExampleService {

    @PUT("location.json")
    Completable updateLocation(@Body TrackerLocation location);

}
