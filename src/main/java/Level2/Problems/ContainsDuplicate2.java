package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    /*Create an empty HashMap to store number → index

FOR each index i in the array
    IF the map contains arr[i]
        IF i - stored index <= k
            Return true
        END IF
    END IF

    Store arr[i] → i in the map
END FOR

Return false
*/
    public static void main(String[] args) {
        System.out.println(isDuplicate(new int[]{1, 2, 3, 1},3));
    }
    public static boolean isDuplicate(int[] arr , int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                if(i - map.get(arr[i])<=k){
                    return true;
                }
            }else {
                map.put(arr[i],i);
            }
            map.put(arr[i],i);
        }
        return false;
    }
}
