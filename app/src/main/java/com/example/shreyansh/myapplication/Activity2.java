package com.example.shreyansh.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Activity2 extends Activity {

//    private int i =0;
//    private String count="dfg";
//    private static String TAG = "My Application";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Logger.log("no problem before super oncreate");
        super.onCreate(savedInstanceState);
        //Log.d(TAG, "activity started :)");
        Logger.log("oncreate 2");

        setContentView(R.layout.activity_main);

        TextView textViewToChange = (TextView) findViewById(R.id.hey);
        textViewToChange.setText("Good Evening");

   }

    public void onClickButton(View v) {
        Intent myI = new Intent(this, Activity3.class);
//        myI.getIntExtra(count, i);
        startActivity(myI);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
//        i++;
//        outState.putInt(count, i);

        //Logger.log("no problem before super onsaveinstancestate");
        super.onSaveInstanceState(outState);
        Logger.log("onsaveinstancestate 2");

//        Intent myI = new Intent(this, Activity2.class);
//        myI.getIntExtra(count, i);
//        startActivity(myI);

    }

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
}
