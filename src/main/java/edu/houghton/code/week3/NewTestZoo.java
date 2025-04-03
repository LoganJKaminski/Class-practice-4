/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.code.week3;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Logan
 */
public class NewTestZoo {
    public static void main(String[] args) throws InterruptedException {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Animal(50000, "elephant", 4));
        zoo.addAnimal(new Animal(100, "spider", 8));
        zoo.addAnimal(new Animal(7000, "snake", 0));
        while(true) {
            TimeUnit.MILLISECONDS.sleep(100);
            zoo.addAnimal(new Animal("snail"));
            zoo.print();
        }
    }
}
