package com.thejoyrun.webtest.controller

import com.thejoyrun.webtest.dao.UserRepository
import com.thejoyrun.webtest.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestApiController {
    @Autowired
    lateinit var userRepository: UserRepository

    @GetMapping("/hello")
    fun hello(): Any {
        val users = userRepository.findAll()
        return users
    }

    @GetMapping("/hi")
    fun hi(): Any {
        return "hello world"
    }


}