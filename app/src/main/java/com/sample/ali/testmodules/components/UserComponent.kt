package com.sample.ali.testmodules.components

import com.sample.ali.testmodules.datamodels.UserDataModel
import com.sample.ali.testmodules.modules.UserModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserModule::class])
interface UserComponent {
    fun inject(target: UserDataModel)
}