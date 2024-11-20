package org.example.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CavityMap {


    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        String form = "";
        List<String> list = new ArrayList<>();
        for(int i = 0; i < grid.size(); i++) {
            String cavity = grid.get(i);
            form = "";
            form = form + cavity.charAt(0);
            for(int index = 1; index < cavity.length() - 1; index++ ) {
                if(cavity.charAt(index) > cavity.charAt(index-1) && cavity.charAt(index) > cavity.charAt(index+1)) {
                    form += "X";
                }
                else {
                    form += cavity.charAt(index);
                }
            }
            form += cavity.charAt(cavity.length() -1);
            list.add(form);
        }
        return list;
    }



    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("989", "191", "111"));
        System.out.println(cavityMap(list));
    }
}