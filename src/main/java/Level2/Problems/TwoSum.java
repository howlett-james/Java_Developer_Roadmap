package Level2.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        
    }
    public static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int needed = target-arr[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[]{-1,-2};
    }
}
