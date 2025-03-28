import java.util.*;

//flooring of no is finding the greater no which is smaller than or equal to target no

public class Main {
    public static void main(String[] args) {
       int[] a={2,3,5,9,14,16,18};
       int target=15;
       int ans=flooring(a,target);
       System.out.println(ans);
    }
    
    //If target is not found start becomes greater than end so, index of end is  greatest smaller no than target
    static int flooring(int[] arr,int target)
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
        return arr[end];
    }
}
