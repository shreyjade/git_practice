package com.example.shreyansh.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    //    private int i =0;
//    private String count="dfg";
//    private static String TAG = "My Application";
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Logger.log("no problem before super oncreate");
        super.onCreate(savedInstanceState);
        //Log.d(TAG, "activity started :)");
        Logger.log("oncreate 1");
        setContentView(R.layout.activity_main);
        in = getIntent();

        if (in.getAction().equals("android.intent.action.MAIN")) {
            TextView textViewToChange = (TextView) findViewById(R.id.hey);
            textViewToChange.setText("Good Morning Everyone !!");
        } else {
            String msg = in.getData().toString();
            TextView textViewToChange = (TextView) findViewById(R.id.hey);
            textViewToChange.setText(msg);
        }

        if (savedInstanceState == null) {
            TextView textViewToChange = (TextView) findViewById(R.id.hey);
            textViewToChange.setText("Good Morning Everyone !!");
        } else {
            String msg = in.getData().toString();
            TextView textViewToChange = (TextView) findViewById(R.id.hey);
            textViewToChange.setText(msg);
        }
    }

    public void onClickButton(View v) {
        Intent myI = new Intent(getBaseContext(), MainActivity.class);
        Logger.log("click button 1");

        if (in.getData().toString().equals("Good Morning Everyone !!"))
            myI.setData(Uri.parse("Good Evening Everyone !!"));
        else if (in.getData().toString().equals("Good Evening Everyone !!"))
            myI.setData(Uri.parse("Good Night Everyone !!"));
        else if (in.getData().toString().equals("Good Night Everyone !!"))
            myI.setData(Uri.parse("Good Morning Everyone !!"));
        else {

            Logger.log("fdgdfgdfgf1");
            myI.setData(Uri.parse("Good Evening Everyone !!"));
        }
        Logger.log("click button 2");
        startActivity(myI);
        Logger.log("click button 3");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
//        i++;
//        outState.putInt(count, i);

        //Logger.log("no problem before super onsaveinstancestate");
        super.onSaveInstanceState(outState);
        Logger.log("onsaveinstancestate 1");

//        Intent myI = new Intent(this, Activity2.class);
//        myI.getIntExtra(count, i);
//        startActivity(myI);

    }

    @Override
    protected void onStart() {
        //Logger.log("no problem before super onstart");
        super.onStart();
        Logger.log("onstart 1");
    }

    @Override
    protected void onResume() {
        //Logger.log("no problem before super onresume");
        super.onResume();
        Logger.log("onresume 1");
    }

    @Override
    protected void onPause() {
        //Logger.log("no problem before super onpause");
        super.onPause();
        Logger.log("onpause 1");
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

    @Override
    protected void onStop() {
        //Logger.log("no problem before super onstop");
        super.onStop();
        Logger.log("onstop 1");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.log("restart 1");
    }

    @Override
    protected void onDestroy() {
        //Logger.log("no problem before super ondestroy");
        super.onDestroy();
        Logger.log("ondestroy 1");
    }
}
