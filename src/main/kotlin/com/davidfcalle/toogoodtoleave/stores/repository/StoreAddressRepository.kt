package com.davidfcalle.toogoodtoleave.stores.repository

import com.davidfcalle.toogoodtoleave.offers.model.Location
import com.davidfcalle.toogoodtoleave.stores.model.Store
import com.davidfcalle.toogoodtoleave.stores.model.StoreAddress
import com.davidfcalle.toogoodtoleave.stores.model.storeStatusFromString
import org.springframework.stereotype.Repository

@Repository
class StoreAddressRepository(
        private val repository: StoreAddressJpaRepository,
) {

    fun findAllByIdIn(storeIds: Set<Long>): List<StoreAddress> {
       return repository.findByIdIn(storeIds).map { it.toModel() }
    }

    fun save(storeAddress: StoreAddress) {
        repository.save(storeAddress.toEntity())
    }

}

private fun StoreAddress.toEntity(): StoreAddressEntity {
    return StoreAddressEntity(
            id = id,
            lat = location.lat,
            lng = location.lng,
            store = StoreEntity(
                    id = store.id,
                    name = store.name,
                    slug = store.slug,
                    status = store.status.name,
                    storeAddresses = emptySet(),
            )
    )
}
private fun StoreAddressEntity.toModel(): StoreAddress {
    return StoreAddress(
            id = id,
            location = Location(lat, lng),
            store = Store(
                    id = store.id,
                    name = store.name,
                    slug = store.slug,
                    status = storeStatusFromString(store.status)
            )
    )
}