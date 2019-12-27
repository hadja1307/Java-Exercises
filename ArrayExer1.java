import java.util.*;
import java.util.Scanner;

public class ArrayExer1 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        /* How to  write Arrays? Syntax

        * type[] name = new type[length];
        * where 'type' is the data type e.g. int, double, String
        * 'name' is the variable name
        * 'new' creating a new space in memory to store whatever you want to store
        * 'type' is the data type, must be the same data type you started at teh beginning e.g. int, double, string etc.
        * 'length' is the length of the array, so how many values you want to store
        *'key' arrays always start from 0, and the last value is size-1.
        */


        //for loops and Arrays are great friends
        //e.g. for (int i = 0; i< number.length; i++) {
        // sum += number[i]; }
        // 'length' is used to find the length of the field in the array,
        // no parenthesis needed hence it is not a method
        //


        //int num = input.nextInt();
        int[] number = new int[3];
        int sum = 0;

        for (int i = 0; i< number.length; i++) {
             sum += number[i]; }

        System.out.println("number = " + number.length); //will print out the length of the array using .length

        int[] a = new int[5];
        double[] b = new double[10];
        char[] c = new char[20];
        int aLength = a.length; // returns 5
        int bLength = b.length; // returns 10
        int cLength = c.length; // returns 20

        System.out.println("a =" + a.length);
        System.out.println("b =" + b.length);
        System.out.println("c =" + c.length);
    }


    // Null is the zero value for objects in java, null means 'no object'
    //objects are many data type, starts in Upper case letter
    //e.g. String, Scanner, Array etc...
    //for ints, the zero value is 0


    /*
    * How to access or change value in array?
    * access returns the value stored at the given index
    * syntax for access: name[index], e.g. number[2]
    *
    * modify replaces the element at the index with specified value
    * name[index] = value; e.g. number[2] = 4;
    * the value 2 is replaced by the value of 4
    * */

}
