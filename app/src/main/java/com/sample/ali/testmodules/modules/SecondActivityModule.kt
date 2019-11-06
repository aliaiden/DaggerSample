package com.sample.ali.testmodules.modules

import android.content.SharedPreferences
import com.sample.ali.testmodules.datamodels.UserDataModel
import com.sample.ali.testmodules.ui.SecondActivity
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap


@Module
class SecondActivityModule {
//    @Provides
//    fun provideUserDataModel(): UserDataModel {
//        return UserDataModel()
//    }

    @Provides
    fun provideABCKey(preference: SharedPreferences): UserDataModel {
        return UserDataModel(name = preference.getString("savedName", "Haider").toString())
    }

}