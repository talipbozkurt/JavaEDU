package ConditionalsAndLoops;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = in.nextInt();
        int temp = 1;
        int newn = 0;
        while (number > 0) {
            temp = number % 10;
            newn = newn * 10 + temp;
            number = number / 10;

        }

        System.out.println(newn);
    }
}
