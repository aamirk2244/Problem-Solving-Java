package org.example.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TwoPluses {

    public static int twoPluses(List<String> grid) {
        // Write your code here
        List<Integer> boxes = new ArrayList<>();
        List<Integer> depth = new ArrayList<>();
        List<Integer> savedPlus = new ArrayList<>();
        int topDepth = 0;
        int bottomDepth = 0;
        int rightDepth = 0;
        int leftDepth = 0;
        int min  = 0;
        List<Integer> alreadyTraversedCellRowWise = new ArrayList<>();
        List<Integer> alreadyTraversedColumnWise = new ArrayList<>();


        int count = 0;
        for(int i = 1; i < grid.size()-1; i++ ) {
            for(int j = 1; j < grid.get(i).length()-1; j++) {
                if(grid.get(i).charAt(j) == 'G' && grid.get(i-1).charAt(j) == 'G' && grid.get(i+1).charAt(j) == 'G' && grid.get(i).charAt(j+1) == 'G' && grid.get(i).charAt(j-1) == 'G'){
                    depth = new ArrayList<>();
                    topDepth = i;
                    count = 0;
                    while(topDepth -1 > 0 && grid.get(topDepth-1).charAt(j) == 'G' ) {
                        count += 1;
                        topDepth -= 1;
                    }
                    bottomDepth = i;
                    count = 0;

                    while(bottomDepth +1  < grid.size() && grid.get(bottomDepth+1).charAt(j) == 'G') {
                        count += 1;
                        bottomDepth += 1;
                    }

                    depth.add(count);

                    rightDepth = j;
                    count = 0;

                    while(rightDepth +1  < grid.get(i).length() && grid.get(i).charAt(rightDepth+1) == 'G' ) {
                        count += 1;
                        rightDepth += 1;
                    }

                    depth.add(count);


                    leftDepth = j;
                    count = 0;

                    while(leftDepth -1  > 0 && grid.get(i).charAt(leftDepth - 1) == 'G') {
                        count += 1;
                        leftDepth -= 1;
                    }

                    depth.add(count);
                    min = Collections.min(depth);


                    min = min + min + min + min + 1;
                    savedPlus.add(min);
                }
            }
        }
        int totalArea = 1;
        for(int i = 0; i < savedPlus.size(); i++) {
            totalArea =  totalArea * savedPlus.get(i);
        }
        System.out.println(savedPlus);
        return totalArea;
    }


    public static void main(String args[]){
//                List<String> grid = new ArrayList<>(Arrays.asList(
//                        "GGGGGG",
//                        "GBBBGB",
//                        "GGGGGG",
//                        "GGBBGB",
//                        "GGGGGG"
//                ));
        List<String> grid = new ArrayList<>(Arrays.asList(
                "BGBBGB",
                "GGGGGG",
                "BGBBGB",
                "GGGGGG",
                "BGBBGB",
                "BGBBGB"
        ));
        System.out.println(twoPluses(grid));
    }
}