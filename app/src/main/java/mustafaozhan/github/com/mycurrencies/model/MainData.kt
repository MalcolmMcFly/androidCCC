package mustafaozhan.github.com.mycurrencies.model

import org.joda.time.Instant

/**
 * Created by Mustafa Ozhan on 2018-07-20.
 */
data class MainData(
    var firstRun: Boolean,
    var currentBase: Currencies,
    var adFreeActivatedDate: Instant?,
    var sliderShown: Boolean? = false
)
