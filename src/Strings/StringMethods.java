package Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = " Ali Desidero";
        System.out.println(Arrays.toString(name.toCharArray())); // [ , A, l, i,  , D, e, s, i, d, e, r, o]
        System.out.println(name.toLowerCase()); //  ali desidero
        System.out.println(name.indexOf('a')); // -1
        System.out.println("      Ali           ".strip()); // Ali
        System.out.println(Arrays.toString(name.split(" "))); // [, Ali, Desidero]
    }
}
