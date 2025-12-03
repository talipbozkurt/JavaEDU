package ObjectOrientedProgramming;

public class FinalKeyword {
    public static void main(String[] args) {

        final int age = 20;
        // age = 30;  error

        final Studenttt s = new Studenttt("Talip");
        //s = new Studenttt("Ahmet");   // ❌  reference don't change
         s.name = "Mehmet";          // ✔ object values change, final but not immutable

        String str = "Talip";
        str.toUpperCase();   // old String don't change → immutable





    }
}


class Studenttt {
    String name ;

    Studenttt(String name){
        this.name=name;
    }


    final void test() { }
}

class b extends Studenttt {

    b(String name) {
        super(name);
    }
    // void test() { } // ❌ can't override

}