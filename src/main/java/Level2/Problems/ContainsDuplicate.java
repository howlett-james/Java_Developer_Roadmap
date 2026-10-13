package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    /*
    * Create an empty HashSet

FOR each number in the array
    IF the set already contains the number
        Return true
    END IF
    Add the number to the set
END FOR

Return false*/
    public static void main(String[] args) {
        System.out.println(isDuplicate(new int[]{1, 2, 3, 1}) ? "Found" : "Not Found");
    }

    public static boolean isDuplicate(int... arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                return true;
            }else {
                map.put(arr[i],i);
            }
        }
        return false;
    }
}
