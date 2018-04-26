package com.thejoyrun.webtest

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@MapperScan("com.thejoyrun.webtest")
@SpringBootApplication
open class MyApplication {


}

fun main(args: Array<String>) {
    SpringApplication.run(MyApplication::class.java, *args)
}