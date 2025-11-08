package ConditionalsAndLoops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Enter 3 integers separated by space : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = num3;

        if (max <= num1) {
            max = num1;
        }

        if (max <= num2) {
            max = num2;
        }

        System.out.println("Max number : " + max);
    }
}
