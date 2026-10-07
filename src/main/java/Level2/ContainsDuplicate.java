package Level2;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 4, 5};
        System.out.println(new ContainsDuplicate().isDuplicateContains(arr));
    }
    public boolean isDuplicateContains(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                return true;
            }else {
                map.put(arr[i],i);
            }
        }
        return false;
    }
}
