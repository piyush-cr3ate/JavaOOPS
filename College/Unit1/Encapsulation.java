package College.Unit1;

class Person {
    private String name; // private = restricted access


    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter
    public String getName() {
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("Abhishek"); // Set the value of the name variable to "Abhishek"
        System.out.println(myObj.getName());
    }
}
