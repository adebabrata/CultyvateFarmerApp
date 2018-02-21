package com.hexonglobal.apps.cultyvatefarmerapp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Hexon Global on 04/10/2017.
 */

public class SharedPrefs {

    final static String FileName = "CaptainCode";   //filename clarify ??

    public static String readSharedSetting(Context ctx, String settingName, String defaultValue) {
        SharedPreferences sharedPref = ctx.getSharedPreferences(FileName, Context.MODE_PRIVATE);
        return sharedPref.getString(settingName, defaultValue);
    }

    public static void saveSharedSetting(Context ctx, String settingName, String settingValue) {
        SharedPreferences sharedPref = ctx.getSharedPreferences(FileName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(settingName, settingValue);
        editor.apply();
    }

}
