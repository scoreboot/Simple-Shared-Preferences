package com.scoreboot.simpledata;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

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
}
