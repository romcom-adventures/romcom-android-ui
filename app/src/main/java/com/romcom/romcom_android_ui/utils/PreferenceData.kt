package com.romcom.romcom_android_ui.utils

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor


class PreferenceData {

  /**
   *Preference Keys
   */
  enum class Key {
    TOKEN("TOKEN", "");


    val key: String
    val defaultValue: Any

    /**
     * Constructor
     */
    constructor(key: String, defaultValue: Any) {
      this.key = key
      this.defaultValue = defaultValue
    }
  }

  companion object {
    private val STORE = "STORE"

    //==================================================================================================================
    //==================================================================================================================
    //==================================================================================================================

    /**
     * Method to get Boolean Value
     *
     * @param context
     * @param key Pref Key
     * @return default FALSE
     */
    fun getBoolean(context: Context, key: Key): Boolean {
      try {
        return getShearedPreference(context).getBoolean(key.key, key.defaultValue as Boolean)
      } catch (e: Exception) {
        return false
      }
    }

    /**
     * Method to set Boolean Value
     *
     * @param context
     * @param key Pref Key
     * @param value Boolean value set for key
     */
    fun setBoolean(context: Context, key: Key, value: Boolean) {
      getShearedPreferenceEditor(context).putBoolean(key.key, value).commit()
    }

    //==================================================================================================================
    //==================================================================================================================
    //==================================================================================================================

    /**
     * Method to get String Value
     *
     * @param context
     * @param key Pref Key
     * @return default ""
     */
    fun getString(context: Context, key: Key): String {
      try {
        return (getShearedPreference(context).getString(key.key, key.defaultValue as String?) ?: "").trim()
      } catch (e: Exception) {
        return ""
      }
    }

    /**
     * Method to set String Value
     *
     * @param context
     * @param key Pref Key
     * @param value String value set for key
     */
    fun setString(context: Context, key: Key, value: String) {
      getShearedPreferenceEditor(context).putString(key.key, value).commit()
    }

    //==================================================================================================================
    //==================================================================================================================
    //==================================================================================================================

    /**
     * Method to get Float Value
     *
     * @param context
     * @param key Pref Key
     * @return default 0
     */
    fun getFloat(context: Context, key: Key): Float {
      try {
        return getShearedPreference(context).getFloat(key.key, key.defaultValue as Float)
      } catch (e: Exception) {
        return 0F
      }
    }

    /**
     * Method to set Float Value
     *
     * @param context
     * @param key Pref Key
     * @param value Float value set for key
     */
    fun setFloat(context: Context, key: Key, value: Float) {
      getShearedPreferenceEditor(context).putFloat(key.key, value).commit()
    }

    //==================================================================================================================
    //==================================================================================================================
    //==================================================================================================================

    /**
     * Method to get Int Value
     *
     * @param context
     * @param key Pref Key
     * @return default 0
     */
    fun getInt(context: Context, key: Key): Int {
      try {
        return getShearedPreference(context).getInt(key.key, key.defaultValue as Int)
      } catch (e: Exception) {
        return 0
      }
    }

    /**
     * Method to set Int Value
     *
     * @param context
     * @param key Pref Key
     * @param value Int value set for key
     */
    fun setInt(context: Context, key: Key, value: Int) {
      getShearedPreferenceEditor(context).putInt(key.key, value).commit()
    }

    //==================================================================================================================
    //==================================================================================================================
    //==================================================================================================================

    /**
     * Method to get Long Value
     *
     * @param context
     * @param key Pref Key
     * @return default 0
     */
    fun getLong(context: Context, key: Key): Long {
      try {
        return getShearedPreference(context).getLong(key.key, key.defaultValue as Long)
      } catch (e: Exception) {
        return 0
      }
    }

    /**
     * Method to set Long Value
     *
     * @param context
     * @param key Pref Key
     * @param value Long value set for key
     */
    fun setLong(context: Context, key: Key, value: Long) {
      getShearedPreferenceEditor(context).putLong(key.key, value).commit()
    }

    //==================================================================================================================
    //==================================================================================================================
    //==================================================================================================================

    /**
     * Method to clear the Data Store
     *
     * @param context
     */
    fun clearStore(context: Context) {
      getShearedPreferenceEditor(context).clear().commit()
    }

    /**
     * Method to return the Data Store Prefference
     *
     * @param context
     * @return
     */
    private fun getShearedPreference(context: Context): SharedPreferences {
      return context.getSharedPreferences(STORE, Context.MODE_PRIVATE)
    }

    /**
     * caller to commit this editor
     *
     * @param context
     * @return Editor
     */
    private fun getShearedPreferenceEditor(context: Context): Editor {
      return getShearedPreference(context).edit()
    }
  }
}