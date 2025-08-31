import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.print(Arrays.toString(Selectionsort(arr)));
    }
    static int[] Selectionsort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int end = getMaxIndex(arr, arr.length - i);
            swap(arr, end, arr.length - i - 1);
        }
        return arr;
    }
    static int getMaxIndex(int[] arr, int n) {
        int max = arr[0];
        int position = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                position = i;
                max = arr[i];
            }
        }
        return position;
    }
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
