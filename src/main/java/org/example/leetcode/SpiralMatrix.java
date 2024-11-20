package org.example.leetcode;

public class SpiralMatrix {
    public static int[][] generateMatrix(int n) {
        int spiral[][] = new int[n][n];
        int oneN = 1;
        int twoN = 2;

        int count = 0;
        boolean top = true;
        int topI = 0;
        int topJ = 0;

        boolean right = false;
        int rightI = oneN;
        int rightJ = n - oneN;

        boolean bottom = false;
        int bottomI = n - oneN;
        int bottomJ = n - 1;


        boolean left = false;
        int leftI = n - 1;
        int leftJ = 0;


        int lefN = 0;
        int bottomJN = 0;
        int ret[][] = new int[1][1];
        if (n == 1) {
            ret[0][0] = 1;
            return ret;
        }

        int temp = 0;

        int iterate = n * n;

        int testCount = 1;
        while (count < iterate) {
            System.out.println("topI is " + topI + " topJ is " + topJ + " ||  and rightI is " + rightI + " rightJ  " + rightJ);
            System.out.println("bottomI is " + bottomI + " bottomJ is " + bottomJ + " ||  and leftI is " + leftI + " leftJ  " + leftJ);

            if (top) {
                temp = topJ;
                while (temp <= rightJ) {
                    count += 1;
                    spiral[topI][temp] = count;
                    temp += 1;
                }
                top = false;
                right = true;
            }
            if (right) {
                temp = rightI;
                while (temp < bottomI) {
                    count += 1;
                    spiral[temp][rightJ] = count;

                    temp += 1;
                }
                right = false;
                bottom = true;
            }

            if (bottom) {
                temp = bottomJ;
                while (temp > bottomJN) {
                    count += 1;
                    spiral[bottomI][temp] = count;
                    temp -= 1;
                    bottom = false;
                    left = true;
                }

            }

            if (left) {
                temp = leftI;
                while (temp > lefN) {
                    count += 1;
                    spiral[temp][leftJ] = count;
                    temp -= 1;

                }
                left = false;
                top = true;
            }
            printArray(spiral);
            System.out.println("***********************");

            n -= 1;

            lefN += 1;
            bottomJN += 1;

            topI += 1;
            topJ += 1;

            rightI += 1;
            rightJ = n - 1;

            bottomI = n - 1;
            bottomJ = n - 2;


            leftI = n - 2;
            leftJ += 1;
            testCount += 1;
            if (testCount == 10) {
                break;
            }


        }

//        printArray(spiral);

        return spiral;

    }

    public static void printArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        generateMatrix(5);
    }
}

