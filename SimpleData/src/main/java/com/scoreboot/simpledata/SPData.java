package com.scoreboot.simpledata;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import java.util.Set;

public class SPData {
    private static SharedPreferences prefs = null;
    private static SharedPreferences.Editor prefsEditor = null;
    public static Context context = null;

    @SuppressLint("CommitPrefEdits")
    public static void init(Context context){
        SPData.context = context;
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
        prefsEditor = prefs.edit();
    }

    public static void setBoolean(String key, boolean value) {

        prefsEditor.putBoolean(key, value);
        prefsEditor.apply();
    }

    public static boolean getBoolean(String key, boolean def) {

        return prefs.getBoolean(key, def);
    }

    public static void setInteger(String key, int value) {

        prefsEditor.putInt(key, value);
        prefsEditor.apply();
    }

    public static int getInteger(String key, int def) {

        return prefs.getInt(key, def);
    }

    public static void setString(String key, String value) {

        prefsEditor.putString(key, value);
        prefsEditor.apply();
    }

    public static String getString(String key, String def) {

        return prefs.getString(key, def);
    }
    public static void setLong(String key, long value) {

        prefsEditor.putLong(key, value);
        prefsEditor.apply();
    }

    public static long getLong(String key, long def) {

        return prefs.getLong(key, def);
    }

    public static void setFloat(String key, float value) {

        prefsEditor.putFloat(key, value);
        prefsEditor.apply();
    }

    public static float getFloat(String key, float def) {

        return prefs.getFloat(key, def);
    }

    public static void setStringSet(String key, Set<String> value) {

        prefsEditor.putStringSet(key, value);
        prefsEditor.apply();
    }

    public static Set<String> getStingSet(String key, Set<String> def) {

        return prefs.getStringSet(key, def);
    }

}
