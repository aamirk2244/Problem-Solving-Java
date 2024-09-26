package org.example;
import java.lang.reflect.Array;
import java.util.*;

public class MissingNumbers {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hashArr = toHash(arr);
        HashMap<Integer, Integer> hashBrr = toHash(brr);

        HashMap<Integer, Boolean> traversed = new HashMap<>();

        for(int i = 0 ; i < brr.size(); i++) {
            if(!hashBrr.get(brr.get(i)).equals(hashArr.get(brr.get(i))) && !traversed.containsKey(brr.get(i))) {
                traversed.put(brr.get(i), true);
                result.add(brr.get(i));
            }
        }

        System.out.println(hashArr);
        System.out.println(hashBrr);
        int swap;
        for(int i = 0 ; i < result.size(); i++) {
            for(int j = i; j < result.size(); j++) {
                if(result.get(i) > result.get(j)) {
                    swap = result.get(i);
                    result.set(i, result.get(j));
                    result.set(j, swap);
                }
            }
        }

        return result;
    }

    public static HashMap<Integer,Integer> toHash(List<Integer> list) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < list.size(); i++) {
            if(hash.containsKey(list.get(i))) {
                hash.put(list.get(i), hash.get(list.get(i)) +1);
            }
            else {
                hash.put(list.get(i), 1);
            }
        }
        return hash;
    }

    public static void main(String args[]) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(203 ,204 ,205 ,206 ,207, 208 ,203 ,204 ,205 ,206));
        List<Integer> brr = new ArrayList<>(Arrays.asList(203 ,204 ,204 ,205 ,206, 207, 205 ,208 ,203 ,206 ,205 ,206 ,204));
        System.out.println(missingNumbers(arr, brr));

    }


}