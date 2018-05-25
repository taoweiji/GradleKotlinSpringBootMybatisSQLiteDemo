package com.thejoyrun.webtest.controller

import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * Created by Wiki on 2018/5/25.
 */
@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserApiControllerTest {
    @Autowired
    lateinit var controller: UserApiController

    @Test
    @Throws(Exception::class)
    fun getUser() {
        val user = controller.getUser(1)
        assertNotNull(user)
        assertEquals(1, user.id)
        println("id:" + user.id + ",name:" + user.name)
    }
}