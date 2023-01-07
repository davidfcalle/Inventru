package com.davidfcalle.toogoodtoleave.offers.services

import com.davidfcalle.toogoodtoleave.offers.model.Location
import com.uber.h3core.H3Core
import org.springframework.stereotype.Service

private const val RING_RESOLUTION = 9
private const val NEIGHBORS_DISTANCE = 3

@Service
class GeoHashingService {

    private val h3 = H3Core.newInstance()

    fun toHexagonId(location: Location): String {
        return h3.latLngToCellAddress(location.lat, location.lng, RING_RESOLUTION)
    }

    fun nearbyHexagons(location: Location): List<String> {
        val hexagonId = toHexagonId(location)
        return  h3.gridDisk(hexagonId, NEIGHBORS_DISTANCE).toList()
    }
}