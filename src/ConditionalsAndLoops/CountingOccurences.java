package ConditionalsAndLoops;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number and a digit separated by a space to find its frequency: ");
        long number = in.nextInt();
        int digit = in.nextInt();
        int count = 0;
        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }
            number = number / 10;
        }

        System.out.println(count);
    }
}
