package com.sample.ali.testmodules.datamodels

import com.sample.ali.testmodules.components.DaggerUserComponent
import com.sample.ali.testmodules.components.UserComponent
import javax.inject.Inject


class UserDataModel {

    var name: String
    var gender: String

    @Inject
    lateinit var company: CompanyDataModel

    init {
        DaggerUserComponent.builder().build().inject(this)
    }

    constructor(name: String = "Ali", gender: String = "male") {
        this.name = name
        this.gender = gender
    }
}
