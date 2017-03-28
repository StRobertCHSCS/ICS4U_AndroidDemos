package com.strobertchs.basicclasses;

/**
 * Created by eric on 2016-10-19.
 */

import android.util.Log;

public class Soldier {
    int health;
    String soldierType;

    void shootEnemy(){

        // print out which type of soldier is shooting
        Log.i(soldierType, " is shooting");

    }
}
