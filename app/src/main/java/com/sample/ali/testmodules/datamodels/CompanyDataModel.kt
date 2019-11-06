package com.sample.ali.testmodules.datamodels

class CompanyDataModel {
    var name: String
    var category: String

    constructor(name: String = "HBL", category: String = "Bank") {
        this.name = name
        this.category = category
    }
}