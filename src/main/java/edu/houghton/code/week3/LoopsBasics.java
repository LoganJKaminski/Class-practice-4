package edu.houghton.code.week3;

/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 */

public class LoopsBasics {

    //Task 1
    //get the factorials of n positive integers 1,2,…,1000
    public long getFactorial(int n){
        //your code here
        if(n == 1) {
            return 1L;
        }
        return (long)n*(long)getFactorial(n-1);
    }

    //Task 2
    //get the sum of the series
    public double sumOfSeries(){
        double result=0;
        //your code here
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                result -= (1.0/(double)i);
            } else {
                result += (1.0/(double)i);
            }
        }
        return result;

    }

    //Task 3
    //gets the sum of a square of odd numbers between 22 and 389
    public int sumOfOddSquares(){
        int result=0;
        for(int i = 22; i <= 389; i++) {
            if(i % 2 == 1) {
                continue;
            }
            result += (i)*(i);
        }
        return result;

    }


}
