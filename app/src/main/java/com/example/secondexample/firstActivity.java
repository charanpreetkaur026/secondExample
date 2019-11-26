package com.example.secondexample;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class firstActivity extends AppCompatActivity implements View.OnClickListener {
   // public  static final String
    private EditText edtName;
    private Button btnGoNext;
    private ToggleButton toggleButton;
    private TextView txtChangeColor;
    private Switch switchRem;
    private TextView txtSwicthColor;


    // onCreate()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Activity 1","onCreate invoked");
        setContentView(R.layout.activity_first);
        edtName = findViewById(R.id.edtName);
        btnGoNext = findViewById(R.id.btnNext);
        toggleButton =findViewById(R.id.toggleBtn);
        txtChangeColor = findViewById(R.id.txtColor);
        switchRem = findViewById(R.id.switchRemember);

//        //.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        if (savedInstanceState == null){
//            PracticeFragment practiceFragment = new PracticeFragment();
//            FragmentManager fragmentManager = getSupportFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            fragmentTransaction.add(R.id.toggleBtn,practiceFragment);
//            fragmentTransaction.addToBackStack(null);
//            fragmentTransaction.commit();
//
//        }
        switchRem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    txtChangeColor.setBackgroundColor(Color.YELLOW);
                    txtChangeColor.setTextColor(Color.BLUE);
                }else{
                    txtChangeColor.setBackgroundColor(Color.GREEN);
                    txtChangeColor.setTextColor(Color.RED);
                }
            }
        });

        btnGoNext.setOnClickListener(this);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    txtChangeColor.setBackgroundColor(Color.YELLOW);
                    txtChangeColor.setTextColor(Color.BLUE);
                }else{
                    txtChangeColor.setBackgroundColor(Color.GREEN);
                    txtChangeColor.setTextColor(Color.RED);
                }
            }
        });

    }
    //onStart


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity 1","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity 1", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity 1", "onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity 1", "onStop invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity 1", "onDestroy invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity 1", "onRestart invoked");
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
            edtName.setError("Please Enter Name");
            showAlert();
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void showAlert()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setIcon(R.drawable.ic_launcher_background);
        alertDialogBuilder.setTitle("Login Error");
        alertDialogBuilder.setMessage("Please enter your name!!!");
        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialogBuilder.setNegativeButtonIcon(getResources().getDrawable(R.drawable.ic_launcher_foreground));
        AlertDialog mAlertDialog = alertDialogBuilder.create();
        mAlertDialog.show();
    }
}
