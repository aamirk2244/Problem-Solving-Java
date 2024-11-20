package org.example.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SockMerchant {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashMap<Integer, Integer> hash = new HashMap<>();
        int pairsCount = 0;
        for(int i = 0; i < ar.size(); i++)
        {
            if(!hash.containsKey(ar.get(i))) {
                hash.put(ar.get(i), 0);
            }

            hash.put(ar.get(i), hash.get(ar.get(i)) + 1);
        }

        for(Integer value : hash.values()) {
            if(value < 2 ) {
                continue;
            }
            pairsCount += (value/2);
        }

        return pairsCount;
    }

    public static void main(String args[]) {

        List<Integer> array = new ArrayList<>(Arrays.asList(
                10, 20, 20, 10, 10, 30, 50, 10, 20

        ));

        System.out.println( sockMerchant(array.size(), array));

    }
}
