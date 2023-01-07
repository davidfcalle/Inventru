package com.davidfcalle.toogoodtoleave

import com.davidfcalle.toogoodtoleave.offers.model.Location
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
		val offers = listOf(
			Offer(
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
				pickupTimeFrom = ZonedDateTime.now().plusHours(1),
				pickupTimeTo = ZonedDateTime.now().plusHours(2),
			),
			Offer(
				title = "Paquete Sorpresa Frituras",
				description = "Frituras para ti y tus amigos, un paquete sorpresa",
				storePictureUrl = "https://tiendadeempanadas.com.ar/wp-content/uploads/2021/04/logo_tienda.png",
				productPictureUrl = "https://i.blogs.es/698411/empanadas_colombianas-min/450_1000.jpg",
				address = "Cl. 98 #70-19",
				validFrom = ZonedDateTime.now(),
				validTo = ZonedDateTime.now().plusDays(1),
				hexagonId = "8966e428bd7ffff",
				locationLat = 4.6937335,
				locationLng = -74.0786183,
				quantity = 3,
				pickupTimeFrom = ZonedDateTime.now().plusHours(1),
				pickupTimeTo = ZonedDateTime.now().plusMinutes(45),
			),
			Offer(
				title = "Paquete sorpresa de cosas para rezar",
				description = "Llega al cielo, y más allá con estos artículos bendecidos",
				storePictureUrl = "https://yt3.ggpht.com/ytc/AMLnZu-9y672nbmBu5dVc4pbUssqu_HApjQvgD-7hF2Rxw=s900-c-k-c0x00ffffff-no-rj",
				productPictureUrl = "https://www.latercera.com/resizer/5ivTgpS_tHVQApaRMOLy8EbeUqQ=/900x600/smart/cloudfront-us-east-1.images.arcpublishing.com/copesa/KWLZZZXQ35HTVJIVA6SPBECJD4.png",
				address = "Cl. 98 #70-19",
				validFrom = ZonedDateTime.now(),
				validTo = ZonedDateTime.now().plusDays(1),
				hexagonId = "8966e428bd7ffff",
				locationLat = 4.6937335,
				locationLng = -74.0786183,
				quantity = 3,
				pickupTimeFrom = ZonedDateTime.now().plusHours(1),
				pickupTimeTo = ZonedDateTime.now().plusHours(2),
			),
			Offer(
				title = "Paquete Sorpresa de panes",
				description = "Llévate una deliciosa mezcla de panes catalanes",
				storePictureUrl = "https://lh4.googleusercontent.com/-fCanI1V7AWU/AAAAAAAAAAI/AAAAAAAAAAA/zqSxFKwYO3s/s88-p-k-no-ns-nd/photo.jpg",
				productPictureUrl = "https://s10.s3c.es/imag/_v0/770x420/4/9/8/600x400_panaderia-estanteria-pan-770-dreamstime.jpg",
				address = "Cl. 98 #70-19",
				validFrom = ZonedDateTime.now(),
				validTo = ZonedDateTime.now().plusDays(1),
				hexagonId = "8966e428bd7ffff",
				locationLat = 4.6937335,
				locationLng = -74.0786183,
				quantity = 3,
				pickupTimeFrom = ZonedDateTime.now().plusHours(1),
				pickupTimeTo = ZonedDateTime.now().plusHours(2),
			),
			Offer(
				title = "Paquete Tostao",
				description = "Te puedes encontrar cualquier cosa acá",
				storePictureUrl = "https://media-exp1.licdn.com/dms/image/C4D1BAQG5RRhlmgItrg/company-background_10000/0/1588804213207?e=2147483647&v=beta&t=PsGY4_za9QlKjk_K2WW83P9QwztjqlBJfeumjXSVbvU",
				productPictureUrl = "https://nosotros.tostao.com/wp-content/uploads/2020/04/panaderia-tostao-6.jpg",
				address = "Cl. 98 #70-19",
				validFrom = ZonedDateTime.now(),
				validTo = ZonedDateTime.now().plusDays(1),
				hexagonId = "8966e428bd7ffff",
				locationLat = 4.6937335,
				locationLng = -74.0786183,
				quantity = 3,
				pickupTimeFrom = ZonedDateTime.now().plusHours(1),
				pickupTimeTo = ZonedDateTime.now().plusHours(2),
			),
			Offer(
				title = "Paquete Sorpresa de snacks de cine colombia",
				description = "Llévate una snacks para tu plan de película de hoy en casa",
				storePictureUrl = "https://medias.unifrance.org/medias/148/198/181908/format_hd/cine-colombia.png",
				productPictureUrl = "https://archivos-cms.cinecolombia.com/images/6/6/4/7/7466-7-esl-CO/combo%20personal%20def.png.jpg",
				address = "Carrera 72 # 80-94 Centro Comercial Titán Plaza, Bogotá, Colombia",
				validFrom = ZonedDateTime.now(),
				validTo = ZonedDateTime.now().plusDays(1),
				hexagonId = "8966e428bd7ffff",
				locationLat = 4.6955805,
				locationLng = -74.0863024,
				quantity = 3,
				pickupTimeFrom = ZonedDateTime.now().plusHours(1),
				pickupTimeTo = ZonedDateTime.now().plusHours(2),
			),
		)
		offers.forEach { repository.save(it) }
	}

}