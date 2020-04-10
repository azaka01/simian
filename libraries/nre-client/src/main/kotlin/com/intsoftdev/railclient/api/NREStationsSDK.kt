package com.intsoftdev.railclient.api

import android.location.Location
import com.intsoftdev.railclient.data.StationModel
import com.intsoftdev.railclient.di.DIComponent
import com.intsoftdev.railclient.domain.repository.interactor.GetStationsUseCase
import io.reactivex.Observable
import org.koin.core.get

class NREStationsSDK : NREStationsAPI, DIComponent {

    private val getStationsUseCase by lazy { get<GetStationsUseCase>() }

    override fun getAllStations(): Observable<List<StationModel>> {
        return getStationsUseCase.getAllStations()
    }

    override fun getLondonStations(): Observable<List<StationModel>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getStationsByLocation(location: Location, numResults: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}