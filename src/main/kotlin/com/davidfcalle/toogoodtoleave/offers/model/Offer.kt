package com.davidfcalle.toogoodtoleave.offers.model

import java.time.ZonedDateTime

data class Offer(
        val title: String,
        val description: String,
        val storePictureUrl: String?,
        val productPictureUrl: String?,
        val address: String?,

        val validFrom: ZonedDateTime,
        val validTo: ZonedDateTime,

        val pickupTimeFrom: ZonedDateTime,
        val pickupTimeTo: ZonedDateTime,

        val quantity: Int,

        val locationLat: Double,
        val locationLng: Double,
        val hexagonId: String,
)