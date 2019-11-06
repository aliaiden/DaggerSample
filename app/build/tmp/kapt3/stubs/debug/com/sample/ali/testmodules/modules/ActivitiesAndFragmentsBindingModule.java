package com.sample.ali.testmodules.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H!\u00a2\u0006\u0002\b\bJ\r\u0010\t\u001a\u00020\nH!\u00a2\u0006\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/sample/ali/testmodules/modules/ActivitiesAndFragmentsBindingModule;", "", "()V", "exampleFragment", "Lcom/sample/ali/testmodules/ui/fragment/ExampleFragment;", "exampleFragment$app_debug", "mainActivity", "Lcom/sample/ali/testmodules/ui/MainActivity;", "mainActivity$app_debug", "secondActivity", "Lcom/sample/ali/testmodules/ui/SecondActivity;", "secondActivity$app_debug", "app_debug"})
@dagger.Module()
public abstract class ActivitiesAndFragmentsBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.sample.ali.testmodules.ui.MainActivity mainActivity$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.sample.ali.testmodules.modules.SecondActivityModule.class})
    @com.sample.ali.testmodules.daggerscope.PerActivity()
    public abstract com.sample.ali.testmodules.ui.SecondActivity secondActivity$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.sample.ali.testmodules.ui.fragment.ExampleFragment exampleFragment$app_debug();
    
    public ActivitiesAndFragmentsBindingModule() {
        super();
    }
}