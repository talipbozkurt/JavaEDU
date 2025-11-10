package Functions;

import java.util.Scanner;

public class PrintAllAmstrongs {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of digits for Armstrong numbers: ");
        int n = in.nextInt();

        int count = countArmstrongNumbers(n);
        System.out.println("Total Armstrong numbers with " + n + " digits: " + count);

        in.close();
    }

    static int countArmstrongNumbers(int n) {
        int count = 0;
        int start = (int) Math.pow(10, n - 1);
        int end = (int) Math.pow(10, n);

        // (0–9)
        if (n == 1) start = 0;

        for (int i = start; i < end; i++) {
            if (isArmstrong(i, n)) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    static boolean isArmstrong(int num, int n) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        return sum == original;
    }
}
