package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridSearch {

    public static String gridSearch(List<String> G, List<String> P) {
        // Write your code here
        String isFound = "YES";
        removeDuplicateRows(P);
        System.out.println(P);

        List<Integer> patternSequence = new ArrayList<>();

        boolean foundInAnyRow = false;
        for(int i = 0; i < P.size(); i++) {
            foundInAnyRow = false;
            for(int j = 0; j < G.size(); j++) {
                if(G.get(j).contains(P.get(i))){
                    foundInAnyRow = true;
                    patternSequence.add(j);

                }
            }
            if(!foundInAnyRow) {
                return "NO";
            }

        }

        System.out.println(patternSequence);
        return isPatternSequenceVerified(patternSequence) ? isFound : "NO";

    }

    public static boolean isPatternSequenceVerified(List<Integer> sequence) {
        for(int i = 0; i < sequence.size(); i++) {
            if(!(i + 1 < sequence.size())){
                break;
            }

            if( !(sequence.get(i)+1 == sequence.get(i+1))) {
                return false;

            }

        }
        return true;
    }

    public static void removeDuplicateRows(List<String> pattern) {
        for(int i = 0; i < pattern.size(); i++){
            for(int j = i+1; j < pattern.size(); j++) {
                if(pattern.get(i).equals(pattern.get(j))){
                    pattern.remove(pattern.get(j));
                }
            }
        }
    }

    public static void main(String args[]) {
        List<String> grid = new ArrayList<>(Arrays.asList(
                "1234567890",
                "0987654321",
                "1111111111",
                "1111111111",
                "2222222222"));

        List<String> pattern = new ArrayList<>(Arrays.asList(
                "876543",
                "111111",
                "111111"));

//                System.out.println(pattern.get(0).equals(pattern.get(2)));
        System.out.println(gridSearch(grid, pattern));


    }


}
