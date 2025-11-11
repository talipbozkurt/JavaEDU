package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][2];

        int[][] arr2 = {
                {3, 4, 5},
                {6, 7, 8},
                {9, 10, 11}
        };

        // input

        int[][] arr3 = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf(" arr3[%d][%d] : ", i, j);
                arr3[i][j] = input.nextInt();

            }

        }

        // Output

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr3[i][j] + " ");

            }
            System.out.println();

        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");

            }
            System.out.println();

        }


        // Second method
        System.out.println(Arrays.deepToString(arr3));
    }


}
