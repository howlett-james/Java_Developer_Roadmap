package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*Create an empty HashMap to store number → index

FOR each index i in the array
    Calculate complement = target - arr[i]

    IF the map contains complement
        Return the complement's index and i
    END IF

    Store arr[i] → i in the map
END FOR*/
    public static void main(String[] args) {//need to fix
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int needed = target - arr[i];
            if(map.containsKey(needed)){
                System.out.println(map.get(needed));
            }else {
                map.put(arr[i],i);
            }
        }
    }
}
