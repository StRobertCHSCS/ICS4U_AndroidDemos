package com.strobertchs.classesdemo;

/**
 * Created by eric on 2017-04-27.
 */
public class Ranger {
    private int health;
    private int ammo;
    private String colour;



    public Ranger(String rcolour){
        colour = rcolour;
        health = 100;
        ammo = 500;
    }

    public int getHealth() {
        return health;
    }

    public int getAmmo() {
        return ammo;
    }

    public String getColour() {
        return colour;
    }


    public void shoot(Ranger other){
        ammo--;
        other.injure(1);
    }

    public void injure(int amount){
        health = health - amount;
    }


    public String toString(){
        return "Colour:";

    }
}
