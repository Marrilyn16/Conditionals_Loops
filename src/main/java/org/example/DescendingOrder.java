package org.example;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(int num) { //method that takes in int as a parameter
        String number = Integer.toString(num); //convert the parameter num to string and equate it to a string variable
        String[] arr = number.split(""); //split the string and equate to an array with array name "arr"
        Arrays.sort(arr); //sort through the array. this returns it in an ascending order

        String store = ""; //created an empty string to store the number in descending order.
        for (int i =arr.length-1; i >0; i--) { //create a loop to loop through the array of string
            store = store + arr[i]; //assign elements of the array to the empty string
        }
        return Integer.parseInt(store); //return the string as integer using parseInt
        }



    public static void main(String[] args) {
        System.out.println(sortDesc(3787452)); // print the method with a number passed in place of the parameter
    }
}
