package com.thejoyrun.webtest

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class Test2Controller {

    @RequestMapping("/test")
    fun helloworld(): String {
        return "/index.jsp"
    }
}