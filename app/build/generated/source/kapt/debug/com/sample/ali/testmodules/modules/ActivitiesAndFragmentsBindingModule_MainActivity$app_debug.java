package com.sample.ali.testmodules.modules;

import com.sample.ali.testmodules.ui.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivitiesAndFragmentsBindingModule_MainActivity$app_debug.MainActivitySubcomponent.class
)
public abstract class ActivitiesAndFragmentsBindingModule_MainActivity$app_debug {
  private ActivitiesAndFragmentsBindingModule_MainActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}