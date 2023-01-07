package com.davidfcalle.toogoodtoleave.offers.controller

import com.davidfcalle.toogoodtoleave.offers.model.Location
import com.davidfcalle.toogoodtoleave.offers.model.Offer
import com.davidfcalle.toogoodtoleave.offers.services.OfferService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RestController

@RestController
class OfferController(
        private val service: OfferService,
) {

    @GetMapping("/offers")
    fun nearbyOffers(@ModelAttribute location: Location): List<Offer> {
        return service.findNearbyOffers(location)
    }
}