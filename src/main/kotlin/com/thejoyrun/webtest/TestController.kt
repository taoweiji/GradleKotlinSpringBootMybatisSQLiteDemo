package com.thejoyrun.webtest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/hello")
    fun helloworld(): Any {
        return User()
    }
}