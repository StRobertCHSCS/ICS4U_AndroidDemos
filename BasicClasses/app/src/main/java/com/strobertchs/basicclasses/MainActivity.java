package com.strobertchs.basicclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Soldier rambo = new Soldier();
        rambo.soldierType = "Green Beret";
        rambo.health = 150;
        // it take a lot to kill Rambo


    }



}
