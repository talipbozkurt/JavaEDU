package ObjectOrientedProgramming;

public class StaticKeyword {
    public static void main(String[] args) {

        Human Mert = new Human(17,"Mert", 0,false);
        Human Mahmut = new Human(22,"Mahmut", 22000,true);

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}


class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;


    public Human(int age, String name, int salary,boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }
}