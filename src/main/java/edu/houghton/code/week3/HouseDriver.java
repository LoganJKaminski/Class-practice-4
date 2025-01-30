package edu.houghton.code.week3;

/**
 *  Name : (Your name here)
 *  Course: CSCI 218 - Programming II
 *
 *
 * Todo:
 * declare 4 house objects using 4 different constructors and output description of the 4 houses.
 *
 * Test your accessor methods.
 *
 * Calculate the estimated price of houses given type and age (include 1 attached and 1 detached)
 *
 * Test out all 5 mutator methods to modify the attributes of different House objects.
 *
 * Test methods toString(), equals() , isLessThan() and isGreaterThan() for different House objects.
 */
public class HouseDriver {

    public static void main(String[] args) {
        House h1 = new House();
        House h2 = new House(50000.0);
        House h3 = new House(90000.0, 50);
        House h4 = new House(20000.0, 8, "Detached");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        
        System.out.println();
        System.out.println("Accessor Method: The housetype for house H4 is " + h4.getType()
            + ", its age is " + h4.getAge() + ", and it costs " + h4.getCost());
        
        System.out.println("");
        System.out.println("The estimated price of house h1 is " + h1.estimatePrice());
        System.out.println("The estimated price of house h4 is " + h4.estimatePrice());
        
        System.out.println("");
        h1.setAge(5);
        System.out.println("Mutator Method: the new age for house h1 is " + h1.getAge());
        h1.setType("Semi-Attached");
        System.out.println("Mutator Method: the new type for house h1 is " + h1.getType());
        h1.setCost(240000.0);
        System.out.println("Mutator Method: the new cost for house h1 is " + h1.getCost());
        h1.setHouse(150000.0, 10);
        System.out.println("Mutator Method: the new cost for house h1 is " + h1.getCost() + " and its new age is " + h1.getCost());
        h1.setHouse(10000.0, 40, "Attached");
        System.out.println("Mutator Method: the new cost for house h1 is " + h1.getCost() + " and its new age is " + h1.getCost() + " and its new type is " + h1.getType());
        
        System.out.println("");
        System.out.println("toString: " + h1.toString());
        
        System.out.println("");
        System.out.println("Houses H2 and H3 are equal is " + h2.equals(h3));
        System.out.println("Houses H1 and H2 are equal is " + h1.equals(h2));
        
        System.out.println("");
        System.out.println("House H2 is greater than H3 is " + h2.isGreaterThan(h3));
        System.out.println("House H4 is less than H3 is " + h4.isLessThan(h3));
        
    }
}
