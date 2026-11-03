package Level2.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    /* sort the array

for i = 0 to arr.length - 3:
    if i > 0 and arr[i] == arr[i-1]:
        continue

    left = i + 1
    right = arr.length - 1

    while left < right:
        sum = arr[i] + arr[left] + arr[right]

        if sum == 0:
            store the triplet
            left++
            right--

            skip duplicate left and right values

        else if sum < 0:
            left++

        else:
            right-- 
            
    */
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<List<Integer>> result = new ArrayList();
        for(int i =0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int left = i+1;
            int right = arr.length-1;
            while (left<right) {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum ==0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left] ==arr[left-1]) {
                        left++;
                    }
                    while (left<right && arr[right]==arr[right+1]) {
                        right--;
                    }
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.println(result);
    }
    
}
