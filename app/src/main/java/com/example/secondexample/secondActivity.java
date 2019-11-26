package com.example.secondexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Activity 2", "onCreate invoked");
        setContentView(R.layout.activity_second);

        Bundle mbundle = getIntent().getExtras();
        if(mbundle != null){
            String name = mbundle.getString("name");
            Log.d("NAME", name);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity 2", "onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity 2", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity 2","onPause invoked ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity 2", "onStop invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity 2", "onDestroy invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity 2", "onRestart invoked");
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        showAlert();
    }
    private void showAlert(){
        AlertDialog.Builder alertDailogBuilder = new AlertDialog.Builder(this);
       // alertDailogBuilder.setIcon(R.drawable.);
        alertDailogBuilder.setTitle("Back");
        alertDailogBuilder.setMessage("Are you sure to go back?");
        alertDailogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDailogBuilder.setNegativeButtonIcon(getResources().getDrawable(R.drawable.ic_launcher_foreground));
        AlertDialog mAlertDialog = alertDailogBuilder.create();
        mAlertDialog.show();
    }
}
