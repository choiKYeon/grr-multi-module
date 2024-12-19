package org.grr.grrPos

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrrPosApplication

fun main(args: Array<String>) {
    runApplication<GrrPosApplication>(*args)
}
