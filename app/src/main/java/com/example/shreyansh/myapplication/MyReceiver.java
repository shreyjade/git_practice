package com.example.shreyansh.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.example.shreyansh.myapplication.MY_INTENT")) {
            Logger.log("MY_INTENT fired !!");
        }
        /*else if (intent.getAction().equals("android.intent.action.SCREEN_OFF"))
        {
            Logger.log("SCREEN OFF !!");
        }*/
        else if (intent.getAction().equals("com.example.shreyansh.myapplication.MY_IN"))
            Logger.log("gfhfghj");
    }
}
