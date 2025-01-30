package edu.houghton.code.week3;

/**
 * Name : Logan Kaminski
 * Course: CSCI 218 - Programming II
 */
public class Animal {
    private float mass;
    private String name;
    private int legs;
    private boolean isAlive;
    
    public static int counter = 0;
    public static int animalsAlive = 0;
    
    public Animal(String name) {
        this.name = name;
        isAlive = true;
        animalsAlive++;
        counter++;
        legs = 0;
        mass = 0f;
    }
    
    public Animal(float mass, String name, int legs) {
        this.mass = mass;
        this.name = name;
        this.legs = legs;
        isAlive = true;
        animalsAlive++;
        counter++;
    }
    
    public void setMass(float mass) {
        this.mass = mass;
    }
    
    public float getMass() {
        return mass;
    }
    public boolean getIsAlive() {
        return isAlive;
    }
    public int getLegs() {
        return legs;
    }
    public String getName() {
        return name;
    }
    
    public String print() {
        return "animal (name=" + getName() + ", mass=" + getMass()
                + ", legs=" + getLegs() + ", " + "status=" + (getIsAlive() ? "Alive" : "Dead");
    }
    
    public static int getAnimalPopulation() {
        return counter;
    }
    public static int getAnimalsAlive() {
        return animalsAlive;
    }
    
    public Animal reproduce() {
        return new Animal(getMass()/2.0f, getName(), getLegs());
    }
    public void die() {
        isAlive = false;
        animalsAlive--;
    }

}
