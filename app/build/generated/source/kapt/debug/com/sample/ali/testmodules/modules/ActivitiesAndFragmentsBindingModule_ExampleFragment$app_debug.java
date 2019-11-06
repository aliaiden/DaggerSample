package com.sample.ali.testmodules.modules;

import com.sample.ali.testmodules.ui.fragment.ExampleFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivitiesAndFragmentsBindingModule_ExampleFragment$app_debug.ExampleFragmentSubcomponent
          .class
)
public abstract class ActivitiesAndFragmentsBindingModule_ExampleFragment$app_debug {
  private ActivitiesAndFragmentsBindingModule_ExampleFragment$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(ExampleFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ExampleFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ExampleFragmentSubcomponent extends AndroidInjector<ExampleFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ExampleFragment> {}
  }
}
