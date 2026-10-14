package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /*
    * Create a HashMap to count each number's frequency

FOR each number in the array
    Increase and store its frequency
    IF its frequency is greater than array length / 2
        Return that number
    END IF
END FOR
* */
    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{3, 2, 3}));
    }
    public static int findMajorityElement(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            int count = map.getOrDefault(arr[i],0);
            map.put(arr[i],map.getOrDefault(arr[i],count)+1);
            if(map.get(arr[i])>arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
}
