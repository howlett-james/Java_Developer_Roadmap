package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    /*
    * Create a HashMap to count each character's frequency

FOR each character in the string
    Increase and store its frequency
END FOR

FOR each index i in the string
    IF the frequency of character at i is 1
        Return i
    END IF
END FOR

Return -1*/

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("leetcode"));
    }
    public static int firstUniqueChar(String s){
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            int count = map.getOrDefault(c, 0);
            map.put(c, map.getOrDefault(c, count) + 1);
        }
        for(int i =0;i<arr.length;i++){
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
