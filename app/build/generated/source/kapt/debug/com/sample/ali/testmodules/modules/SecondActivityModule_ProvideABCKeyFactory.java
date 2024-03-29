// Generated by Dagger (https://dagger.dev).
package com.sample.ali.testmodules.modules;

import android.content.SharedPreferences;
import com.sample.ali.testmodules.datamodels.UserDataModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SecondActivityModule_ProvideABCKeyFactory implements Factory<UserDataModel> {
  private final SecondActivityModule module;

  private final Provider<SharedPreferences> preferenceProvider;

  public SecondActivityModule_ProvideABCKeyFactory(SecondActivityModule module,
      Provider<SharedPreferences> preferenceProvider) {
    this.module = module;
    this.preferenceProvider = preferenceProvider;
  }

  @Override
  public UserDataModel get() {
    return provideABCKey(module, preferenceProvider.get());
  }

  public static SecondActivityModule_ProvideABCKeyFactory create(SecondActivityModule module,
      Provider<SharedPreferences> preferenceProvider) {
    return new SecondActivityModule_ProvideABCKeyFactory(module, preferenceProvider);
  }

  public static UserDataModel provideABCKey(SecondActivityModule instance,
      SharedPreferences preference) {
    return Preconditions.checkNotNull(instance.provideABCKey(preference), "Cannot return null from a non-@Nullable @Provides method");
  }
}
