import java.util.Scanner;
public class EvenProduct
{
    public static void main(String args[])
    {
       
        Scanner s = new Scanner(System.in);
       
        int num1=s.nextInt();
        int num2=s.nextInt();
        int product=num1*num2;
        if(product%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
        
     
    }
}
