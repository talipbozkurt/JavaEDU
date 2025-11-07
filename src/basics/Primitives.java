package basics;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        // 1. Integer Types
        byte b = 100;
        short s = 20000;
        int i = 1_000_000; // _ for readable
        long l = 10_000_000_000L; // 'L' must

        // 2. Float Types
        float f = 3.14f; // 'f' must
        double d = 3.141592653589793;

        // 3. Characters and boolean
        char c = 'A';
        boolean isJavaFun = true;


        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + isJavaFun);

        // numerical value of the character
        System.out.println("ASCII of '" + c + "' = " + (int) c);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers separated by space: ");
        int int1 = input.nextInt();
        int int2 = input.nextInt();

        int sum = int1 + int2;

        System.out.println("Sum : " + sum);


    }
}
