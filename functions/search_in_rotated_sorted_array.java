import java.util.*;

public class Main {
    public static void main(String[] args) {
        //original array={2,3,6,12,15,18};
       int[] a={15,18,2,3,6,12};
       int target=2;
       int ans=search(a,target);
       System.out.println(ans);
    }
    static int search(int[] nums, int target) {
        int pivot=find_pivot(nums);
        if(pivot==-1)
        {
            return binarysearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target)
        {
            return pivot;
        }
        if(target>=nums[0])
        {
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }
    static int find_pivot(int[] nums)
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
            if(mid>start && nums[mid-1]>nums[mid])
            {
                return mid-1;
            }
            if(nums[start]>nums[mid])
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
    static int binarysearch(int[] nums,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
