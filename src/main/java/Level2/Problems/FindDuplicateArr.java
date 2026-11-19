package Level2.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>1){
                list.add(e.getKey());
            }
        }
        System.out.println(list);
    }
}
