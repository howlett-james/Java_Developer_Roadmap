package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    /* IF the strings have different lengths
 Return false
END IF
Create two HashMaps for mappings in both directions
FOR each index i
 IF s[i] already has a mapping
 IF its mapped character is not t[i]
 Return false
 END IF
 ELSE
 IF t[i] is already mapped to another character
 Return false
 END IF
 Store s[i] → t[i]
 Store t[i] → s[i]
 END IF
END FOR

Return true
     */
    public static void main(String[] args) {
        System.out.println(isIsomorphicStrings("egg","add") ?"Isomorphic Strings" : "Not Isomorphic Strings");
    }
    public static boolean isIsomorphicStrings(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        for(int i =0;i<s1.length()&& i<s2.length();i++){
            if(map1.containsKey(s1.charAt(i))) {
                if (map1.get(s1.charAt(i)) != s2.charAt(i)) {
                    return false;
                }
            }else if(map2.containsKey(s2.charAt(i))){
                if(map2.get(s2.charAt(i))!=s1.charAt(i)){
                    return false;
                }
            }else {
                map1.put(s1.charAt(i), s2.charAt(i));
                map2.put(s2.charAt(i), s1.charAt(i));
            }
        }
        return true;
    }
}
