package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class MostFreqNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};
        int mostFreq = 0;
        int elemnt = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>mostFreq){
                mostFreq = e.getValue();
                elemnt = e.getKey();
            }
        }
        System.out.println(elemnt);
    }
}
