package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class MaxFreqCount {
    /*Create a HashMap to count frequencies

FOR each number in the array
    Increase and store its frequency
END FOR

Set maxFrequency to 0

FOR each entry in the map
    IF its frequency is greater than maxFrequency
        Update maxFrequency
        Store its number as mostFrequent
    END IF
END FOR

Print mostFrequent*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            int count = map.getOrDefault(a,0);
            map.put(a,count+1);
        }
        int maxFreq = 0;
        int mostFreq =0;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()>maxFreq){
                maxFreq = m.getValue();
                mostFreq = m.getKey();
            }
        }
        System.out.println(mostFreq);
    }
}
