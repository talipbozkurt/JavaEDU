package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        greeting();

        int multiply = multiply();
        System.out.println(multiply);
    }


    static int multiply() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int num1 = in.nextInt();

        System.out.println("Enter number 2 : ");
        int num2 = in.nextInt();

        int multiply = num1 * num2;

        return multiply;
    }


    static void sum() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum : " + sum);


    }


    static void greeting() {
        System.out.println("Hello World");
    }
}
