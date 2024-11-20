package org.example.leetcode;

import java.util.Arrays;

public class MedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final int totalSize = nums1.length + nums2.length;
        int mergedArray[] = new int[totalSize];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        mergedArray = Arrays.stream(mergedArray).sorted().toArray();
        int middle = totalSize/2;

        return (totalSize % 2 == 0 ? (mergedArray[middle] + mergedArray[middle - 1]) / 2.0 : mergedArray[middle]);

    }

    public static void main(String args[]) {

//                List<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 3));
//                List<Integer> nums2 = new ArrayList<>(Arrays.asList(2));
//
        int nums1[] = {1, 2};
        int nums2[] = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}

