package org.example;

public class Array1 {

    public static void main(String[] args) {
        int arra[]={50,60,70,80};
        for(int i=0;i<=arra.length;i++){ //this will throw an out of bounds error cos length is equal to 4 but it can only loop to the 3rd index
            System.out.println(arra[i]);
        }
//Calling the method which returns an array
        int[] arr = get(); //equate the method to an array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
//Calling the method which passes an anonymous array
        anonymousArray(new int[]{29,30,45,67,92,45,30});
//Calling the method which passes an array
        int a[] = {33, 3, 4, 5};//declaring and initializing an array
        min(a);//passing array to method
    }

//Passing an array to a method
    static void min(int arr[]) { //create a method which takes an array as a parameter
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) { //printing the values of the array
            if (min > arr[i]) {
                min = arr[i];

                System.out.println(min);
            }
        }

    }

// Passing an anonymous array to method
    static void anonymousArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) { //printing the values of the array
            System.out.println(arr[i]);
        }
    }

//Returning an array from a method
    static int[] get(){ //create a method which returns an array
        return new int[] {12,34,56,78,90};
    }
}
