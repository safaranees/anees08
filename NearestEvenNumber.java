import java.util.Scanner;
public class NearestEvenNumber
{
    public static void main(String args[])
    {
       
        Scanner s = new Scanner(System.in);
       
        int num=s.nextInt();
        if(num%2!=0)
        {
            int num1=num-1;
            if(num1%2==0)
            {
                System.out.println(num1);
            }
        }
        else
        {
            System.out.println(num);
        }
        
     
    }
}
