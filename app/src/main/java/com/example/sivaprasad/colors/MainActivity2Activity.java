package com.example.sivaprasad.colors;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("ACTIVITY2", "Paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ACTIVITY2","Restarted");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ACTIVITY2","Started");
    }

    @Override
    protected  void onResume() {
        super.onResume();
        Log.d("ACTIVITY2","Resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ACTIVITY2","Stopped");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
