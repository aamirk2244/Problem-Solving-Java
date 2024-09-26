package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class IndexArray {

    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        for(int i=0;  i < arr.size(); i++) {
            if(V == arr.get(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 9, 12));
        int V = 4;
        System.out.println(introTutorial(V, array));
    }

}