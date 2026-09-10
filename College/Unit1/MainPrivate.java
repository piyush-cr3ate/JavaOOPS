package College.Unit1;

class StudentDetails{
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}

public class MainPrivate {
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails();
        // student.setAge(12);
        student.setName("John Doe");
        System.out.println("Name: " + student.getName());
        // System.out.println("Age: " + student.getAge());
        // student.name = "John Doe";
        // student.age = 20;
        // student.displayDetails();

    }

}
