package com.davidfcalle.toogoodtoleave.offers.repository

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.ZonedDateTime

@Entity
class OfferEntity(
    @Id @GeneratedValue var id: Long? = null,

    val createdAt: ZonedDateTime = ZonedDateTime.now(),
    val updatedAt: ZonedDateTime = ZonedDateTime.now(),

    val title: String,
    val description: String,
    val storePictureUrl: String?,
    val productPictureUrl: String?,
    val address: String?,


    val validFrom: ZonedDateTime,
    val validTo: ZonedDateTime,
    val quantity: Int,


    val locationLat: Double,
    val locationLng: Double,
    val hexagonId: String,
)
