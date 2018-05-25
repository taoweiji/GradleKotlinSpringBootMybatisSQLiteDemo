package com.thejoyrun.webtest.model

/**
 * Created by Wiki on 2018/4/26.
 */
class User {
    var id: Int = 0
    var name:String? = null

    constructor()

    constructor(id: Int, name: String?) {
        this.id = id
        this.name = name
    }
}
