package Level2.Problems;

import java.util.Arrays;

public class TwoSumII {
    /*
   only works on sorted array
    left = 0
right = array length - 1

while left < right:
    sum = array[left] + array[right]

    if sum == target:
        return the two positions
    else if sum < target:
        move left forward
    else:
        move right backward
        */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTwoSum(new int[]{2, 7, 11, 15}, 9)));
    }
    public static int[] findTwoSum(int[] arr,int target) {
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[]{left,right};
            }else if(sum < target){
                left++;
            }else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
