import java.util.Scanner;
public class RepetationsOfK
{
    public static void main(String args[])
    {
       
        Scanner s = new Scanner(System.in);
       
        int n=s.nextInt();
        int k=s.nextInt();
        int count=0;
        int a[]=new int[10];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                count=count+1;
            }
        }
        System.out.println(count);
     
    }
}
