package com.example.secondexample;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static androidx.core.os.LocaleListCompat.create;

public class firstActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtName;
    private Button btnGoNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        edtName = findViewById(R.id.edtName);
        btnGoNext = findViewById(R.id.btnNext);
//        //.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        btnGoNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //view.getID() == R.id.btnNext
        if(edtName.getText().toString().trim().length() != 0)
        {
           //move to next screen
            Intent mIntent = new Intent(firstActivity.this, secondActivity.class);
            mIntent.putExtra("name", edtName.getText().toString());
            startActivity(mIntent);
        }else
        {
            //edtName.setError("Please Enter Name");
            showAlert();
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void showAlert()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setIcon(R.drawable.ic_launcher_background);
        alertDialogBuilder.setTitle("Login Error");
        alertDialogBuilder.setMessage("");
        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialogBuilder.setNegativeButtonIcon(getResources().getDrawable(R.drawable.ic_launcher_foreground));
        AlertDialog mAlertDialog = alertDialogBuilder.create();
        mAlertDialog.create();
    }
}
