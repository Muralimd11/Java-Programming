import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=scan.nextInt();
        
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int a)
    {
        int c=2;
        if(a<=1)
        {
            return false;
        }
        while(c*c<=a)
        {
            if(a%c==0)
            {
                return false;
            }
            c++;
        }
        return c*c>a;
    }
}
