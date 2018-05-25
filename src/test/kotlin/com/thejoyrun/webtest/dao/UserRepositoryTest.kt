//package com.thejoyrun.webtest.dao
//
//import com.thejoyrun.webtest.dao.UserRepository
//import com.thejoyrun.webtest.model.User
//import org.json.JSONArray
//import org.junit.Assert.assertEquals
//import org.junit.Assert.assertNotNull
//import org.junit.Before
//import org.junit.Test
//import org.junit.runner.RunWith
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.context.SpringBootTest
//import org.springframework.boot.test.web.client.TestRestTemplate
//import org.springframework.boot.web.server.LocalServerPort
//import org.springframework.http.ResponseEntity
//import org.springframework.test.context.junit4.SpringRunner
//
///**
// * Created by Wiki on 2018/5/25.
// */
//@RunWith(SpringRunner::class)
//@SpringBootTest
//class UserRepositoryTest {
//
//    @Autowired
//    lateinit var repository: UserRepository
//
//    @Test
//    @Throws(Exception::class)
//    fun findById() {
//        val user = repository.findById(1)
//        assertNotNull(user)
//        assertEquals(1, user.id)
//        println("id:" + user.id + ",name:" + user.name)
//    }
//    @Test
//    @Throws(Exception::class)
//    fun findAll() {
//        val users = repository.findAll()
//        users.forEach { println(it.id) }
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun insert() {
//        val user = User(1, "Wiki")
//        repository.insert(user)
//    }
//}