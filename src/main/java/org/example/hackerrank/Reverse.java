package org.example.hackerrank;

public class Reverse {
    public static int[] reverse(int[] array) {
        System.out.println(array);
        int length = array.length;
        int lastIndex = length -1;
        int swap = 0;
        for(int i = 0; i < length/2; i++) {
            swap = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = swap;
            lastIndex -= 1;
        }
        printArray(array);
        return array;
    }
    public static void printArray(int[] array) {
        for(int  i= 0 ; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }




    public static void main(String[] args) {

        System.out.println("Hello world!");
//        int[] array = {1, 2 ,3, 4, 5};
//        reverse(array);

    }
}