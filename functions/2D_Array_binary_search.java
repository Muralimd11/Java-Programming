import java.util.*;

//Matrix sorted in row wise and column wise
public class Main {
    public static void main(String[] args) {
       int[][] a={
           {10,20,31,40},
           {14,24,36,44},
           {19,29,37,56},
           {32,45,63,75}
       };
       int target=37;
       
       System.out.println(Arrays.toString(search(a,target)));
    }
    static int[] search(int[][] nums, int target) {
        int row=0;
        int col=nums[0].length-1;
        while(row<nums.length && col>=0)
        {
            if(target==nums[row][col])
            {
                return new int[]{row,col};
            }
            if(target<nums[row][col])
            {
                col--;
            }
            if(target>nums[row][col])
            {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
