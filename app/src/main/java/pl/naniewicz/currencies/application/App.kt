package pl.naniewicz.currencies.application

import dagger.android.DaggerApplication

class App : DaggerApplication() {
    override fun applicationInjector() =
        DaggerApplicationComponent.builder().applicationContext(this).build()
}
