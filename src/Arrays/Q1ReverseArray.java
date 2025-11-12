package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q1ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf(" array[%d] : ", i);
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        array=reversed(array);
        System.out.println(Arrays.toString(array));

    }

    static int[] reversed(int[] arr) {

        int[] temp= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            temp[i] = arr[(arr.length-1) -i];


        }
        return temp;
    }
}
