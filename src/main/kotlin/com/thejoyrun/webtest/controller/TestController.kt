package com.thejoyrun.webtest.controller

import com.thejoyrun.webtest.dao.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@Controller
class TestController {
    @Autowired
    lateinit var userRepository: UserRepository

    @RequestMapping("/test")
    fun index(request: HttpServletRequest): String {
        val users = userRepository.findAll()
        request.setAttribute("users",users)
        return "/index.jsp"
    }
}