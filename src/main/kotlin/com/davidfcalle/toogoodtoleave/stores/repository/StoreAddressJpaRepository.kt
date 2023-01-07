package com.davidfcalle.toogoodtoleave.stores.repository

import org.springframework.data.repository.CrudRepository

interface StoreAddressJpaRepository : CrudRepository<StoreAddressEntity, Long> {
    fun findByIdIn(ids: Set<Long>): List<StoreAddressEntity>
}