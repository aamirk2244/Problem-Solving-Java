
package org.example;
public class Encryption {

    public static String encryption(String s) {
        s = removeSpaces(s);
        String resultString = "";
        double result = Math.sqrt(s.length());
        System.out.println("squrt is " + result);
        int length = s.length();
        int rows = ((int) Math.floor(result)) ;
        int columns = ((int) Math.ceil(result));
        if(rows * columns < length){
            rows += 1;
        }
        System.out.println("rows are "+rows);
        System.out.println("columns are "+columns);


        char[][] array = new char[rows][columns];

        int index = 0;
        for(int i = 0 ; i < rows; i++) {
            for (int j = 0 ; j < columns; j++) {
                if(index < s.length()) {

                    array[i][j] = s.charAt(index);
                    index += 1;
                }
            }
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                if (array[j][i] >= ' ' && array[j][i] <= '~') {
                    // The character is a valid printable ASCII character
                    resultString += array[j][i];
                }                                        ;

            }
            resultString += " ";
        }
//               x = [['ifmanwas',"meanttos", "tayonthe", "groundgo", "dwouldha", "vegivenu", "sroots**" ]]

        System.out.println("--------------");
        System.out.println(resultString);
        System.out.println("******************");

        print2dArray(array);
        return resultString;
    }

    public static void print2dArray(char[][] array) {
        for(int i = 0 ; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static String removeSpaces(String s) {
        String k = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                k += s.charAt(i);
            }
        }
        return k;
    }

    public static void main(String args[]) {
//                encryption("if man was meant to stay on the ground god would have given us roots");
        encryption("chillout");
    }


}