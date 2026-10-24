package Level2.Problems;

import java.util.Arrays;

public class ReverseArray {
    /* 
    left = 0
right = array.length - 1

while left < right:
 swap arr[left] and arr[right]
 left++
 right--

return array */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5})));
    }
    public static int[] reverseArray(int[] arr){
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        return arr;
    }
    
}
