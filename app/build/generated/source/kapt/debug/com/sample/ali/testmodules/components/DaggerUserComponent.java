// Generated by Dagger (https://dagger.dev).
package com.sample.ali.testmodules.components;

import com.sample.ali.testmodules.datamodels.CompanyDataModel;
import com.sample.ali.testmodules.datamodels.UserDataModel;
import com.sample.ali.testmodules.datamodels.UserDataModel_MembersInjector;
import com.sample.ali.testmodules.modules.UserModule;
import com.sample.ali.testmodules.modules.UserModule_ProvideCompanyDataModelFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerUserComponent implements UserComponent {
  private Provider<CompanyDataModel> provideCompanyDataModelProvider;

  private DaggerUserComponent(UserModule userModuleParam) {

    initialize(userModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static UserComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final UserModule userModuleParam) {
    this.provideCompanyDataModelProvider = DoubleCheck.provider(UserModule_ProvideCompanyDataModelFactory.create(userModuleParam));
  }

  @Override
  public void inject(UserDataModel target) {
    injectUserDataModel(target);}

  private UserDataModel injectUserDataModel(UserDataModel instance) {
    UserDataModel_MembersInjector.injectCompany(instance, provideCompanyDataModelProvider.get());
    return instance;
  }

  public static final class Builder {
    private UserModule userModule;

    private Builder() {
    }

    public Builder userModule(UserModule userModule) {
      this.userModule = Preconditions.checkNotNull(userModule);
      return this;
    }

    public UserComponent build() {
      if (userModule == null) {
        this.userModule = new UserModule();
      }
      return new DaggerUserComponent(userModule);
    }
  }
}