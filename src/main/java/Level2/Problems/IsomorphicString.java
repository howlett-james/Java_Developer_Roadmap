package Level2.Problems;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        System.out.println(checkIsomorphicString("foo", "bar")?"Yes":"No");
        System.out.println(checkIsomorphicString("egg", "add")?"Yes":"No");
    }
    public static boolean checkIsomorphicString(String s, String t){
        if(s.length()!=t.length()) return false;
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        char[] charArr1 = s.toCharArray();
        char[] charArr2 = t.toCharArray();
        for(int i =0;i<charArr1.length;i++){
            if(!map1.containsKey(charArr1[i])){
                map1.put(charArr1[i], charArr2[i]);
            }
            if(!map1.get(charArr1[i]).equals(charArr2[i])){
                return false;
            }
            if(!map2.containsKey(charArr2[i])){
                map2.put(charArr2[i], charArr1[i]);
            }
            if(!map2.get(charArr2[i]).equals(charArr1[i])){
                return false;
            }
        }
        return true;
    }
}
