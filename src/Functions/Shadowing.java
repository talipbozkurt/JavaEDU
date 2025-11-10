package Functions;

public class Shadowing {

    static int x = 200; // this will be shadowed at line 11

    public static void main(String[] args) {

        System.out.println(x); // 200

        int x;
        //System.out.println(x); scope will begin when value is initialized
        x = 100;
        System.out.println(x); // 100

        fun(x);

    }


    static void fun(int a) {
        System.out.println(x);

    }
}
