package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class FreqCountArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
    }
}
