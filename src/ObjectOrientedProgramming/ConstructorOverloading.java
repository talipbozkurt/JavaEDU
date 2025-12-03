package ObjectOrientedProgramming;

public class ConstructorOverloading {
    public static void main(String[] args) {

        Student S1 = new Student();
        Student S2 = new Student(99);
        Student S3 = new Student(100, "Mert");

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);

    }
}

class Student {

    int id;
    String name;

    public String toString() {
        return "Öğrenci [ID=" + id + ", İsim=" + name + "]";
    }

    Student() {
        this.id = 0;
        this.name = "Unknown";
    }

    Student(int id) {
        this.id = id;
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

}