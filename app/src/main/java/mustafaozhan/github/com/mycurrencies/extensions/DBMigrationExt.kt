package mustafaozhan.github.com.mycurrencies.extensions

import androidx.sqlite.db.SupportSQLiteDatabase

fun SupportSQLiteDatabase.execSQL1To2() {
    execSQL("INSERT INTO currency (name,longName,symbol,rate,isActive)" +
        " VALUES ('VES','Venezuelan bolívar soberano','Bs.',0.0,0)")
    execSQL("ALTER TABLE offline_rates ADD COLUMN VES REAL DEFAULT 0.0")
}

fun SupportSQLiteDatabase.execSQL2To3() {
    execSQL("ALTER TABLE offline_rates ADD COLUMN date TEXT DEFAULT null")
}
