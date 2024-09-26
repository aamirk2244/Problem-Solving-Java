package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Pangram {


    public static String pangrams(String s) {
        // Write your code here

        HashMap<Character, Boolean> hash = new HashMap<Character, Boolean>();
        int count = 0;
        char ch;
        for(int i = 0; i < s.length(); i++) {
            ch = Character.toLowerCase(s.charAt(i));

            if(hash.get(ch) == null && ('a' <= ch && ch <= 'z')) {
                hash.put(ch, true);
                count += 1;
            }
        }
        return count == 26 ? "pangram" : "not pangram";
    }

    public static void main(String args[]) {
        String result =  pangrams("We promptly judged antique ivory buckles for the next prize");
        System.out.println(result);
    }


}