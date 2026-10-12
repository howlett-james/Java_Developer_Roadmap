package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    /*Create an empty HashMap

FOR each number in the array
    Get its current count, defaulting to 0
    Increase and store its count
END FOR

FOR each entry in the map
    IF its count is greater than 1
        Print its number
    END IF
END FOR
*/
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = {1, 2, 2, 3, 1, 4};
        for (int a : arr){
            int count = map.getOrDefault(a,0);
            map.put(a,map.getOrDefault(a,count)+1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()>1){
                System.out.println(m.getKey());
            }
        }
    }
}
