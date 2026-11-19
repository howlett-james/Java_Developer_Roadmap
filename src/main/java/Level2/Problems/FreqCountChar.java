package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class FreqCountChar {
    public static void main(String[] args) {
        String s = "banana";
        char[] charArr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : charArr){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        System.out.println(map);
    }
}
