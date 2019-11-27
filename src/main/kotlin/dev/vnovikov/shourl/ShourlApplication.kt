package dev.vnovikov.shourl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShourlApplication

fun main(args: Array<String>) {
	runApplication<ShourlApplication>(*args)
}
