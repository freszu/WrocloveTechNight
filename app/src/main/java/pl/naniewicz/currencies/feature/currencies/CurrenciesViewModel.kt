package pl.naniewicz.currencies.feature.currencies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import pl.naniewicz.currencies.common.toLiveData
import pl.naniewicz.currencies.data.CurrencyRateApi
import pl.naniewicz.currencies.data.Rates
import javax.inject.Inject


class CurrenciesViewModel @Inject constructor(currencyApi: CurrencyRateApi) : ViewModel() {

    val ratesLiveDate: LiveData<Rates> = currencyApi.getRates("PLN")
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .toFlowable()
        .toLiveData()

}

