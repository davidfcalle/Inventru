package com.davidfcalle.toogoodtoleave.offers.repository

import com.davidfcalle.toogoodtoleave.offers.model.Offer
import org.springframework.stereotype.Repository

@Repository
class OfferRepository(
    private val jpaRepository: OfferJpaRepository,
) {

    fun findNearbyOffers(nearbyHexagons: List<String>) : List<Offer> {
        return jpaRepository.findByHexagonIdIn(nearbyHexagons)
                .map { it.toModel() }
    }

    fun save(offer: Offer) {
        val entity = offer.toEntity()
        jpaRepository.save(entity)
    }

}

private fun Offer.toEntity(): OfferEntity {
    return OfferEntity(
            title = title,
            description = description,
            storePictureUrl = storePictureUrl,
            productPictureUrl = productPictureUrl,
            address = address,
            validFrom = validFrom,
            validTo = validTo,
            quantity =quantity,
            locationLat=locationLat,
            locationLng= locationLng,
            hexagonId = hexagonId,
    )
}

private fun OfferEntity.toModel(): Offer {
    return Offer(
            title = title,
            description = description,
            storePictureUrl = storePictureUrl,
            productPictureUrl = productPictureUrl,
            address = address,
            validFrom = validFrom,
            validTo = validTo,
            quantity =quantity,
            locationLat=locationLat,
            locationLng= locationLng,
            hexagonId = hexagonId,
    )
}