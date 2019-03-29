package pl.naniewicz.currencies.application

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.naniewicz.currencies.MainActivity
import pl.naniewicz.currencies.application.scope.ActivityScope

@Module
abstract class ActivitiesModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeActivityAndroidInjector(): MainActivity

}
