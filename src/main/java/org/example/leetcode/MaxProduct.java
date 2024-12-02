package org.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxProduct {


    public static int maxProduct(int[] nums) {
        if(nums.length <= 2) {
            int prod = listProduct(nums);
            return prod == 0 ?  getMax(nums) : prod;
        }
        HashMap<Integer, List<Integer>> hash = new HashMap<>();

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            List<Integer> temp = new ArrayList<>();  // {2,3,-2,4}
            temp.add(nums[i]);

            boolean flag = false;

            for(int j = i+1; j < nums.length; j++) {
                if(flag) {
                    temp = copyList( list.get(list.size() - 1));
                }
                temp.add(nums[j]);
                list.add(temp);
                flag = true;

            }
        }

        int maxProduct = -1;
        List<Integer> maxArray = new ArrayList<>();
        for(List<Integer> array : list) {
            int product = listProduct(array);
            if(maxProduct < product) {
                maxProduct = product;
                maxArray = array;
            }
        }


        System.out.println(list);
        System.out.println(maxArray);
        return maxProduct;
    }

    public static List<Integer> copyList(List<Integer> list) {
        List<Integer> copy = new ArrayList<>();
        for(int value : list) {
            copy.add(value);
        }
        return copy;
    }

    public static int listProduct(List<Integer> list) {
        int product = 1;

        for(int value : list) {
            product *= value;
        }

        return Math.abs(product) ;
    }


    public static int listProduct(int[] list) {
        int product = 1;
        for(int value : list) {
            product *= value;
        }
        return product;
    }

    public static int getMax(int[] array){
        int max =  -1;
        for(int value : array) {
            if(max < value) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[] array =  {3,-1, 4};
        System.out.println(maxProduct(array));
    }
}
