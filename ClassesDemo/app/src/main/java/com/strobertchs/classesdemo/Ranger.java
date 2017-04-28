package com.strobertchs.classesdemo;

/**
 * Created by eric on 2017-04-27.
 */
public class Ranger {

    private int health;
    private int ammo;
    private String colour;
    private String gender;


    /**
     * Constructor with colour
     * @param rcolour The colour of the ranger
     */
    public Ranger(String rcolour){
        colour = rcolour;
        health = 100;
        ammo = 500;
    }

    /**
     * Constructor with colour, health and ammo
     * @param rcolour Colour of the Ranger
     * @param rHealth Initial health amount
     * @param rAmmo Initial ammo amount
     */
    public Ranger(String rcolour, int rHealth, int rAmmo){
        colour = rcolour;
        health = rHealth;
        ammo = rAmmo;
    }


    /**
     * Health getter
     * @return Health value
     */
    public int getHealth() {
        return health;
    }


    /**
     * Ammo getter
     * @return Ammo value
     */
    public int getAmmo() {
        return ammo;
    }

    /**
     * Colour getter
     * @return colour value i.e "Blue"
     */
    public String getColour() {
        return colour;
    }


    /**
     * Gender getter
     * @return Gender value, i.e "female"
     *
     */
    public String getGender() {
        return gender;
    }

    /**
     * Shoot another ranger
     * @param other The target Ranger
     */
    public void shoot(Ranger other){
        ammo--;
        other.injure(1);
    }

    /**
     * Ranger gets hurt
     * @param amount Decrement value for health
     */
    public void injure(int amount){
        health = health - Math.abs(amount);
    }

    
}
