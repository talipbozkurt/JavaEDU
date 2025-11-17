package Strings;

public class StringUsage {
    public static void main(String[] args) {
        String name = "Mike";
        String name2 = "Mike";
        System.out.println(name == name2); // true

        String name3 = "Mentzer";
        String name4 = new String("Mentzer") ;// “name4 is a heap reference, not a s. pool reference.”
        System.out.println(name2 == name4); // false
        System.out.println(name3.equals(name4)); // false

        String intern = name4.intern(); // now name4 is a pool reference
        System.out.println(name2 == name4); // true


        System.out.println(name3 == name4); // true
        System.out.println(name3.equals(name3)); // true

        System.out.println(name3.charAt(0)); // M


    }

}

