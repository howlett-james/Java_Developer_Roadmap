package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    /*IF the strings have different lengths
    Return false
END IF

Create a HashMap to count characters in the first string

FOR each character in the second string
    IF the character is missing or its count is 0
        Return false
    END IF
    Decrease its count by 1
END FOR

Return true
*/
    public static void main(String[] args) {

    }
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0;i<str1.length();i++){
            int count = map.getOrDefault(str1.charAt(i),0);
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i),count)+1);
        }
        for(int i =0;i<str2.length();i++){
            if(!map.containsKey(str2.charAt(i)) || map.get(str2.charAt(i))==0){
                return false;
            }else {
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            }
        }

        return true;
    }
}
