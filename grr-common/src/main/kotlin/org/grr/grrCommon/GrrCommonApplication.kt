package org.grr.grrCommon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrrCommonApplication

fun main(args: Array<String>) {
    runApplication<GrrCommonApplication>(*args)
}
