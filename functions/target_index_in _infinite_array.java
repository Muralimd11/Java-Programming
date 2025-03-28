import java.util.*;

public class Main {
    public static void main(String[] args) {
       int[] a={2,3,5,7,9,14,16,18,20,31,46,58};
       int target=7;
       int ans=range(a,target);
       System.out.println(ans);
    }
    //Without using arr.length when we don't know size
    static int range(int[] nums, int target) {
        int start=0;
        int end=1;
        while(target>nums[end])
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
       return binarysearch(nums,target,start,end);
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
