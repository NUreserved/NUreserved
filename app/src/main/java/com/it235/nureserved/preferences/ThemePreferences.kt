package com.it235.nureserved.preferences

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

// Use to to keep DataStore as a singleton
private val Context.dataStore by preferencesDataStore(name = "preferences")

class AppPreferences(private val context: Context) {
    private val THEME_KEY = intPreferencesKey("theme_option")

    val themeOption: Flow<ThemeOption> = context.dataStore.data
        .map { preferences ->
            val themeValue = preferences[THEME_KEY] ?: ThemeOption.SYSTEM.ordinal
            ThemeOption.values()[themeValue]
        }

    suspend fun saveThemeOption(themeOption: ThemeOption) {
        context.dataStore.edit { preferences ->
            preferences[THEME_KEY] = themeOption.ordinal
        }
    }
}

enum class ThemeOption {
    LIGHT, DARK, SYSTEM
}