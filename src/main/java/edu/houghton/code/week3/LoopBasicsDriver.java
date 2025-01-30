package edu.houghton.code.week3;

import java.util.Scanner;

/**
 * Name : Logan Kamjnski
 * Course: CSCI 218 - Programming II
 *
 * In this class your should test and call the methods you created in the LoopsBasics Class
 */
public class LoopBasicsDriver {


    public static void main(String[] args) {
        //Instantiate the scanner class to accept inputs where necessary
        Scanner scanner = new Scanner(System.in);
        //Create an object of your LoopsBasics class
        LoopsBasics loops = new LoopsBasics();
        //Test: Task 1 method
        //Use the scanner object to accept the input n
        //Pass the input to the method and print the factorial of n
        System.out.println("Number 1-1000");
        long num = loops.getFactorial(scanner.nextInt());
        System.out.print("Factorial: ");
        System.out.println(num);
        //Test: Task 2 method
        //Call the method and print the sum of the series
        System.out.println(loops.sumOfSeries());
        //Test: Task 3 method
        //Call the method and print the sum of the square of odd numbers between 22 and 389
        System.out.println(loops.sumOfOddSquares());


    }
}
