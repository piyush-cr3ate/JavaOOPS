package College.Unit1;

interface Employ {

    void EmpInfo();
}

interface EmpSalary {

    void SalaryInfo();
}

public class MultiInheritenceEx implements Employ, EmpSalary {

    String name;
    int age;
    double salary;

    // Constructor
    MultiInheritenceEx(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
//Polymorphism in Java is a core Object-Oriented Programming (OOP) concept that allows a single entity (such as a method, interface, or object) to take on multiple forms.It enables cleaner, more flexible code by allowing you to perform a single action in different ways.
//Java achieves polymorphism through two main mechanisms: Method Overloading (Compile-Time Polymorphism) and Method Overriding (Runtime Polymorphism)

    @Override
    public void EmpInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }

    @Override
    public void SalaryInfo() {
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        MultiInheritenceEx obj =new MultiInheritenceEx("Ajay", 25, 23590.90);

        obj.EmpInfo();
        obj.SalaryInfo();
    }
}