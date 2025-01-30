package edu.houghton.code.week3;

/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 *
 */
public class ChangeValue {

    //declare 2 integer instance variables: value1 and value2.
    // These should be declared private.
    private int value1;
    private int value2;

    //Constructor
    public ChangeValue(int val1, int val2){
        if(val1 > 5) {
            this.value1 = val1;
        } else {
            this.value1 = val1 + val2;
        }
        if(val2 < 10) {
            this.value2 = (val2*val2) + 5;
        } else {
            this.value2 = val2;
        }
    }

    public void print(){
        System.out.println(value1*value2);
    }

}
