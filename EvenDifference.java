import java.util.*;
public class EvenDifference
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int difference=num1-num2;
        if(difference%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
