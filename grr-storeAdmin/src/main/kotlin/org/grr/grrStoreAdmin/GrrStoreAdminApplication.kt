package org.grr.grrStoreAdmin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrrStoreAdminApplication

fun main(args: Array<String>) {
	runApplication<GrrStoreAdminApplication>(*args)
}
