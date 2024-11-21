package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

    public static List<Integer> grayCode(int n) {
        // formula = [0, 2^n  - 1]
        int range = (int) (Math.pow(2, n)) - 1;
        List<Integer> result = new ArrayList<>();


        for (int i = 0; i <= range; i++) {
            result.add(i);
        }

        int xorResult = 3 ^ 1;
        int bitDiff = Integer.bitCount(xorResult);
        int nextIndex = 0;
        int swap = 0;
        // [0, 1, 2, 3, 4, 5, 6, 7]
        nextIndex = result.size() - 1;
        while (!isBitDiffOne(result.get(0) ^ result.get(result.size() - 1))) {
            nextIndex -= 1;
            swap = result.get(result.size() - 1);
            result.set(result.size() - 1, result.get(nextIndex));
            result.set(nextIndex, swap);
        }

        for (int i = 0; i < result.size() - 1; i++) {
            System.out.println("--------------");

            xorResult = result.get(i) ^ result.get(i + 1);
            nextIndex = i + 1;
            if (i + 1 >= result.size()) {
                break;
            }
            while (!isBitDiffOne(result.get(i) ^ result.get(nextIndex))) {
//                System.out.println("++++++++++++=");

                nextIndex += 1;
                if (nextIndex >= result.size()) {
                    break;
                }
            }

            if (nextIndex >= result.size()) {
                continue;
            }
            swap = result.get(i + 1);
            result.set(i + 1, result.get(nextIndex));
            result.set(nextIndex, swap);


        }
        System.out.println(result);

        return result;
    }

    public static boolean isBitDiffOne(int value) {
        return Integer.bitCount(value) == 1 ? true : false;
    }

    public static void main(String args[]) {
        System.out.println(grayCode(5));

    }
}
