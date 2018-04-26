package com.thejoyrun.webtest

import com.thejoyrun.webtest.dao.UserRepository
import com.thejoyrun.webtest.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @Autowired
    internal var userRepository: UserRepository? = null

    @GetMapping("/hello")
    fun helloworld(): Any {
        var user1 = User()
        user1.id = 2
        user1.name = "Wiki"
//        userRepository!!.insert(user1)
        var user2 = userRepository!!.findById(1)
        println(user2.name)
        return user2
    }
}