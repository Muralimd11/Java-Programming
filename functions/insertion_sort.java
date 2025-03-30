import java.util.*;

public class Main {
    public static void main(String[] args) {
       int[] a={3,5,1,4,2};
       
       System.out.println(Arrays.toString(insertion_sort(a)));
    }
    static int[] insertion_sort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    swap(a,j,j-1);
                }
                else if(a[j]>a[j-1])
                {
                    break;
                }
            }
        }
        return a;
    }
    static void swap(int[] a,int first,int last)
    {
        int temp=a[first];
        a[first]=a[last];
        a[last]=temp;
    }
    
}
