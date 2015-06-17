package com.example.shreyansh.myapplication;

import android.util.Log;

public class Logger {
    private static boolean printLog = true;
    private static String TAG = "My Application";

    static public void log(String msg)
    {
        if(printLog)
        {
            Log.d(TAG, msg);
        }
    }
}
