package org.example;

import java.util.ArrayList;
import java.util.List;

public class StrangeCounter {
    public static long strangeCounter(long t) {
        // Write your code here
        int value = 3;
        int counter = 0;
        int previousIndex = 0;
        List<Integer> store = new ArrayList<>();
        boolean firstChunk = true;
        for(int i = 0; i < t; i++) {
            if(value < 1) {
                value = store.get(previousIndex) * 2;
                previousIndex = i;

            }

            store.add(value);
            value -= 1;




        }
        System.out.println(store);
        return store.get(store.size() -1 );
    }
    public static void main(String args[]){
        strangeCounter(17);
        System.out.println("hello world");
    }

}
