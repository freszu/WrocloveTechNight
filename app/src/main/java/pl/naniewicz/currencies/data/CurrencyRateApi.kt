package pl.naniewicz.currencies.data

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyRateApi {

    @GET("latest")
    fun getRates(@Query("base") base: CurrencyName): Single<Rates>
}
