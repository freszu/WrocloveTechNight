package pl.naniewicz.currencies.application

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.naniewicz.currencies.application.scope.FragmentScope
import pl.naniewicz.currencies.feature.currencies.CurrenciesFragment


@Module
abstract class FragmentsModule {
    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeActivityAndroidInjector(): CurrenciesFragment

}
