package com.strobertchs.inheritance2;
import android.util.Log;

/**
 * Created by eric on 2016-11-11.
 */
public class Elephant extends Animal{

    public int trunkLength;

    public Elephant(int age, int weight){
        this.age = age;
        this.weight = weight;
        this.type = "Elephant";
        this.hungerLevel = 0;
    }

    public void stomp(){
        Log.i("Elephant", "STOMP!! STOMP!!");
    }



}
