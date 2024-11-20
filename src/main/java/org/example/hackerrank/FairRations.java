package org.example.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FairRations {

    public static String fairRations(List<Integer> B) {
        // Write your code here
        int count = 0;
        boolean done = true;
        for(int index = 0 ; index < B.size(); index++) {
            int value = B.get(index);
            if(value % 2 != 0) {
                B.set(index, value+1);
                count += 1;
                if(index + 1 < B.size()) {
                    value = B.get(index+1);
                    B.set(index+1, value+1);
                    count += 1;
                }
                else {
                    return "NO";
                }
            }
        }
        System.out.println(B);
        return String.valueOf(count);

    }
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>(Arrays.asList(2,3 , 4, 5, 7));
        System.out.println( fairRations(array));


    }
}