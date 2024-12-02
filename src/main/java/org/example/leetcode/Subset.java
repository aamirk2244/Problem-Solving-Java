package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());

        List<Integer> elements = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {

                result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j])));
            }
            elements.add(nums[i]);
            result.add(new ArrayList<>(Arrays.asList(nums[i])));
        }
        if (nums.length > 2) {
            result.add(elements);
        }


        return result;
    }

    public static void main(String args[]) {
        System.out.println( subsets(new int[]{1,2}));
    }
}
