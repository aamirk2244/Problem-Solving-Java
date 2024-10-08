package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;


public class MinimumNumber {

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        int count = 4;
        int minimumLength = 6;
        boolean lowerFound = false;
        boolean numberFound = false;
        boolean upperFound = false;
        boolean specialFound = false;
        for(int i = 0; i < password.length(); i++) {
            if(!upperFound && ((65 <= (int) password.charAt(i)) && (int) password.charAt(i) <= 90)){
                upperFound = true;
                count -= 1;
                continue;
            }
            if(!lowerFound && ((97 <= (int) password.charAt(i)) && (int) password.charAt(i) <= 122)){
                lowerFound = true;
                count -= 1;
                continue;
            }

            if(!numberFound && ((48 <= (int) password.charAt(i)) && (int) password.charAt(i) <= 57)){
                numberFound = true;
                count -= 1;
                continue;
            }


            if(!specialFound && ( password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '^' || password.charAt(i) == '&' || password.charAt(i) == '*' || password.charAt(i) == '(' || password.charAt(i) == ')'|| password.charAt(i) == '-'|| password.charAt(i) == '+') ){
                specialFound = true;
                count -= 1;
            }

        }
        System.out.println(count);

        int passLength = password.length() + count;
        while (passLength  < minimumLength) {
            count += 1;
            passLength += 1;
        }

        return count;
    }


    public static void main(String args[]){
        System.out.println("hello");
//                String string = "4700";
        String string ="AUzs-nV";
        System.out.println( minimumNumber( string.length(),string));
    }
}