package College.Unit1.PracticeQues10;

public class ShapeTest {

    static class Shape {
        public void area() {
            System.out.println("Area of shape is undefined.");
        }
    }

    static class Circle extends Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public void area() {
            double result = Math.PI * radius * radius;
            System.out.println("Circle Area: " + result);
        }
    }

    static class Rectangle extends Shape {
        double length;
        double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public void area() {
            double result = length * width;
            System.out.println("Rectangle Area: " + result);
        }
    }

    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(10, 5);
        s1.area();
        s2.area();
    }
}