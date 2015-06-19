package com.example.shreyansh.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Activity3 extends Activity {

//    private int i =0;
//    private String count="dfg";
//    private static String TAG = "My Application";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Logger.log("no problem before super oncreate");
        super.onCreate(savedInstanceState);
        //Log.d(TAG, "activity started :)");
        Logger.log("oncreate 3");

        setContentView(R.layout.activity_main);
        String st = getIntent().getData().toString();
        TextView textViewToChange = (TextView) findViewById(R.id.hey);
        textViewToChange.setText(st);

/*        if (savedInstanceState == null) {
            Logger.log("count : " + i);
        }
        else
        {
            i = savedInstanceState.getInt(count);
            Logger.log("count :" + i);
        }
*/    }

    public void onClickButton(View v) {
        Intent myI = new Intent(this, MainActivity.class);
        //myI.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startService(new Intent(this, MyService.class));

        //myI.setFlags(Intent.FLAG_ACTIVITY_TASK_ON_HOME);
        //myI.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //myI.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //        myI.getIntExtra(count, i);

        startActivity(myI);

        ///line one
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

//        outState.putInt(count, i);

        //Logger.log("no problem before super onsaveinstancestate");
        super.onSaveInstanceState(outState);
        Logger.log("onsaveinstancestate 3");

//        Intent myI = new Intent(this, Activity2.class);
//        myI.getIntExtra(count, i);
//        startActivity(myI);

    }

/*
    @Override
    protected void onStart() {
        //Logger.log("no problem before super onstart");
        super.onStart();
        Logger.log("onstart 3");
    }

    @Override
    protected void onResume() {
        //Logger.log("no problem before super onresume");
        super.onResume();
        Logger.log("onresume 3");
    }

    @Override
    protected void onPause() {
        //Logger.log("no problem before super onpause");
        super.onPause();
        Logger.log("onpause 3");
    }
*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
/*
    @Override
    protected void onStop() {
        //Logger.log("no problem before super onstop");
        super.onStop();
        Logger.log("onstop 3");

    }

    @Override
    protected void onDestroy() {
        //Logger.log("no problem before super ondestroy");
        super.onDestroy();
        Logger.log("ondestroy 3");
    }*/
}
