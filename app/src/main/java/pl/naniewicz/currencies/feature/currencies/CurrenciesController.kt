package pl.naniewicz.currencies.feature.currencies

import dagger.Reusable
import io.reactivex.Observable
import pl.naniewicz.currencies.data.CurrencyRateApi
import pl.naniewicz.currencies.data.Rates
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@Reusable
class CurrenciesController @Inject constructor(private val currencyRateApi: CurrencyRateApi) {


    fun observeCurrencyRates():Observable<Rates> = TODO()

    companion object {
        private const val BASE_RATE = "PLN"
    }
}
