package Level2.Problems;

import java.util.*;

public class GroupAnagrams {
    /*
    * Create a HashMap where:
    key = sorted word
    value = list of words with that key

FOR each word
    Sort its characters to create a key
    Add the word to the list for that key
END FOR

Return all grouped lists*/
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<Object, List<String>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char[] chars = arr[i].toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if(map.containsKey(s)){
                map.get(s).add(arr[i]);
            }else {
                List<String> list = new ArrayList<>();
                list.add(arr[i]);
                map.put(s,list);
            }
        }
        System.out.println(new ArrayList<>(map.values()));
    }
}
