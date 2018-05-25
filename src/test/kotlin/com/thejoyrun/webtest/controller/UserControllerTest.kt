package com.thejoyrun.webtest.controller

import com.thejoyrun.webtest.model.User
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.ResponseEntity
import org.springframework.test.context.junit4.SpringRunner

/**
 * Created by Wiki on 2018/5/25.
 */
@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @Autowired
    lateinit var controller: UserController

    @Test
    @Throws(Exception::class)
    fun show() {
        val map = HashMap<String, Any>()
        controller.show(map, 1)
        val user = map["user"] as User
        assertNotNull(user)
        assertEquals(1, user.id)
        println("id:" + user.id + ",name:" + user.name)
    }
}