

package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;


public class HackerrankInString {

    public static String hackerrankInString(String s) {
        // Write your code here
        String sample = "hackerrank";
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == sample.charAt(index)) {
                index += 1;
                if(index == sample.length()){
                    return "YES";
                }
            }
        }
        return "NO";

    }
    public static void main(String args[]) {
        System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
    }
}