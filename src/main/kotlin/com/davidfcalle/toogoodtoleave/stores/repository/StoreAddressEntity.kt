package com.davidfcalle.toogoodtoleave.stores.repository

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.ZonedDateTime

@Entity
class StoreAddressEntity(
        @Id @GeneratedValue var id: Long? = null,
        val createdAt: ZonedDateTime = ZonedDateTime.now(),
        val updatedAt: ZonedDateTime = ZonedDateTime.now(),
        val lat: Double,
        val lng: Double,
        @ManyToOne
        @JoinColumn(name="store_id", nullable=false)
        val store: StoreEntity,
)
