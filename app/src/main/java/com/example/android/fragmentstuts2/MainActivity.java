package com.example.android.fragmentstuts2;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int i) {

        FragmentManager fragmentManager = getFragmentManager();

        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentById(R.id.fragment2);

fragmentB.changeData(i);







    }
}
