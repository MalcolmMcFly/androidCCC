package mustafaozhan.github.com.mycurrencies.ui.main.fragment.calculator

import mustafaozhan.github.com.mycurrencies.model.Rates

sealed class CalculatorViewState {

    object Loading : CalculatorViewState()

    data class Success(val rates: Rates) : CalculatorViewState()

    data class OfflineSuccess(val rates: Rates) : CalculatorViewState()

    object Error : CalculatorViewState()

    object MaximumInput : CalculatorViewState()

    object FewCurrency : CalculatorViewState()
}
