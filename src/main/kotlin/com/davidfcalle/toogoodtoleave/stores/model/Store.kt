package com.davidfcalle.toogoodtoleave.stores.model

class Store(
        val id: Long? = null,
        val name: String,
        val slug: String,
        val status: StoreStatus,
)
