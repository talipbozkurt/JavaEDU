package ObjectOrientedProgramming;


public class NewKeyword {
    public static void main(String[] args) {
        Studentt s = new Studentt();


        // creating object without new
        // 1-) Reflection
        //Student S = Student.class.getDeclaredConstructor().newInstance();

        // 2-) Cloning
        //Student s2 = (Student) s.clone();


        // 3-) Serialization
        // ObjectInputStream in = new ObjectInputStream(...);
        // Student s3 = (Student) in.readObject();

        Student s1 = new Student(); // new object
        Student s2 = s1;            // just copy of reference



    }
}

class Studentt {


}