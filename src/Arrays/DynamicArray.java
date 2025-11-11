package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(1);

        System.out.println("Enter the size of List");
        int n = input.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.printf(" %d index : ", i);
            list.add(input.nextInt());
        }


        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i)); // print list

        }

        System.out.println(list);

        list.set(0, 70);
        System.out.println(list);
        list.remove(list.size() - 1);
        System.out.println(list);


    }
}
