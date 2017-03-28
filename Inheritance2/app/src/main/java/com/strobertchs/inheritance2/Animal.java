package com.strobertchs.inheritance2;

/**
 * Created by eric on 2016-11-11.
 */
public class Animal {

    public int age;
    public int weight;
    public String type;
    public int hungerLevel;

    public void eat(){
        hungerLevel--;
    }

}
