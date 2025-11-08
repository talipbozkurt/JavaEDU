package ConditionalsAndLoops;

import java.util.Scanner;

public class Lopps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println(i + 1);
        }

        int x = 0;

        while (x < 5) {
            {
                System.out.println(x + 1);
                x++;
            }

            do {
                System.out.println(x + 1);
                x++;
            } while (x < 5);
        }
    }
}
