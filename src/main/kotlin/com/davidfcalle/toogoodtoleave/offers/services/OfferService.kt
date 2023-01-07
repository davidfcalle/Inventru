package com.davidfcalle.toogoodtoleave.offers.services

import com.davidfcalle.toogoodtoleave.offers.model.Location
import com.davidfcalle.toogoodtoleave.offers.model.Offer
import com.davidfcalle.toogoodtoleave.offers.repository.OfferRepository
import org.springframework.stereotype.Service

@Service
class OfferService(
        private val repository: OfferRepository,
        private val geoHashingService: GeoHashingService,
) {
    fun findNearbyOffers(location: Location): List<Offer> {
        val nearbyHexagons = geoHashingService.nearbyHexagons(location)
        return repository.findNearbyOffers(nearbyHexagons)
    }
}