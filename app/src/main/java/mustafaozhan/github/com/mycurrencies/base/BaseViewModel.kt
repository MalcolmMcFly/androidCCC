package mustafaozhan.github.com.mycurrencies.base

import androidx.lifecycle.ViewModel
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import mustafaozhan.github.com.mycurrencies.data.repository.PreferencesRepository
import mustafaozhan.github.com.mycurrencies.extensions.applySchedulers
import mustafaozhan.github.com.mycurrencies.model.Currencies
import org.joda.time.Duration
import org.joda.time.Instant

/**
 * Created by Mustafa Ozhan on 7/10/18 at 9:40 PM on Arch Linux wit Love <3.
 */
abstract class BaseViewModel : ViewModel() {

    companion object {
        const val NUMBER_OF_HOURS = 24
    }

    abstract val preferencesRepository: PreferencesRepository
    private val compositeDisposable by lazy { CompositeDisposable() }

    protected fun <T> subscribeService(
        serviceObservable: Observable<T>,
        onNext: (T) -> Unit,
        onError: (Throwable) -> Unit
    ) = compositeDisposable.add(
        serviceObservable.applySchedulers().subscribe(onNext, onError)
    )

    abstract fun onLoaded(): Completable

    override fun onCleared() {
        compositeDisposable.clear()
        compositeDisposable.dispose()
        super.onCleared()
    }

    open fun setCurrentBase(newBase: String?) {
        preferencesRepository.updateMainData(currentBase = Currencies.valueOf(newBase ?: "NULL"))
    }

    open fun isSliderShown() = preferencesRepository.loadMainData().sliderShown

    open fun setSliderShown() {
        preferencesRepository.updateMainData(sliderShown = true)
    }

    open fun getMainData() = preferencesRepository.loadMainData()

    open fun isRewardExpired() = preferencesRepository.loadMainData().adFreeActivatedDate?.let {
        Duration(it, Instant.now()).standardHours > NUMBER_OF_HOURS
    } ?: true
}
