package com.davidfcalle.toogoodtoleave.stores.model

enum class StoreStatus {
    ACTIVE,
    INACTIVE,
    UNKNOWN,
}

fun storeStatusFromString(status: String): StoreStatus {
    val parsedStatus = StoreStatus.values().filter { it.name == status }.firstOrNull()
    return parsedStatus ?: StoreStatus.UNKNOWN
}