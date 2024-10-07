package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BomberMan {

    public static List<String> bomberMan(int n, List<String> grid) {
        // Write your code here
        grid =  plantAllBombs(grid);
        printGrid(grid);
        return grid;
    }

    public static List<String> plantAllBombs(List<String> grid) {
        List<String> newGrid = new ArrayList<>();
        String bombs = "";

//                List<List<Integer>> savedIndices = new ArrayList<>();
        HashMap<Integer, List<Integer>> savedIndices = new HashMap<>();
        // Update the 3rd character (index 2) to '_'
//                sb.setCharAt(2, '_');

        // Convert back to String if needed
//                String updatedStr = sb.toString();
        for(int i = 0 ; i < grid.size(); i++) {
            for(int j= 0 ; j < grid.get(i).length(); j++) {
                if(grid.get(i).charAt(j) == 'O'){
                    savedIndices.put(i,new ArrayList<>(Arrays.asList(j)) );
                    if( i-1 >= 0) {
                        if (savedIndices.containsKey(i-1)) {
                            savedIndices.get(i-1).add(j);
                        } else {
                            // Create a new list and add the value
                            savedIndices.put(i-1, new ArrayList<>(Arrays.asList(j)));
                        }
                    }
                    if(i+1 < grid.size()) {
                        if (savedIndices.containsKey(i+1)) {
                            savedIndices.get(i+1).add(j);
                        } else {
                            // Create a new list and add the value
                            savedIndices.put(i+1, new ArrayList<>(Arrays.asList(j)));
                        }

                    }

                    if(j+1 <  grid.get(i).length()) {
                        if (savedIndices.containsKey(i)) {
                            savedIndices.get(i).add(j+1);
                        } else {
                            // Create a new list and add the value
                            savedIndices.put(i, new ArrayList<>(Arrays.asList(j+1)));
                        }
                    }

                    if(j-1 >=  0) {
                        if (savedIndices.containsKey(i)) {
                            savedIndices.get(i).add(j-1);
                        } else {
                            // Create a new list and add the value
                            savedIndices.put(i, new ArrayList<>(Arrays.asList(j-1)));
                        }
                    }

                }



            }

        }
        for(int i = 0; i < grid.size(); i++) {
            for(int j = 0 ; j < grid.get(i).length(); j++){
                bombs += savedIndices.containsKey(i) &&  savedIndices.get(i).contains(j) ? "." : "O";
            }

            newGrid.add(bombs);
            bombs = "";

        }

        System.out.println(savedIndices);
        System.out.println(savedIndices.size());
        return newGrid;
    }

    public static void printGrid(List<String> grid) {
        for(int i = 0; i < grid.size(); i++) {
            System.out.println(grid.get(i));
        }
    }

    public static void main(String args[]){
//                List<String> grid = new ArrayList<>(Arrays.asList(
//                        ".......",
//                        "...O...",
//                        "....O..",
//                        ".......",
//                        "OO.....",
//                        "OO....."
//                ));
//

//                List<String> grid = new ArrayList<>(Arrays.asList(
//                        ".......",
//                        "...O.O.",
//                        "....O..",
//                        "..O....",
//                        "OO...OO",
//                        "OO.O..."
//                ));

        List<String> grid = new ArrayList<>(Arrays.asList(
                "...",
                ".O.",
                "..."
        ));

        bomberMan(3, grid);
//                System.out.println("OOOOO".set);
    }
}
