package com.thejoyrun.webtest.controller

import com.thejoyrun.webtest.dao.UserRepository
import com.thejoyrun.webtest.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@Controller
class UserController {
    //@Autowired
    //lateinit var userRepository: UserRepository

    @RequestMapping("/user")
    fun show(map: MutableMap<String, Any>, id: Int): String {
        val user = User(id, "Wiki")
        map["user"] = user
        return "user"
    }
}