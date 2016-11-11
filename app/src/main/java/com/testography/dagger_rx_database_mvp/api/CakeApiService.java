package com.testography.dagger_rx_database_mvp.api;

import com.testography.dagger_rx_database_mvp.mvp.models.CakesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

public interface CakeApiService {

    @GET("/filippella/a728a34822a3bc7add98e477a4057b69/raw/310d712e87941f569074a63fedb675d2b611342a/cakes")
    Observable<CakesResponse> getCakes();

    @GET("/filippella/a728a34822a3bc7add98e477a4057b69/raw/310d712e87941f569074a63fedb675d2b611342a/cakes")
    Call<CakesResponse> getTheCakes();
}
