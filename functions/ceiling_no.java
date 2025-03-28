import java.util.*;

//ceiling of no is finding the smallest no which is greater than or equal to target no

public class Main {
    public static void main(String[] args) {
       int[] a={2,3,5,9,14,16,18};
       int target=15;
       int ans=ceiling(a,target);
       System.out.println(ans);
    }
    
    //If target is not found start becomes greater than end so, index of start is smallest greater no than target
    static int ceiling(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
