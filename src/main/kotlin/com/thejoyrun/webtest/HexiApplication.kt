package com.thejoyrun.webtest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class HexiApplication {


}

fun main(args: Array<String>) {
    SpringApplication.run(HexiApplication::class.java, *args)
}