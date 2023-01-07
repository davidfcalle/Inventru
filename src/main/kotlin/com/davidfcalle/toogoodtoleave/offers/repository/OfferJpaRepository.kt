package com.davidfcalle.toogoodtoleave.offers.repository

import org.springframework.data.repository.CrudRepository

interface OfferJpaRepository : CrudRepository<OfferEntity, Long> {

    fun findByHexagonIdIn(hexagonIds: List<String>): List<OfferEntity>
}