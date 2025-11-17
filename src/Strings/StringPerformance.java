package Strings;

public class StringPerformance {
    public static void main(String[] args) {

        // creating new string every iteration, not effective
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;

        }
        System.out.println(series);


        // we use the same string again and again because of the StringBuilder

        StringBuilder series2 = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series2.append(ch);

        }
        System.out.println(series);
        System.out.println(series2.reverse());
    }

}


