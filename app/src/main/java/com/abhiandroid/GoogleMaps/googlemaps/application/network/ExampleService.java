package com.abhiandroid.GoogleMaps.googlemaps.application.network;


import com.abhiandroid.GoogleMaps.googlemaps.models.TrackerLocation;
import com.abhiandroid.GoogleMaps.googlemaps.models.TrackerRecord;

import io.reactivex.Completable;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by simon on 6/27/2018.
 */

public interface ExampleService {

    @PATCH("records/{id}.json")
    Completable updateRecord(@Path("id") int id, @Body TrackerRecord location);

}
