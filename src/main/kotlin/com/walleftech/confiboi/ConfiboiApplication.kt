package com.walleftech.confiboi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ConfiboiApplication

fun main(args: Array<String>) {
	runApplication<ConfiboiApplication>(*args)
}
