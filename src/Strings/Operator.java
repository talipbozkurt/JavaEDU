package Strings;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {


        /*
         String + String → concatenation, string is text type
         char + char = char is a numeric type
        */
        System.out.println('a' + 'b'); // 195
        System.out.println('a' + 3); // 100
        System.out.println((char) ('a' + 3)); // d
        System.out.println("a" + "b"); // ab

        System.out.println("a" + 1); // a1
        // integer will be converted to Integer that will call to.String()
        // this is the same as after a few steps: "a" + "1"

        System.out.println("Mairo" + new ArrayList<>()); // Mario[]
        System.out.println("Mairo" + Integer.valueOf(55)); // Mario55

        // System.out.println(new ArrayList<>() + Integer.valueOf(55)); // Error
    }
}
