package Level2.Problems;

import java.util.Arrays;

public class ShiftZeros {
    public static void main(String[] args) {
        int[] arr = {8, 0, 1, 0, 3, 12};
        int left =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
