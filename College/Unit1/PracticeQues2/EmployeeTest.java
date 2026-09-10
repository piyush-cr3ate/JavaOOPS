package College.Unit1.PracticeQues2;

class Employee{

    private String name;
    private int Id;
    private double salary;
    private String department;

    public static int employeeCount = 0;
    public static final String companyName = "Microsoft";

    public Employee(String name,int Id,double salary,String department){
        this.name = name;
        this.Id = Id;
        this.salary = salary;
        this.department = department;

        employeeCount++;
    }


    //Getters
    public String getName(){
        return name;
    }
    public int getId(){
        return Id;
    }
    public double getSalary(){
        return salary;
    }
    public String getDepartment(){
        return department;
    }


    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setDepartment(String department){
        this.department = department;
    }

}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 101, 45000, "IT");
        Employee e2 = new Employee("Neha", 102, 55000, "HR");
        System.out.println(e1.getName());
        System.out.println("Salary: " + e2.getSalary());
        System.out.println("Company: " + Employee.companyName);
        System.out.println("Total Employees: " + Employee.employeeCount);
    }
}