package com.davidfcalle.toogoodtoleave.stores.repository

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.time.ZonedDateTime

@Entity
class StoreEntity(
        @Id @GeneratedValue var id: Long? = null,
        val createdAt: ZonedDateTime = ZonedDateTime.now(),
        val updatedAt: ZonedDateTime = ZonedDateTime.now(),
        val name: String,
        val slug: String,
        val status: String,
        @OneToMany(mappedBy="store")
        val storeAddresses: Set<StoreAddressEntity>,
)
