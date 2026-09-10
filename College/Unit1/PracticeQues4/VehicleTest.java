package College.Unit1.PracticeQues4;

class Vehicle{
    protected String brand;
    protected int speed;

    public Vehicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle{
    private int doors;
    public Car(String brand,int speed,int doors){
        super(brand,speed);
        this.doors = doors;
    }


    public void Display(){
        System.out.println("Brand : " + brand);
        System.out.println("Speed : "+ speed);
        System.out.println("Number of doors :" + doors);
    }
}


public class VehicleTest {
    public static void main(String[] args) {

        Car c = new Car("Toyota", 180, 4);

        c.Display();
    }
}
