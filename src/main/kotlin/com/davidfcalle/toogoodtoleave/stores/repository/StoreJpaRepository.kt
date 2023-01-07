package com.davidfcalle.toogoodtoleave.stores.repository

import org.springframework.data.repository.CrudRepository

interface StoreJpaRepository : CrudRepository<StoreEntity, Long>