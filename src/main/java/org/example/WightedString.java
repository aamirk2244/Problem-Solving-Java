package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class WightedString {


    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here
        HashMap<Character, Integer> hash = new HashMap<>();
        HashMap<Integer, Boolean> compare = new HashMap<>();
        List<String> result = new ArrayList<>();



        int count = 1;

        for(char i='a';i <= 'z'; i++ ) {
            hash.put(i, count);
            count += 1;
        }

        int index = 0;
        char ch;
        int saveSum = 0;
        while(index < s.length()) {
            ch = s.charAt(index);

            saveSum = hash.get(ch);
            compare.put(saveSum, true);
            index += 1;
            while(index < s.length() && s.charAt(index) == ch) {
                saveSum += hash.get(ch);
                compare.put(saveSum, true);
                index += 1;
            }
        }

        for(int i = 0; i < queries.size(); i++) {
            String ans = compare.get(queries.get(i)) == null ? "No" : "Yes";
            result.add(ans);
        }

        System.out.println(hash);
        System.out.println(compare);
        return result;
    }

    public static void main(String args[]) {
        List<Integer> queries = new ArrayList<>(Arrays.asList(9, 7, 8 , 12, 5));
        System.out.println(weightedUniformStrings("aaabbbbcccddd", queries ));

    }
//    a=1, aa=2, aaa=3, b=2, bb=4, bbb=6, bbbb=8, c=3, cc=6, ccc=9, d=4, dd=8, ddd=12


}