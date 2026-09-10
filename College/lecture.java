package College;

class Calculator{
    int num1 = 10;
    int num2 = 2;

    void add(){
        int addition = num1 + num2;
        System.out.println("Addition is : "+addition);
    }

    void div(){
        int div = num1/num2;
        System.out.println("Divivsion is : "+div);

    }
}

public class lecture {

    static void main(String[] args) {

        Calculator obj = new Calculator();

        obj.add();
        obj.div();
    }
}
