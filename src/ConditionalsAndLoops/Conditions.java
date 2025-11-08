package ConditionalsAndLoops;

public class Conditions {
    public static void main(String[] args) {



        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("Minor");
        }


        int score = 85;

        if (score >= 90) {
            System.out.println("A grade");
        } else if (score >= 80) {
            System.out.println("B grade");
        } else {
            System.out.println("C grade");
        }

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");

                String result = switch (day) {
                    case 1 -> "Monday";
                    case 2 -> "Tuesday";
                    default -> "Invalid";
                };

        }


    }
}
