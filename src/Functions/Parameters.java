import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1. sides of triangle ");
        int num1 = in.nextInt();

        System.out.println("Enter 2. sides of triangle ");
        int num2 = in.nextInt();

        System.out.println("Enter 3. sides of triangle ");
        int num3 = in.nextInt();

        int perimeter = perimeter(num1, num2, num3);

        System.out.println(perimeter);


    }

    static int perimeter(int a, int b, int c) {
        return a + b + c;
    }

}
