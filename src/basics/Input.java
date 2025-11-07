package basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("What's your age ?");
        int age = input.nextInt();
        input.nextLine(); // dummy read — cleans Enter



        System.out.println("Enter your name: ");
        String name = input.nextLine(); // reads all lines


        System.out.println("You are " + age + " years old and your name  is " + name + ".");

        System.out.println("Enter two integers separated by space: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Product = " + (a * b));

        System.out.println("Enter a character: ");
        char c = input.next().charAt(0); // takes first character

        System.out.println("You entered: " + c);
        input.close();

    }
}
