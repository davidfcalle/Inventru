package com.davidfcalle.toogoodtoleave.stores.service

import com.davidfcalle.toogoodtoleave.stores.model.StoreAddress
import com.davidfcalle.toogoodtoleave.stores.repository.StoreAddressRepository
import org.springframework.stereotype.Service

@Service
class StoreAddressService(
        private val repository: StoreAddressRepository,
) {
    fun findAllByIdIn(storeAddressIds: Set<Long>): List<StoreAddress> {
        return repository.findAllByIdIn(storeAddressIds)
    }
}