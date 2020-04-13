package com.intsoftdev.nreclient.domain

import io.reactivex.Completable
import io.reactivex.Observable

/**
 * Interface defining methods for how the data layer can pass data to and from the Domain layer.
 * This specifies the operations that need to be implemented in the data layer
 */
interface StationsDataRepository {

    fun saveAllStations(stations : List<StationModel>): Completable
    fun getAllStations() : Observable<List<StationModel>>
}