import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=scan.nextInt();
        int[] num=new int[n];
        int i;
        System.out.println("Enter array nums: ");
        for(i=0;i<5;i++)
        {
            num[i]=scan.nextInt();
        }
        reverse(num,n);
        System.out.println(Arrays.toString(num)); 
        //It prints array as a string with commas and brackets
        
    }
    static void reverse(int[] a,int n)
    {
        //It is like swapping first element with last , second element with second last element ...
        int i=0;
        int j=n-1;
        while(i<j)
        {
            swap(a,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
