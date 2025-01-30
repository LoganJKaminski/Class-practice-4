package edu.houghton.code.week3;

/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 */

public class TestAnimal {
    public static void main(String[] args) {
        Animal snail = new Animal(3.5f, "snail", 1);
        System.out.println("Population: " + Animal.getAnimalPopulation()
            + ", Animals alive: " + Animal.getAnimalsAlive());
        Animal cat = new Animal("cat");
        System.out.println(cat.print());
        System.out.println("Population: " + Animal.getAnimalPopulation()
            + ", Animals alive: " + Animal.getAnimalsAlive());
        cat.setMass(4.2f);
        Animal dog = new Animal(2.1f, "dog", 4);
        System.out.println(dog.print());
        System.out.println("Population: " + Animal.getAnimalPopulation()
            + ", Animals alive: " + Animal.getAnimalsAlive());
        Animal babyAnimal1;
        Animal babyAnimal2;
        babyAnimal1 = cat.reproduce();
        babyAnimal2 = dog.reproduce();
        snail.die();
        System.out.println("Population: " + Animal.getAnimalPopulation()
            + ", Animals alive: " + Animal.getAnimalsAlive());
        babyAnimal1.counter = 500;
        System.out.println("Population: " + babyAnimal2.getAnimalPopulation()
            + ", Animals alive: " + babyAnimal2.getAnimalsAlive());
        Animal.counter = 15;
        System.out.println("Population: " + babyAnimal2.getAnimalPopulation()
            + ", Animals alive: " + babyAnimal2.getAnimalsAlive());
        cat.die();
        dog.die();
        babyAnimal1.die();
        babyAnimal2.die();
        System.out.println("Population: " + babyAnimal2.getAnimalPopulation()
            + ", Animals alive: " + babyAnimal2.getAnimalsAlive());
    }
}
