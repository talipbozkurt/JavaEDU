package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ros; // declaration of an array, ros is getting defined in stack.
        ros = new int[5]; // initialization :actually here an object is being created.in the heap memory

        ros[0] = 5;
        ros[1] = 58;
        ros[2] = 57;
        ros[3] = 57;
        ros[4] = 56;

        System.out.println(ros[4]);
        System.out.println(Arrays.toString(ros));

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Enter " + i + ". index of array");
            int n = input.nextInt();
            arr[i] = n;

        }

        System.out.println(Arrays.toString(arr));

    }
}
