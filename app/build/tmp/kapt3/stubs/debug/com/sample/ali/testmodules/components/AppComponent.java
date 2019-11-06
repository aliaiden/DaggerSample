package com.sample.ali.testmodules.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&\u00a8\u0006\t"}, d2 = {"Lcom/sample/ali/testmodules/components/AppComponent;", "Ldagger/android/AndroidInjector;", "Ldagger/android/DaggerApplication;", "inject", "", "application", "Lcom/sample/ali/testmodules/MyApplication;", "instance", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.sample.ali.testmodules.modules.ActivitiesAndFragmentsBindingModule.class, com.sample.ali.testmodules.modules.AppModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<dagger.android.DaggerApplication> {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.sample.ali.testmodules.MyApplication application);
    
    @java.lang.Override()
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    dagger.android.DaggerApplication instance);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/sample/ali/testmodules/components/AppComponent$Builder;", "", "application", "Lcom/sample/ali/testmodules/MyApplication;", "build", "Lcom/sample/ali/testmodules/components/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.sample.ali.testmodules.components.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        com.sample.ali.testmodules.MyApplication application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.sample.ali.testmodules.components.AppComponent build();
    }
}