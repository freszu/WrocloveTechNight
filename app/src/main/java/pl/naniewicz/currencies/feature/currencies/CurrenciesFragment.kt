package pl.naniewicz.currencies.feature.currencies

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import pl.naniewicz.currencies.R
import pl.naniewicz.currencies.base.BaseFragment
import javax.inject.Inject


class CurrenciesFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_currencies, container, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = viewModelFactory.create(CurrenciesViewModel::class.java)
        viewModel.ratesLiveDate.observe(this, Observer {
            Log.d(TAG, "rates:$it")
            Snackbar.make(view!!, "Rates available", Snackbar.LENGTH_LONG).show()
        })
    }

    companion object {
        private const val TAG = "CurrenciesFragment"
    }
}
