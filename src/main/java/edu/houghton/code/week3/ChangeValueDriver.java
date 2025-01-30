package edu.houghton.code.week3;

import java.util.Scanner;

/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 *
 * In this class your should test your ChangeValue Class
 */
public class ChangeValueDriver{


    public static void main(String[] args) {
        //instantiate your scanner object
        Scanner scanner = new Scanner(System.in);
        //declare the local val1 and val2 integer variables
        int val1;
        int val2;
        //prompt the user for input of two integers
        System.out.println("Value 1?");
        val1 = scanner.nextInt();
        System.out.println("Value 2?");
        val2 = scanner.nextInt();

        //instantiate a changeValue object here
        ChangeValue value = new ChangeValue(val1, val2);
        //call the object method printit here
        value.print();
    }

}