package com.intsoftdev.nreclient.data.network

import com.intsoftdev.nreclient.domain.StationModel
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Defines the abstract methods used for interacting with the NREProxyAPI
 */
internal interface StationsProxyService {

    @GET("locations")
    fun getAllStations(): Observable<List<StationModel>>
}