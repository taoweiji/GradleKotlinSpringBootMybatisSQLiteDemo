package com.thejoyrun.webtest.controller

import com.thejoyrun.webtest.dao.UserRepository
import com.thejoyrun.webtest.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Controller
class TestController {
    @Autowired
    lateinit var userRepository: UserRepository

    @RequestMapping("/test")
    fun index(request: HttpServletRequest): String {
        val users = userRepository.findAll()
        request.setAttribute("users", users)
        return "/index.jsp"
    }

    @RequestMapping("/show")
    fun show(map: MutableMap<String, Any>, response: HttpServletResponse, request: HttpServletRequest): String {
        val users = userRepository.findAll()
        map["name"] = "Lx"
        map["message"] = "我<br>是<br>Wiki"
        map["users"] = users
        map["user"] = User(0, "Wiki")

        request.session.setAttribute("user", User(0, "Wiki-session"))


        return "index"
    }

    @RequestMapping("/index")
    fun index(map: MutableMap<String, Any>): String {
        map["user"] = User(1, "Wiki","/user?id=1")
        return "index2"
    }
}