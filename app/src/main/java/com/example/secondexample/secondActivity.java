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
        setContentView(R.layout.activity_second);

        Bundle mbundle = getIntent().getExtras();
        if(mbundle != null){
            String name = mbundle.getString("name");
            Log.d("NAME", name);
        }
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
