import java.util.*;

public class Main {
    public static void main(String[] args) {
       int[][] a={
           {1,2,3,4},
           {5,6,7,8},
           {9,10,11,12},
           {13,14,15,16}
       };
       int target=6;
       
       System.out.println(Arrays.toString(search(a,target)));
    }
    
    static int[] search(int[][] nums, int target) {
        int rows=nums.length;
        int cols=nums[0].length;
        
        int rstart=0;
        int rend=rows-1;
        int cmid=(cols-1)/2;
        while(rstart<(rend-1))
        {
            int mid=rstart+(rend-rstart)/2;
            if(nums[mid][cmid]==target)
            {
                return new int[]{mid,cmid};
            }
            if(nums[mid][cmid]>target)
            {
                rend=mid;
            }
            else
            {
                rstart=mid;
            }
        }
        if(nums[rstart][cmid]==target)
        {
            return new int[]{rstart,cmid};
        }
        if(nums[rstart+1][cmid]==target)
        {
            return new int[]{rstart+1,cmid};
        }
        
        if(nums[rstart][cmid-1]>=target)
        {
            return binarysearch(nums,target,rstart,0,cmid-1);
        }
        if(nums[rstart][cmid+1]<=target && target<=nums[rstart][cols-1])
        {
            return binarysearch(nums,target,rstart,cmid+1,cols-1);
        }
        if(target<=nums[rstart+1][cmid-1])
        {
            return binarysearch(nums,target,rstart+1,0,cmid-1);
        }
        else
        {
            return binarysearch(nums,target,rstart+1,cmid+1,cols-1);
        }
    }
    static int[] binarysearch(int[][] nums,int target,int row,int cstart,int cend)
    {
        while(cstart<=cend)
        {
            int mid=cstart+(cend-cstart)/2;
            if(nums[row][mid]==target)
            {
                return new int[]{row,mid};
            }
            if(nums[row][mid]>target)
            {
                cend=mid-1;
            }
            else
            {
                cstart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
