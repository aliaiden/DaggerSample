package com.sample.ali.testmodules.modules

import android.content.Context
import android.content.SharedPreferences
import com.sample.ali.testmodules.MyApplication
import com.sample.ali.testmodules.datamodels.UserDataModel
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class AppModule {

    @Binds
    abstract fun provideContext(application: MyApplication): Context

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideSharedPreferences(context: Context): SharedPreferences =
            context.getSharedPreferences("MySharedPreferences", Context.MODE_PRIVATE)
    }
}