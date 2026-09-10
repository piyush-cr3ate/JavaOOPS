package College.Unit1;

import java.lang.Exception;
public class MainException {
    public static void main(String[] args) {
        int a[]=new int[4];
        try
        {
            a[0]=12/0;
            System.out.println(a[6]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Aritmetic Exception"+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bound"+e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Finally block executed");
        }
        System.out.println("outside Finally block executed");
    }
}