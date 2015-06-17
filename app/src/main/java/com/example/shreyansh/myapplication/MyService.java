package com.example.shreyansh.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {

    public MyService() {

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.log("Service created !!");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Logger.log("service started !!");
       /* int a, b=10;
        while (b>5)
        {
            a=10;
        }
*/
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
            while(true){}
            }
        });
        t.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logger.log("Service destroyed !!");
    }
}