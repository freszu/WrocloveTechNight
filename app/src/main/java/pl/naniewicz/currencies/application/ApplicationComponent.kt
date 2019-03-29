package pl.naniewicz.currencies.application

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import pl.naniewicz.currencies.data.ApiDataModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        NetModule::class,
        ApiDataModule::class,
        ViewModelModule::class,
        ActivitiesModule::class,
        FragmentsModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<App> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun applicationContext(applicationContext: Context): Builder

        fun build(): ApplicationComponent
    }
}
