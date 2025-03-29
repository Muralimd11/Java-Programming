import java.util.*;

public class Main {
    public static void main(String[] args) {
        //original array={2,3,6,12,15,18};
       int[] a={15,18,2,3,6,12};
       int ans=search(a);
       System.out.println(ans);
    }
    static int search(int[] nums) {
        int pivot=pivot_index(nums);
        return pivot+1;
    }
    static int pivot_index(int[] nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            else if(nums[start]>nums[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
