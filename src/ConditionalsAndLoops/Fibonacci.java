package ConditionalsAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = in.nextInt();

        int temp = 1;
        int next = 0;
        int fibo = 1;


        for (int i = 2; i <= n; i++) {

            temp = fibo;
            fibo += next;
            next = temp;

        }

        System.out.println(fibo);
    }
}
