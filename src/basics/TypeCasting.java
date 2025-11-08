package basics;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 42;
        int i = b;           // Widening (byte → int)
        double d = i;        // Widening (int → double)
        System.out.println("Automatic: " + d); // 42.0

        double x = 9.997;
        int y = (int) x;     // Narrowing (double → int)
        System.out.println("Manual: " + y); // 9

        char c = 'A';
        int code = c;        // char → int (Unicode)
        System.out.println("Char code: " + code); // 65

        int num = 66;
        char letter = (char) num; // int → char
        System.out.println("Int to char: " + letter); // B

        int k = 257;
        byte l = (byte) (k);
        System.out.println(l); // 257 % 256 = 1


        byte m = 50;
        byte n = 20;
        // m = m * 2;
        m = (byte) (m * 2);
        m *= 2; // no error , implicit / narrowing cast

        // byte sum = m+n ;
        int sum = m + n; // Type promotion
    }
}
