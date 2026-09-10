package College.Unit2;

import java.util.ArrayList;

public class CollectionBasic {
    static void main() {
        System.out.println("Collection in Java");
        ArrayList<String> student = new ArrayList<>();
        student.add("Frnd1");
        student.add("Frnd2");
        student.add("Frnd3");
        student.add("Frnd4");
        System.out.println("Student list is " + student);


        //display name one by one
        for (String name:student){
            System.out.println("My name is " + name);
        }
    }
}
