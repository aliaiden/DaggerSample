package com.sample.ali.testmodules.modules

import com.sample.ali.testmodules.daggerscope.PerActivity
import com.sample.ali.testmodules.ui.MainActivity
import com.sample.ali.testmodules.ui.SecondActivity
import com.sample.ali.testmodules.ui.fragment.ExampleFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesAndFragmentsBindingModule {

    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [SecondActivityModule::class])
    internal abstract fun secondActivity(): SecondActivity

    @ContributesAndroidInjector
    internal abstract fun exampleFragment(): ExampleFragment

}