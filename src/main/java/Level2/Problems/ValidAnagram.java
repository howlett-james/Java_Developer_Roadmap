package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")?"Yes":"No");
        System.out.println(isAnagram("car", "cat")?"Yes":"No");
    }
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;

        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : t.toCharArray()){
            if(map.containsKey(c) && map.get(c)>0){
                map.put(c, map.get(c)-1);
            }else{
                return false;
            }
        }
        return true;
    }    
}