package ru.korotkov.electronicdocuments;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    static SharedPreferences pref;
    static SharedPreferences.Editor editor;
    static Context _context;

    public static final String PREF_NAME = "ele";

    public static void init(Context context) {
        _context = context;
        pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = pref.edit();
    }


    public static void setString(String tag, String value) {
        editor.putString(tag, value);
        editor.commit();
    }

    public static String getString(String tag) {
        return pref.getString(tag, "");
    }

}
