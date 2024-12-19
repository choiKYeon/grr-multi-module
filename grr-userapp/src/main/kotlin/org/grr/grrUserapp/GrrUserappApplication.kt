package org.grr.grrUserapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrrUserappApplication

fun main(args: Array<String>) {
    runApplication<GrrUserappApplication>(*args)
}
