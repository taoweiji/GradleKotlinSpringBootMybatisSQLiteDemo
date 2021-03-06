/**
 * @author geloin
 * *
 * @date 2012-5-5 上午10:26:34
 */
package com.thejoyrun.webtest.dao

import com.thejoyrun.webtest.model.User
import org.apache.ibatis.annotations.*
import org.springframework.stereotype.Repository


@Repository
interface UserRepository {

    @Select("SELECT * FROM User WHERE ID = #{id}")
    fun findById(@Param("id") integer: Int?): User

    @Select("SELECT * FROM User")
    fun findAll(): List<User>

    @Insert("INSERT INTO User(id,name) VALUES(#{id}, #{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    fun insert(user: User)
}
