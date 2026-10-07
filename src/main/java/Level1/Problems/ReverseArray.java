package Level1.Problems;

import java.util.Arrays;

public class ReverseArray {
    /*START
    Create/read an array

    Set left = first index
    Set right = last index

    WHILE left < right
        Swap array[left] and array[right]
        Move left forward
        Move right backward
    END WHILE

    Print the array
    STOP
*/
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int left=0;
        int right = arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
