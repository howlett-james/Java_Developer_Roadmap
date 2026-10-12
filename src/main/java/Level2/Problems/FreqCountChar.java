package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class FreqCountChar {
    /*Create an empty HashMap

FOR each character in the string
    Get its current count, defaulting to 0
    Increase the count by 1
    Store the updated count
END FOR

Print the map
*/
    public static void main(String[] args) {
        char[] arr = "banana".toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : arr){
            int count = map.getOrDefault(c,0);
            map.put(c,map.getOrDefault(c,count)+1);
        }
        System.out.println(map.entrySet().stream().toList());
    }
}
