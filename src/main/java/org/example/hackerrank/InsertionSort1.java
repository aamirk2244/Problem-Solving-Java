package org.example.hackerrank;

import java.util.*;

public class InsertionSort1 {

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int store = arr.get(n-1);
        int index = n-2;
        while(index > -1) {
            if(arr.get(index) >= store) {
                arr.set(index+1, arr.get(index));
                if(index == 0) {
                    printArray(arr);
                    System.out.println();

                    arr.set(index, store);
                }
            }else {
                arr.set(index+1, store);
                index = -1;
            }
            index -= 1;
            printArray(arr);
            System.out.println();
        }

    }

    public static void printArray(List<Integer> array) {
        for(int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }

    }
    public static void main(String args[]) {
        List<Integer> array = new ArrayList<>(Arrays.asList(3 ,4 ,7 ,5 ,6 ,2 ,1));
        int n = array.size();
        insertionSort1(n,array);
    }

}