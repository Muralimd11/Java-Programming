import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[] a={2,4,6,9,11,12,14,20,36,48};
        int l=11;
        int ans=agnostic_binary_search(a,l);
        System.out.println("Found at index: " + ans);
    }
    static int agnostic_binary_search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            //If array in sorted in ascending order
            if(isAsc)
            {
                if(target>arr[mid])
                {
                    start=mid+1;
                }
                else if(target<arr[mid])
                {
                    end=mid-1;
                }
            }
            //If array is sorted in descending order
            else
            {
                if(target<arr[mid])
                {
                    start=mid+1;
                }
                else if(target>arr[mid])
                {
                    end=mid-1;
                }
            }
            
        }
        return -1;
    }
}
