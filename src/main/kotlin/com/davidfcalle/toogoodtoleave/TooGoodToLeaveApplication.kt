package com.davidfcalle.toogoodtoleave

import com.davidfcalle.toogoodtoleave.offers.model.Offer
import com.davidfcalle.toogoodtoleave.offers.repository.OfferRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import java.time.ZonedDateTime

@SpringBootApplication
class TooGoodToLeaveApplication

fun main(args: Array<String>) {
	runApplication<TooGoodToLeaveApplication>(*args)
}

@Component
class DummyDataGenerator(
		private val repository: OfferRepository
) : CommandLineRunner {
	override fun run(vararg args: String?) {
		val offer1 = Offer(
				title = "Paquete Sorpresa de panes",
				description = "Llévate una deliciosa mezcla de panes catalanes",
				storePictureUrl = "https://lh4.googleusercontent.com/-fCanI1V7AWU/AAAAAAAAAAI/AAAAAAAAAAA/zqSxFKwYO3s/s88-p-k-no-ns-nd/photo.jpg",
				productPictureUrl = "https://s10.s3c.es/imag/_v0/770x420/4/9/8/600x400_panaderia-estanteria-pan-770-dreamstime.jpg",
				address = "C. del Pare Laínez, 13, 08025 Barcelona",
				validFrom = ZonedDateTime.now(),
				validTo = ZonedDateTime.now().plusDays(1),
				hexagonId = "8939446012bffff",
				locationLat = 41.4065802,
				locationLng = 2.1646064,
				quantity = 3,
		)
		repository.save(offer1)
	}

}