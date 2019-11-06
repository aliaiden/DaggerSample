package com.sample.ali.testmodules.modules;

import com.sample.ali.testmodules.daggerscope.PerActivity;
import com.sample.ali.testmodules.ui.SecondActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivitiesAndFragmentsBindingModule_SecondActivity$app_debug.SecondActivitySubcomponent.class
)
public abstract class ActivitiesAndFragmentsBindingModule_SecondActivity$app_debug {
  private ActivitiesAndFragmentsBindingModule_SecondActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(SecondActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SecondActivitySubcomponent.Factory builder);

  @Subcomponent(modules = SecondActivityModule.class)
  @PerActivity
  public interface SecondActivitySubcomponent extends AndroidInjector<SecondActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SecondActivity> {}
  }
}
