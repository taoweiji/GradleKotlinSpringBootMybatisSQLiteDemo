package com.thejoyrun.webtest.controller

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.context.junit4.SpringRunner
import java.net.URL
import org.hamcrest.Matchers.*

/**
 * Created by Wiki on 2018/5/25.
 */
@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserApiControllerTemplateTest {

    @LocalServerPort
    var port: Int = 0

    lateinit var base: URL

    @Autowired
    lateinit var template: TestRestTemplate


    @Before
    @Throws(Exception::class)
    fun setUp() {
        this.base = URL("http://localhost:$port/")
    }

    @Test
    @Throws(Exception::class)
    fun getUser() {
        val response = template.getForEntity(base.toString() + "api/getUser?id=1",String::class.java)
        assertThat(response.body, equalTo<String>("{\"id\":1,\"name\":\"Wiki\"}"))
    }
}