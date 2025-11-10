package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 30;
        int b = 10;

        {
            //int b=100 giving error, b is already initialized

            a = 100; // reassign the original value
            System.out.println(a);
            int c = 20;
        }

        int c = 29;

        System.out.println(a);

        // scoping in for loops
        for (int i = 0; i < 10; i++) {
        }
        // System.out.println(i); giving error

    }
}
