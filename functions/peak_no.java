import java.util.*;

public class Main {
    public static void main(String[] args) {
       int[] a={2,3,5,7,6,4,2,1};
       int ans=findPeakElement(a);
       System.out.println(ans);
    }
    //Array will increase till peak no and decrease after that in sorted arrangement
    static int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return end;
    }
}
