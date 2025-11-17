package Strings;

public class Q1PalindromeString {
    public static void main(String[] args) {

        String pall = "abcdedcba";
        sollution(pall);
    }

    static void sollution(String pall) {

        pall = pall.toLowerCase();
        for (int i = 0; i < pall.length() / 2; i++) {
            char start = pall.charAt(i);
            char end = pall.charAt(pall.length() - 1 - i);

            if (start != end) {
                System.out.println(pall + " isn't palindrome");
                return;
            }

        }
        System.out.println(pall + " is palindrome");

    }
}
