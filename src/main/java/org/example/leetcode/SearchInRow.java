package org.example.leetcode;

public class SearchInRow {

    public static boolean search(int[] nums, int target) {
        for (int value : nums) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean search2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = {2, 1, 5, 6, 0, 0, 1, 2};
        int target = 0;
        long startTime = System.nanoTime();

        // Execute the function
        boolean result = search(nums, target);

        // End time
        long endTime = System.nanoTime();

        // Calculate elapsed time
        long elapsedTime = endTime - startTime;

        System.out.println("Result: " + result);
        System.out.println("Execution time in nanoseconds: " + elapsedTime);
        System.out.println("Execution time in milliseconds: " + elapsedTime / 1_000_000.0);
//        System.out.println(search(nums, target));


        long startTime2 = System.nanoTime();

        // Execute the function
        boolean result2 = search2(nums, target);

        // End time
        long endTime2 = System.nanoTime();

        // Calculate elapsed time
        long elapsedTime2 = endTime2 - startTime2;

        System.out.println("Result: " + result2);
        System.out.println("Execution time in nanoseconds: " + elapsedTime2);
        System.out.println("Execution time in milliseconds: " + elapsedTime2 / 1_000_000.0);

    }
}

