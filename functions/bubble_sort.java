import java.util.*;

public class Main {
    public static void main(String[] args) {
       int[] a={3,5,1,4,2};
       
       System.out.println(Arrays.toString(bubble_sort(a)));
    }
    static int[] bubble_sort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            boolean swapped=false;
            for(int j=1;j<a.length-i;j++)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
            {
                break;
            }
        }
        return a;
    }
}
