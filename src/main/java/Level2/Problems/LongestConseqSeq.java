package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class LongestConseqSeq {
    /* if nums is empty:
        return 0

    numSet = set of all values in nums
    longest = 0

    for each num in numSet:
        // Is this the start of a sequence?
        if (num - 1) is NOT in numSet:
            current = num
            length = 1

            while (current + 1) is in numSet:
                current = current + 1
                length = length + 1

            longest = max(longest, length) */
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        Map<Integer,Integer> map = new HashMap<>();
        int longest =0;
        for (int i = 0; i < arr.length; i++) {
            int count = map.getOrDefault(arr[i],0);
            map.put(arr[i], map.getOrDefault(arr[i],count)+1);
        }
        for(int num : arr){
            if(!map.containsKey(num -1)){//start count only if previous number is missing
                int current = num;
                int length = 1;
                while(map.containsKey(current +1)){//counting continue
                    current +=1;
                    length +=1;
                }
                longest = Math.max(longest, length);
            }
        }
        System.out.println(longest);
    }    
}
