package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class FreqCountNum {
    /*Create an empty HashMap

FOR each number in the array
    Get its current count, defaulting to 0
    Increase the count by 1
    Store the updated count in the map
END FOR

Print the map
*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            int count = map.getOrDefault(a,0);
            map.put(a, map.getOrDefault(a, count) + 1);
        }
        System.out.println(map.entrySet().stream().toList());
    }
}
