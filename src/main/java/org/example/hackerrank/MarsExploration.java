package org.example.hackerrank;


public class MarsExploration {

    public static int marsExploration(String s) {
        // Write your code here
        int count = 0;
        String chunk = "SOS";
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            if(index > 2){
                index = 0;
            }

            if(s.charAt(i) != chunk.charAt(index)) {
                count += 1;
            }
            index += 1;

        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
    }
}