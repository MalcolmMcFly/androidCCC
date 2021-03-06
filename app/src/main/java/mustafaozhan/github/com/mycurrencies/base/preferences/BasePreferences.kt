package mustafaozhan.github.com.mycurrencies.base.preferences

import android.content.Context
import android.content.SharedPreferences
import mustafaozhan.github.com.mycurrencies.app.CCCApplication

/**
 * Created by Mustafa Ozhan on 7/10/18 at 9:42 PM on Arch Linux wit Love <3.
 */
abstract class BasePreferences {

    protected abstract val preferencesName: String

    protected fun getStringEntry(key: String, defaultValue: String = ""): String? {
        return getSharedPreferences().getString(key, defaultValue)
    }

    protected fun setStringEntry(key: String, value: String) {
        val prefsEditor = getPreferencesEditor()
        prefsEditor.putString(key, value)
        prefsEditor.commit()
    }

    protected fun setBooleanEntry(key: String, value: Boolean) {
        getPreferencesEditor().putBoolean(key, value).commit()
    }

    protected fun getBooleanEntry(key: String, defaultValue: Boolean = false): Boolean {
        return getSharedPreferences().getBoolean(key, defaultValue)
    }

    private fun getPreferencesEditor(): SharedPreferences.Editor {

        val prefs = CCCApplication.instance.getSharedPreferences(preferencesName, Context.MODE_PRIVATE)
        return prefs.edit()
    }

    private fun getSharedPreferences(): SharedPreferences {
        return CCCApplication.instance.getSharedPreferences(preferencesName, Context.MODE_PRIVATE)
    }
}
