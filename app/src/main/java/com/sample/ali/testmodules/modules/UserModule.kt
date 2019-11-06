package com.sample.ali.testmodules.modules

import com.sample.ali.testmodules.datamodels.CompanyDataModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserModule {
    @Singleton
    @Provides
    fun provideCompanyDataModel(): CompanyDataModel = CompanyDataModel("HBL", "Bank")
}