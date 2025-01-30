package edu.houghton.code.week3;

import java.util.Objects;

/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 *
 * Todo:
 *
 * Private instance variables to store age of the House, its type (Detached, Semi-Attached, Attached) and its cost.
 * 
 * 4 constructors: No argument (sets age to 50, type to Attached and cost to 100000), one argument constructor (sets cost to a value, age - 50 and type - Attached), two argument constructors (sets age to a value, cost to a value , and type to Attached), three argument constructors (sets age to a value, cost to a value, and type to Attached, semi-detached, or detached)
 *
 * 3 Accessor/Getter methods: - methods to return age, type and cost respectively
 *
 * 5 Mutator/Setter methods: - 3 methods for setting the three values independently, a method to set all three values and a method to set age and cost of the house.
 *
 * A public method called estimatePrice() that returns cost of a house based on type and age. An attached cost $100,000, appreciates 1% every year in first five years and 2% every year afterwards. A Semidetached cost $150,000, appreciates 2% every year in first five years and 3% every year afterwards. A detached costs $200,000, appreciates 2% every year in first five years and 2% every year afterwards.
 *
 * A toString() method that returns type of the house and its age and its cost.
 *
 * An equals() method to test for equality of two objects of class House based on type and age.
 *
 * isLessThan() and isGreaterThan() method to compare between the prices of two objects of class House.
 *
 *
 * Hints:
 *  You can generate the toString() method and equals() method body by
 */
public class House {

    //declare your variables
    private double cost;
    private int age;
    private String type;

    //create your constructors
    public House() {
        this.cost = 100000.0;
        this.age = 50;
        this.type = "Attached";
    }
    public House(double cost) {
        this.cost = cost;
        this.age = 50;
        this.type = "Attached";
    }
    public House(double cost, int age) {
        this.cost = cost;
        this.age = age;
        this.type = "Attached";
    }
    public House(double cost, int age, String type) {
        this.cost = cost;
        this.age = age;
        this.type = type;
    }

    //create your getter methods
    public double getCost() {
        return cost;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }

    //Create the setter methods
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setHouse(double cost, int age) {
        this.cost = cost;
        this.age = age;
    }
    public void setHouse(double cost, int age, String type) {
        this.cost = cost;
        this.age = age;
        this.type = type;
    }


    //create your estimatePrice method
    public double estimatePrice() {
        if(getType().equals("Attached")) {
            if(age > 5) {
                return ((100000.0)*((1.01)*5))*((1.02)*(getAge()-5));
            } else {
                return (100000.0)*((1.01)*getAge());
            }
        } else if(getType().equals("Semi-Attached")) {
            if(age > 5) {
                return ((150000.0)*((1.02)*5))*((1.03)*(getAge()-5));
            } else {
                return (150000.0)*((1.02)*getAge());
            }
        } else if(getType().equals("Detached")) {
            return (200000.0)*((1.02)*getAge());
        } else {
            return 0;
        }
    }


    //create the toString() method
    //to do this, right click -> generate -> toString
    @Override
    public String toString() {
        return "House{" + "cost=" + cost + ", age=" + age + ", type=" + type + '}';
    }


    //create the equals() method
    //to do this, right click -> generate -> override methods - > equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final House other = (House) obj;
        if (this.age != other.age) {
            return false;
        }
        return Objects.equals(this.type, other.type);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.age;
        hash = 83 * hash + Objects.hashCode(this.type);
        return hash;
    }


    //create the isLessThan() method
    //this will be similar to how your equals method definition looks like
    public boolean isLessThan(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final House other = (House) obj;
        return cost < other.getCost();
    }


    //create the isGreaterThan() method
    //this will be similar to how your equals method definition looks like
    public boolean isGreaterThan(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final House other = (House) obj;
        return cost > other.getCost();
    }

}
