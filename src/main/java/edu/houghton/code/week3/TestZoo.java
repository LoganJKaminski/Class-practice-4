/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.code.week3;

/**
 *
 * @author Logan
 */
public class TestZoo {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        myZoo.addAnimal(new Animal(50000, "elephant", 4));
        myZoo.print();
        //while(myZoo.addAnimal(new Animal("snail"))) {}
        myZoo.print();
    }
}
