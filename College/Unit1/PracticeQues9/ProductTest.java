package College.Unit1.PracticeQues9;

public class ProductTest{
    static class Product{
        String name;
        double price;
        String category;

        public Product(String name){
            this.name = name;
            this.price = 0;
            this.category = "General";
        }
        public Product(String name,double price,String category){
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public void display(){
            System.out.println("Name: " + name + ", Price: " + price + ", Category: " + category);
        }

        static void main() {

            Product p1 = new Product("Notebook");
            Product p2 = new Product("Laptop",55000,"Electronics");

            p1.display();
            p2.display();
        }
    }

}
