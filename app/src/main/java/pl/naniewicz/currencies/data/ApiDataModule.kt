package pl.naniewicz.currencies.data

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ApiDataModule {
    @Singleton
    @Provides
    fun provideRestApi(retrofit: Retrofit): CurrencyRateApi = retrofit.create(CurrencyRateApi::class.java)
}
