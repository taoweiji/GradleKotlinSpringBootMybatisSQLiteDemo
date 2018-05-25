package com.thejoyrun.webtest

import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.LoggerFactory
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * Created by Wiki on 2018/5/25.
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class LoggerTest {
    var logger = LoggerFactory.getLogger(LoggerTest::class.java)
    @Test
    fun test() {
        for (i in 0..10000){
            logger.error("i = $i")
            logger.info("i = $i")
        }

    }
}