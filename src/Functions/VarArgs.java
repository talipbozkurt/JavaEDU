package Functions;


import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 56, 78, 998);

        greet("Halil", "Ahmet", "Zeynep", "Melih");

        multiple(5, 6, 8, 9, 10, 11, 55);

    }

    static void multiple(int a, int b, int... c) {

        int sum = 0;

        for (int n : c) {
            sum = a + b + n;
        }
        System.out.println(sum);
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void greet(String... names) {
        for (String name : names) {
            System.out.println("Hello " + name + "!");
        }
    }
}
