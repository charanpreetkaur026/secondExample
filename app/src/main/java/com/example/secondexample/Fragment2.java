package com.example.secondexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Fragment2 extends Fragment {

    private static final String FragmentTag = "Fragment 2";
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(FragmentTag, "onAttach invoked");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(FragmentTag, "onCreate invoked");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e(FragmentTag, "onCreateView invoked");
        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(FragmentTag, "onActivityCreated invoked");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(FragmentTag, "onStart invoked");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(FragmentTag, "onResume invoked");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(FragmentTag, "onPause invoked");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(FragmentTag, "onStop invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(FragmentTag, "onDestroy invoked");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(FragmentTag, "onDetach invoked");
    }




}