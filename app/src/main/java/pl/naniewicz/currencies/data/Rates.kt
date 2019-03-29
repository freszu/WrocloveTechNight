package pl.naniewicz.currencies.data

import com.squareup.moshi.JsonClass

typealias CurrencyName = String

@JsonClass(generateAdapter = true)
data class Rates(
    val base: CurrencyName,
    val rates: Map<CurrencyName, Double>
)
