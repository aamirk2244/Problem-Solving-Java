package org.example.leetcode;

import java.util.HashMap;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        int single = 0;
        int min = 1000;
        for(int value : nums) {

            if(!hash.containsKey(value)) {
                hash.put(value, 0);
            }
            hash.put(value, hash.get(value) + 1);
        }
        for(int key : hash.keySet()) {
            if(hash.get(key) < min) {
                min = hash.get(key);
                single = key;
            }
        }

        System.out.println(hash);
        return single;
    }


    public static void main(String args[]) {
        int[] array = {30000,500,100,30000,100,30000,100};
        System.out.println(singleNumber(array));
    }
}

