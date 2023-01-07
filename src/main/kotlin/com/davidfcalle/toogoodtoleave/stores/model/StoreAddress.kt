package com.davidfcalle.toogoodtoleave.stores.model

import com.davidfcalle.toogoodtoleave.offers.model.Location

class StoreAddress(
        val id: Long? = null,
        val location: Location,
        val store: Store,
)
