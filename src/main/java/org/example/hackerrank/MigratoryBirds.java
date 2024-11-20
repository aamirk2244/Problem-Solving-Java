package org.example.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        HashMap<Integer, Integer> hash = new HashMap<>();
        int firstMax = 0;
        int firstMaxKey = 0;
        int secondMax = 0;
        int secondMaxKey = 0;

        for(int i = 0; i < arr.size(); i++) {
            if(!hash.containsKey(arr.get(i))) {
                hash.put(arr.get(i), 0);
            }

            hash.put(arr.get(i), hash.get(arr.get(i))+1);
            if(hash.get(arr.get(i)) >= firstMax) {
                secondMax = firstMax;
                secondMaxKey = firstMaxKey;

                firstMaxKey = arr.get(i);
                firstMax = hash.get(arr.get(i));
            } else if (hash.get(arr.get(i)) >= secondMax && hash.get(arr.get(i)) != firstMax) {

                secondMax = firstMax;
                secondMaxKey = firstMaxKey;

            }


//                         if(hash.get(arr.get(i)) > secondMaxKey)

        }

//                 System.out.println(hash);
//                 System.out.println(firstMaxKey);
//                 System.out.println(secondMaxKey);

        return secondMaxKey;

    }
    public static void main(String args[]) {

        List<Integer> array = new ArrayList<>(Arrays.asList(
                1 ,2, 3 ,4 ,5, 4, 3, 2 ,1 ,3 ,4

        ));

        System.out.println( migratoryBirds(array));

//                1=> 2, 2=> 2, 3=> 3, 4=> 3, 5=> 1
    }
}