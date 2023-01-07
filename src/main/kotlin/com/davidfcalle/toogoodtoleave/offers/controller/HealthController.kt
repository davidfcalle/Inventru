package com.davidfcalle.toogoodtoleave.offers.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {
    @GetMapping("/_health")
    fun health(): String {
        return "healthy"
    }
}