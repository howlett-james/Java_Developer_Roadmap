package Level2.Problems;

import java.util.*;

public class TopKFreqEle {
    /*Count the frequency of each number using a HashMap

    Sort the numbers by frequency in descending order

    Return the first k numbers*/
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 2, 2, 1};
        int k = 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            int count = map.getOrDefault(j, 0);
            map.put(j, map.getOrDefault(j, count) + 1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
//        list.sort((a,b)-> b.getValue()-a.getValue());
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(list.get(i).getKey());
        }
        System.out.println(res);
    }
}
