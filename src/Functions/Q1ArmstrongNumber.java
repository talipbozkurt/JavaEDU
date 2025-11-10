package Functions;

import java.util.Scanner;

public class Q1ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int n = in.nextInt();

        armstrong(n);
    }

    static void armstrong(int a) {
        int temp , sum = 0, pow , orign = a;


         /* while (temp != 0) {
            temp /= 10;
            pow++;
        } */

        pow = String.valueOf(a).length();  // basamak sayısı

        while (a > 0) {
            temp = a % 10;
            a /= 10;
            sum += Math.pow(temp, pow);

        }
        if (orign == sum) {
            System.out.println(orign + " is amstrong number");

        } else {
            System.out.println(orign + " isn't amstrong number");
        }

    }
}