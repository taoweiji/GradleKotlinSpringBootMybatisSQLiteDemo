package com.thejoyrun.webtest.controller

import com.thejoyrun.webtest.dao.UserRepository
import com.thejoyrun.webtest.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class UserApiController {
    //@Autowired
    //lateinit var userRepository: UserRepository

    @RequestMapping("/api/getUser")
    fun getUser(id: Int): User {
        val user = User(id, "Wiki")
        return user
    }
}