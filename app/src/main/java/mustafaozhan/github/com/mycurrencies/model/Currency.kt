package mustafaozhan.github.com.mycurrencies.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Mustafa Ozhan on 2018-07-16.
 */
@Entity(tableName = "currency")
data class Currency(
    @PrimaryKey @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "longName") var longName: String,
    @ColumnInfo(name = "symbol") var symbol: String,
    @ColumnInfo(name = "rate") var rate: Double = 0.0,
    @ColumnInfo(name = "isActive") var isActive: Int = 1
) {
    fun getVariablesOneLine() = "$name $longName $symbol"
}

data class CurrencyJson(
    var currencies: ArrayList<Currency>
)
