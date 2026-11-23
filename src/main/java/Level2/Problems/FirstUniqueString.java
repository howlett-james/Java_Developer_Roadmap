package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueString {
    public static void main(String[] args) {
        System.out.println(findUniqueChar("leetcode"));

    }
    public static int findUniqueChar(String s){
        Map<Character,Integer> map = new HashMap<>();
        char[] a = s.toCharArray();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int i =0;i<a.length;i++){
            if(map.containsKey(a[i]) && map.get(a[i])<=1){
                return i;
            }
        }
        return -1;
    }
}
